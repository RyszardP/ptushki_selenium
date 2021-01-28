import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;

public class DefineBirdPage {
    WebDriver driver;

    public DefineBirdPage(WebDriver driver) {
        this.driver = driver;
    }

    private By sizeTab = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/ul/li[1]/a");
    private By sparrowOrLessRadioButton = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/div/div[1]/div/div[1]/input");
    private By moreThanSparrowLessThanThrush = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/div/div[1]/div/div[2]/input");
    private By timePlaceTab = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/ul/li[2]/a");

    private By plumageTab = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/ul/li[3]/a");


    private By beakTab = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/ul/li[4]/a");

    private By otherTab = By.xpath("/html/body/div[1]/div[3]/div[1]/form/div/ul/li[5]/a");

    public void clickSizeTab(){
        driver.findElement(sizeTab).click();
    }

    public void setSparrowOrLess(){
        driver.findElement(sparrowOrLessRadioButton).click();
    }

   // List<WebElement> birdsList = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]")))

}
