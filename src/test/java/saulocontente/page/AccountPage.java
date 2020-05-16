package saulocontente.page;

import org.openqa.selenium.By;

import saulocontente.core.BasePage;

public class AccountPage extends BasePage {
    public String accountName(){
        waitElement(By.xpath("//div[@class = 'container']//a[@class = 'account']/span"));
        return getText(By.xpath("//div[@class = 'container']//a[@class = 'account']/span"));
    }
}