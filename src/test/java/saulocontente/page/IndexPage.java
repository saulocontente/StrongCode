package saulocontente.page;

import org.openqa.selenium.By;

import saulocontente.core.BasePage;
import saulocontente.core.DriverFactory;

public class IndexPage extends BasePage {

    public void openIndexPage() {
        dsl.openURLonDriver("http://automationpractice.com/index.php");
    }

    public void openLogin(){
        waitPresenceOfElement(By.xpath("//header//div/a[@class = 'login']"), 15).click();
    }

    public void doSignOut() {
        if(waitPresenceOfElement(By.xpath("//a[@class = 'logout']"), 5).isDisplayed() == true){
            waitPresenceOfElement(By.xpath("//a[@class = 'logout']"), 5).click();
        }
    }

}
