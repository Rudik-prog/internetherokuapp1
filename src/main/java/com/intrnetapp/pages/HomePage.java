package com.intrnetapp.pages;

import com.intrnetapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "button[onclick='jsAlert()']")
    WebElement selectJavaScriptAlerts;


    public SidePanel selectJavaScriptAlerts() {
        click(selectJavaScriptAlerts);
        return new SidePanel(driver);
    }
}


