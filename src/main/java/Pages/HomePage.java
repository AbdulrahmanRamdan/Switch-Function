package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private WebElement element;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private void click(String TextLink){
        element=driver.findElement(By.linkText(TextLink));
        element.click();
    }
    public Alerts Alerttesting(String text){
        click(text);
        return new Alerts(driver);
    }
    public Files uploadfile(String text){
        click(text);
        return new Files(driver);
    }
    public Frame Frams(String text){
        click(text);
        return new Frame(driver);
    }

}
