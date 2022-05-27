package Tests;

import Pages.Alerts;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.Assert.*;

public class AlertTest extends Base{
    @Test
    void AlertTest(){
        Alerts alerts=homePage.Alerttesting("JavaScript Alerts");
        alerts.clicK_JSAlert();
        alerts.accept_JS_Alert();
        assertEquals("Not the same","You successfully clicked an alert",alerts.getresult());
    }
    @Test
    void Confirm_Alert(){
        Alerts alerts=homePage.Alerttesting("JavaScript Alerts");
        alerts.clicK_con_JSAlert();
        assertEquals("Not the same","I am a JS Confirm",alerts.gettext_JS_Alert());
        alerts.dismiss_JS_Alert();
        assertEquals("Not the same","You clicked: Cancel",alerts.getresult());
        alerts.clicK_con_JSAlert();
        alerts.accept_JS_Alert();
        assertEquals("Not the same","You clicked: Ok",alerts.getresult());

    }
    @Test
    void sendkey(){
        Alerts alerts=homePage.Alerttesting("JavaScript Alerts");
        alerts.clicK_txt_JSAlert();
        alerts.sendtext("Abdo");
        alerts.accept_JS_Alert();
        assertTrue("Not sameinput ",alerts.getresult().contains("Abdo"));

    }
}
