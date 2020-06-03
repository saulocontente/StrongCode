package saulocontente.page;

import org.openqa.selenium.By;

import saulocontente.core.BasePage;

public class AccountPage extends BasePage {
    public String accountName(){
        return waitPresenceOfElement(By.xpath("//div[@class = 'container']//a[@class = 'account']/span"),15).getText();
    }
}