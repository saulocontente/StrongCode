package saulocontente.core;

import static saulocontente.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

    public void click(By by){
        getDriver().findElement(by).click();
    }

    /*
    ============================Clear&Read&Write============================
        methods to Clear/Write/Read attribute value of/to elements on screen.
    */
    public void clear(By by){
        getDriver().findElement(by).clear();
    }
    public String read(By by){
        return getDriver().findElement(by).getAttribute("value");
    }
    public String read(String idElement){
        return read(By.id(idElement));
    }
    public void write(By by, String string){
        clear(by);
        getDriver().findElement(by).sendKeys(string);
    }
    public void write(String idElement, String string){
        write(By.id(idElement), string);
    }

    /*
    ============================Wait============================
        methods to Wait until an Element is present on screen.
    */
    public void waitElement(By by){
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void waitElement(String idElement){
        waitElement(By.id(idElement));
    }

    /*
    ============================get============================
        methods to get contents of an Element on screen.
    */
    public String getText(By by){
        return getDriver().findElement(by).getText();
    }
    public String getText(String id){
        return getText(By.id(id));
    }
}