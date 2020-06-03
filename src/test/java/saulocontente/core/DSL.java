package saulocontente.core;

import static saulocontente.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

    public void click(By by){
        getDriver().findElement(by).click();
    }

    public void clearElement(By by){
        getDriver().findElement(by).clear();
    }

    public String getValueOfElement(By by) {
        return getDriver().findElement(by).getAttribute("value");
    }

    public String getValueOfElement(String idElement){
        return getValueOfElement(By.id(idElement));
    }

    public void writeToElement(By by, String string) {
        getDriver().findElement(by).sendKeys(string);
    }

    public void writeToElement(String idElement, String string){
        writeToElement(By.id(idElement), string);
    }

    public WebElement waitPresenceOfElement(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitPresenceOfElement(String idElemento, int timeout) {
        return waitPresenceOfElement(By.id(idElemento), timeout);
    }
}