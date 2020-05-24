package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Practicepage extends DriverFactory {

    @FindBy(id = "bmwradio")
    WebElement bmwRadioButton;
    @FindBy(id = "benzradio")
    WebElement benzRadioButton;
    @FindBy(id = "hondaradio")
    WebElement hondaRadioButton;
public void radioButton() throws InterruptedException {
    Thread.sleep(2000);
    bmwRadioButton.click();
    Thread.sleep(2000);
    hondaRadioButton.click();
    Thread.sleep(2000);
    benzRadioButton.click();
    System.out.println(benzRadioButton.isSelected());
}

@FindBy(xpath = "//div[@class='col-xs-10 col-xs-offset-1 col-md-8 col-md-offset-2 course-description']//h1")
WebElement tagName;
public void assertion(){
    String actualURL = tagName.getText();
    Assert.assertThat(actualURL, Matchers.containsString("Practice"));
    if (actualURL.contains("Practice")){
    System.out.println("Assertion is passed!");
    }else {
        System.out.println("Assertion is failed!");
    }
}
@FindBy(id = "carselect")
    WebElement dropdown;
public void selectclassMethod(){
    Select sel = new Select(dropdown);
    sel.selectByValue("benz");
    List<WebElement> options = sel.getOptions();
    for (WebElement option: options){
        System.out.println(option.getText());           //to print all options in list
    }
}
@FindBy(id = "mousehover")
    WebElement mousehover;
@FindBy(linkText = "Top")
    WebElement top;
public void actionClassMethod() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000);");
    Thread.sleep(1000);
    Actions action = new Actions(driver);
    action.moveToElement(mousehover).perform();
    Thread.sleep(2000);
    action.moveToElement(top).click().perform();
}


@FindBy(id = "search-courses")
        WebElement iframeSearchBox;
public void iframeMethod() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1300);");
    Thread.sleep(2000);
    driver.switchTo().frame("courses-iframe");
   // Thread.sleep(2000);
    //iframeSearchBox.sendKeys("Java");
    //Thread.sleep(2000);
    //driver.switchTo().defaultContent();
}
public void listMethod(){
    List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));
    for (WebElement checkbox: checkboxes){
        System.out.println(checkbox.getAttribute("value"));
        if (checkbox.getAttribute("value").contains("benz")){
            checkbox.click();
            break;
        }
    }
}



}//class ends
