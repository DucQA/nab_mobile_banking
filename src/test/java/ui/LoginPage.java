package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target usernameField = Target.the("Username field")
            .locatedBy("//XCUIElementTypeTextField");
    public static Target passwordField = Target.the("Password field")
            .locatedBy("//XCUIElementTypeSecureTextField");
    public static Target loginButton = Target.the("Login button")
            .locatedBy("(//XCUIElementTypeButton[@name='Log in'])[1]");
    public static Target closeButton = Target.the("Close button")
            .located(AppiumBy.accessibilityId("popup.modal.close.button"));
    public static Target backButton = Target.the("Back button")
            .located(AppiumBy.accessibilityId("Back"));

    public static Target errorPopup(String message) {
        return Target.the("Error Popup with message: " + message)
                .located(AppiumBy.xpath("//*[contains(@value, '" + message + "')]"));
    }
}


