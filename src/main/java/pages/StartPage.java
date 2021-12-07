package pages;

import java.time.Duration;

public class StartPage extends BasePage{

    public LoginPage clickOnEnterButton(){
        findByXpath( "//button[@class='mega-button top-login-button']", Duration.ofSeconds(10) ).click();
      //  findByCss("div .top-login-button").click();
        return new LoginPage();
    }
}
