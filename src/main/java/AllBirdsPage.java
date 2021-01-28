import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllBirdsPage {

    WebDriver driver;

    public AllBirdsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By findBird = By.xpath("//*[@id='birds_search_input']");
    private By buttonDefineBird = By.xpath("//*[@id='birds_search_btn']");

    public AllBirdsPage typeFindBirdSpecies(String bird){
        driver.findElement(findBird).sendKeys(bird);
        return this;
    }

    public void clickDefineBird(){
        driver.findElement(buttonDefineBird).click();
    }

}
