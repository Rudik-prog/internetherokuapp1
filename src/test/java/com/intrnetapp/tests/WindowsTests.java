package com.intrnetapp.tests;

import com.intrnetapp.core.TestBase;
import com.intrnetapp.pages.HomePage;
import com.intrnetapp.pages.SidePanel;
import com.intrnetapp.pages.windows.JsAlertsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WindowsTests extends TestBase {
    @BeforeEach
    public void precondition() {
        new HomePage(driver).selectJavaScriptAlerts();

    }

    @Test
    public void alertWaitTest() {
        new SidePanel(driver).selectJavaScriptAlerts();
        new JsAlertsPage(driver).verifyAlert();

    }
}
