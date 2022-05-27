package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Files {
    private By uploadfield=By.id("file-upload");
    private By uploadbutton=By.id("file-submit");
    private By uploadedfiles=By.id("uploaded-files");
    private WebDriver driver;
    public Files(WebDriver driver){this.driver=driver;};
    public void sendfile(String text){
        driver.findElement(uploadfield).sendKeys(text);
        driver.findElement(uploadbutton).click();
    }
    public String getfilename(){
        return driver.findElement(uploadedfiles).getText();
    }


}
