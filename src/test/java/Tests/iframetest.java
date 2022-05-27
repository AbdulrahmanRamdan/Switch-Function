package Tests;

import Pages.Frame;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class iframetest extends Base{
    @Test
    void test_Iframe(){
        Frame frame=homePage.Frams("Frames");
        frame.Click_Iframe();
        frame.Cleartxtarea();
        frame.settxtarea("Abdo");
        frame.clickbutton();
        frame.settxtarea("Ramadan");
        System.out.println(frame.gettxtarea());

    }
}
