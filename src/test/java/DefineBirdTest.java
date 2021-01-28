import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DefineBirdTest {
    WebDriver driver;
    MainPage mainPage;
    AllBirdsPage allBirdsPage;
    DefineBirdPage defineBirdPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\IT\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ptushki.org/");
    }

    @Test
    public void findBirdSpecies() {
        mainPage.setOndropDownWildNature("Усе птушкі Беларусі");
        mainPage.clickOnAllBirds();
        allBirdsPage.clickDefineBird();
        defineBirdPage.clickSizeTab();
        defineBirdPage.setSparrowOrLess();
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(Bird.MOTACILLA_CINEREA));

    }

    @Test
    public void defineBirdsByFeature() {
        defineBirdPage.clickSizeTab();
        defineBirdPage.setSparrowOrLess();
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(Bird.MOTACILLA_CINEREA));
    }


}
