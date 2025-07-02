package ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class CalculatorPage {
    public static Target loansTab = Target.the("Loans tab")
            .located(AppiumBy.accessibilityId("LOANS"));
    public static Target initialDepositField = Target.the("Initial Deposit field")
            .locatedBy("(//XCUIElementTypeTextField)[1]");
    public static Target ongoingDepositField = Target.the("Ongoing Deposit field")
            .locatedBy("(//XCUIElementTypeTextField)[2]");
    public static Target interestRateField = Target.the("Interest Rate field")
            .locatedBy("(//XCUIElementTypeTextField)[5]");
    public static Target savingsSummaryBtn = Target.the("Savings Summary button")
            .located(AppiumBy.accessibilityId("Savings summary"));
    public static Target repaymentsSummaryBtn = Target.the("Repayments Summary button")
            .located(AppiumBy.accessibilityId("Repayments summary"));
}


