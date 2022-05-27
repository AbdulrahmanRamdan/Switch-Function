package Tests;

import Pages.Files;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Filestest extends Base{
    @Test
    void Uploadfiles(){
        Files files=homePage.uploadfile("File Upload");
        files.sendfile("C:\\Users\\ABDO\\Desktop\\11.jpg");
        Assert.assertTrue(files.getfilename().contains("11"));
    }
}
