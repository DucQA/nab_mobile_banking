package interactions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class Swipe {
    public static Performable horizontally(double startXPercentage, double endXPercentage, long durationInMillis) {
        return createSwipeTask(
                startXPercentage, 0.5, endXPercentage, 0.5, true, durationInMillis
        );
    }

    public static Performable vertically(double startYPercentage, double endYPercentage, long durationInMillis) {
        return createSwipeTask(
                0.5, startYPercentage, 0.5, endYPercentage, false, durationInMillis

        );
    }

    private static Performable createSwipeTask(
            double startXPercentage, double startYPercentage,
            double endXPercentage, double endYPercentage, boolean isHorizontal, long durationInMillis
    ) {
        return Task.where(
                "Swipe " + (isHorizontal ? "horizontally" : "vertically"),
                actor -> {
                    AppiumDriver appiumDriver = ThucydidesWebDriverSupport.getProxiedDriver();
                    Dimension dimension = appiumDriver.manage().window().getSize();

                    int startX = (int) (dimension.getWidth() * startXPercentage);
                    int startY = (int) (dimension.getHeight() * startYPercentage);
                    int endX = (int) (dimension.getWidth() * endXPercentage);
                    int endY = (int) (dimension.getHeight() * endYPercentage);

                    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
                    Sequence swipe = new Sequence(finger, 1);
                    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
                    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                    swipe.addAction(finger.createPointerMove(Duration.ofMillis(durationInMillis), PointerInput.Origin.viewport(), endX, endY));
                    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                    appiumDriver.perform(Collections.singletonList(swipe));
                }
        );
    }
}