package saulocontente.page;


import org.openqa.selenium.By;

import saulocontente.core.BasePage;

public class LoginPage extends BasePage {
    
    public void setEmail(String string){
        waitPresenceOfElement("email", 15);
        writeToElement("email", string);
    }

	public void setPassword(String string) { 
        waitPresenceOfElement("passwd",5);
        writeToElement("passwd", string);
    }
    
    public void submitLogin(){
        waitPresenceOfElement("SubmitLogin", 5).click();
    }


    public String errorAlert(){
        return waitPresenceOfElement(By.xpath("//div[@id='center_column']/div[@class = 'alert alert-danger']//li"), 20).getText();
    }
}