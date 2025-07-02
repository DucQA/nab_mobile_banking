Feature: Savings and Loan Calculators

  As a NAB Mobile Banking customer
  I want to access comprehensive financial calculators
  So that I can make informed decisions about my savings and loans

  Background:
    Given I launch the NAB mobile banking app
    And I am on the "Savings & loans calculators" screen

  @SavingsCalculator @Regression @Financial
  Scenario Outline: Calculate future savings with compound interest over 2 years
    When I input the following savings details:
      | Initial deposit | <initial> |
      | Ongoing deposit | <ongoing> |
      | Frequency       | Monthly   |
      | Savings term    | 2 years   |
      | Interest rate   | <rate>    |
    Then the following results should be displayed:
      | SAVINGS TOTAL | <total> |

    Examples:
      | initial  | ongoing | rate | total    |
      | $27,000  | $108    | 3.60 | $31,696  |
      | $45,000  | $207    | 4.50 | $54,418  |
      | $500,000 | $999    | 6.30 | $592,435 |

  @LoanCalculator @Regression @Financial
  Scenario Outline: Calculate monthly mortgage repayments for 30-year term
    When I input the following loan details:
      | Loan amount   | <loan>                 |
      | Interest rate | <rate>                 |
      | Loan term     | 25 years               |
      | Frequency     | Monthly                |
      | Loan type     | Principal and Interest |
    Then the following results should be displayed:
      | REPAYMENTS | <monthlyPay> |

    Examples:
      | loan     | rate | monthlyPay |
      | $270,000 | 5.40 | $1,642     |
      | $360,000 | 4.80 | $2,063     |
      | $500,000 | 6.30 | $3,314     |






