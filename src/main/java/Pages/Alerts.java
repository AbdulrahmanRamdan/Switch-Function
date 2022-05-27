package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {
    private WebDriver driver;
    private WebElement element;
    private By JS_Alert=By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By Con_JS_Alert=By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By txt_JS_Alert=By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button");
    private By result=By.id("result");
    public Alerts(WebDriver driver){this.driver=driver;}
    private void getelemnet(By by){
        element=driver.findElement(by);
    }
    public void clicK_JSAlert(){
        getelemnet(JS_Alert);
        element.click();
    }
    public void clicK_con_JSAlert(){
        getelemnet(Con_JS_Alert);
        element.click();
    }
    public void clicK_txt_JSAlert(){
        getelemnet(txt_JS_Alert);
        element.click();
    }
    public void accept_JS_Alert(){
        driver.switchTo().alert().accept();
    }
    public void dismiss_JS_Alert(){
        driver.switchTo().alert().dismiss();
    }
    public String gettext_JS_Alert(){
       return driver.switchTo().alert().getText();
    }
    public void sendtext(String txt){
        driver.switchTo().alert().sendKeys(txt);
    }
    public String getresult(){
        return driver.findElement(result).getText();
    }

}
