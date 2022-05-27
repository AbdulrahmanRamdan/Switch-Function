package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frame {
 private WebDriver driver;
 private By iframe=By.linkText("iFrame");
 private By textarea=By.id("tinymce");
 private By indr=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]/span");
 public Frame(WebDriver driver){
  this.driver=driver;
 }
 public void Click_Iframe(){
  driver.findElement(iframe).click();
 }
  void Switch_to_frame(){
  driver.switchTo().frame("mce_0_ifr");
 }
  void Switch_to_pframe(){
  driver.switchTo().parentFrame();
 }
 public void clickbutton(){
  driver.findElement(indr).click();
 }
 public void Cleartxtarea(){
  Switch_to_frame();
  driver.findElement(textarea).clear();
  Switch_to_pframe();
 }
 public void settxtarea(String txt){
  Switch_to_frame();
  driver.findElement(textarea).sendKeys(txt);
  Switch_to_pframe();
 }
 public String gettxtarea(){
  Switch_to_frame();
  String t=driver.findElement(textarea).getText();
  Switch_to_pframe();
  return t;
 }

}
