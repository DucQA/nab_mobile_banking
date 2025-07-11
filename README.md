# NAB Mobile Banking App - Automated Feature Tests

This project contains automated acceptance tests for the NAB Mobile Banking application, focusing on critical user journeys such as login error handling and financial calculators. The tests are written in Gherkin syntax and executed using Java and Maven, supporting Behavior-Driven Development (BDD) practices.

Click the image below to watch a demo of the project in action:

[![Watch the demo](assets/demo.gif)](https://www.youtube.com/watch?v=ebfpENqBTBc)

## 📌 Purpose

This project was created **solely for educational and practice purposes**, demonstrating the use of **Appium with Java** to automate functional tests for a mobile banking application. It aims to showcase skills in mobile test automation, including test design, execution, and CI/CD integration.

> ⚠️ **Disclaimer:** This project does **not** interact with any real customer data, backend services, or production systems. All test scenarios are run in a **simulated/staging environment** or with a **locally installed app**, and do **not** violate any internal policies or data privacy guidelines of any bank or financial institution.

---
## Features Covered

### 1. Login Error Handling
- **Purpose:** Ensures users receive clear and actionable error messages when login attempts fail.
- **Scenarios:**
    - Validation of error messages for various invalid NAB ID and password combinations.
    - Consistent feedback for authentication issues.

### 2. Savings and Loan Calculators
- **Purpose:** Verifies the accuracy and usability of the in-app financial calculators.
- **Scenarios:**
    - Calculation of future savings with compound interest over a 2-year term.
    - Calculation of monthly mortgage repayments for a 25-year loan term.
    - Multiple input combinations to ensure robust financial computations.
