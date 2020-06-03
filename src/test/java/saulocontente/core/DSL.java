package saulocontente.core;

import static saulocontente.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

    public void click(By by){
        getDriver().findElement(by).click();
    }

    public void clear(By by){
        getDriver().findElement(by).clear();
    }

    public String read(By by){
        return getDriver().findElement(by).getAttribute("value");
    }

    public String read(String idElement){
        return read(By.id(idElement));
    }

    public void write(By by, String string) {
        getDriver().findElement(by).sendKeys(string);
    }

    public void write(String idElement, String string){
        write(By.id(idElement), string);
    }

    public void waitElement(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitElement(String idElement){
        waitElement(By.id(idElement));
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(String id){
        return getText(By.id(id));
    }

}