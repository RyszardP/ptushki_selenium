import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    By dropDownWildNature = By.xpath("//a[contains(text(),'ДЗІКАЯ ПРЫРОДА ПОБАЧ')]");
    String dropDownWildNatureOption = "//li[@id='menu-item-22798']/option[text()='%s']";
    By allBirds = By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/ul/li[1]/a");


    public void setOndropDownWildNature(String wildNature) {
        driver.findElement(dropDownWildNature).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(String.format(dropDownWildNatureOption, wildNature))));
    }

    public void clickOnAllBirds() {
        driver.findElement(allBirds).click();
    }

}
