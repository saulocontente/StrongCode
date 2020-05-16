package saulocontente.page;

import org.openqa.selenium.By;

import saulocontente.core.BasePage;
import saulocontente.core.DriverFactory;

public class IndexPage extends BasePage {

    public IndexPage(){
        DriverFactory.getDriver().get("http://automationpractice.com/index.php");
    }

    public void abrirLogin(){
        click(By.xpath("//header//div/a[@class = 'login']"));
    }
}
