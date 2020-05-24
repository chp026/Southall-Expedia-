package org.example.PageObject;

import org.apache.commons.io.FileUtils;
import org.example.BaseClass.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FlightSearchPage extends DriverFactory {
    @FindBy(xpath = "//a[@class='active']//span[contains(text(),'Flights')]")
    WebElement flightButton;
public void flight(){
    flightButton.click();
    }
    @FindBy (id = "DestinationFrom1")
    WebElement flyingfrom;
public void departing(){
    flyingfrom.sendKeys("Lon");
}
public void departingAirport(){
    List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
    for (WebElement option : options){
        System.out.println(option.getText());
        if (option.getText().contains("don Heathrow Airport (LHR), UK")){
            option.click();
            break;
        }
    }
}
    @FindBy (xpath = "//input[@id='DestinationTo']")
    WebElement flyingto;
    public void arriving(){
        flyingto.sendKeys("Ind");
    }
    public void arrivingAirport(){
        List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
        for (WebElement option : options){
            System.out.println(option.getText());
            if (option.getText().contains("Sardar Vallabhbhai Patel Intl (AMD), India")){
                option.click();
                break;
            }
        }
    }
    @FindBy(id = "deptdt")
    WebElement goingdate;
    public void leavingDate(){
        goingdate.click();
    }
    public void chooseLeavingDate(){
        List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date : dates){
            System.out.println(date.getText());
            if (date.getText().contains("30")){
                date.click();
                break;
            }
        }
    }
    @FindBy(id = "rtndt")
    WebElement comingdate;
    public void comingBackDate(){
        comingdate.click();
    }
    public void chooseArrivingBackDate(){
        List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
        for (WebElement date : dates){
            System.out.println(date.getText());
            if (date.getText().contains("30")){
                date.click();
                break;
            }
        }
    }
    @FindBy(xpath = "//img[@class='lazy Checked loading']")
    WebElement directflight;
    public void directFlightOnly(){
        directflight.click();
    }
    @FindBy(id = "button_flight_search")
    WebElement button;
    public void searchButton(){
        button.click();
    }
    public void ScreenShot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destionationfile = new File("C:\\Users\\Chirag\\Desktop\\page.png");
        FileUtils.copyFile(sourcefile, destionationfile);
    }
    public void ScreenShot1() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
        File destionationfile = new File("C:\\Users\\Chirag\\Desktop\\page1.png");
        FileUtils.copyFile(sourcefile, destionationfile);
    }
}
