package interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.*;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class Tap {
    public static Performable on(double startXPercentage, double startYPercentage) {
        return Task.where(
                "Tap on point (" + startXPercentage + ", " + startYPercentage + ")",
                actor -> {
                    AppiumDriver appiumDriver = ThucydidesWebDriverSupport.getProxiedDriver();
                    int width = appiumDriver.manage().window().getSize().getWidth();
                    int height = appiumDriver.manage().window().getSize().getHeight();

                    System.out.println("width = " + width);
                    System.out.println("height = " + height);

                    int x = (int) (width * startXPercentage);
                    int y = (int) (height * startYPercentage);

                    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                    Sequence action = new Sequence(finger, 1);
                    action.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
                    action.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                    action.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y));
                    action.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
                    appiumDriver.perform(Collections.singletonList(action));
                }
        );
    }
}