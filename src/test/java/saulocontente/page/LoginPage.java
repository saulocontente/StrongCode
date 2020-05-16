package saulocontente.page;


import org.openqa.selenium.By;

import saulocontente.core.BasePage;

public class LoginPage extends BasePage {
    
    public void setEmail(String string){
        waitElement("email");
        write("email", string);
    }

	public void setPassword(String string) { 
        waitElement("passwd");    
        write("passwd", string);
    }
    
    public void submitLogin(){
        waitElement("SubmitLogin");
        click(By.id("SubmitLogin"));
    }


    public String errorAlert(){
        waitElement(By.xpath("//div[@id='center_column']/div[@class = 'alert alert-danger']//li"));
        return getText(By.xpath("//div[@id='center_column']/div[@class = 'alert alert-danger']//li"));
    }
}