package saulocontente.core;

import static saulocontente.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

    public void click(By by){
        getDriver().findElement(by).click();
    }

    /*
    ============================Clear&Read&Write============================
        methods to Clear/Write/Read contents of elements on screen.
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
    

}