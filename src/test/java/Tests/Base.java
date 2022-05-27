package Tests;

import Pages.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Base {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    void BeforeAll(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDO\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }
    @AfterEach
    void AfterAll(){
       //driver.quit();
    }
}
