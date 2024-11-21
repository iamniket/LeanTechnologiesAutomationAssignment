```markdown
# Sauce Lab Automation Project

This project automates the checkout process on the Sauce Labs website using Playwright with Java and generates reports using Allure.

## Framework Overview

The framework utilizes Playwright for browser automation and TestNG for test execution. Allure is integrated to generate visually appealing and detailed reports of the test execution.

### Project Structure
- **BaseTest**: Contains setup and teardown methods for initiating and closing the browser.
- **LoginPage**: Handles login actions.
- **CheckoutPage**: Handles adding products to the cart.
- **PlaywrighFactory**: Initializes Playwright, configures the browser, and handles screenshots.
- **Test Classes**: Test cases that automate the login and checkout processes.
  
### Allure Reporting Integration

Allure is used to generate beautiful and easy-to-read test reports. Below are the steps to install and configure Allure on your system:

### Prerequisites

1. **Java 8 or higher** should be installed.
2. **Maven** should be installed.
3. **Allure Commandline** should be installed.

### Installing Allure on Windows

1. **Install Allure via Scoop**:
   - Open PowerShell as Administrator and run:
     ```sh
     scoop install allure
     ```

2. **Install Allure Manually**:
   - Download the latest version of Allure from [Allure Releases](https://github.com/allure-framework/allure2/releases).
   - Extract the downloaded ZIP file to a directory.
   - Add the directory to your system’s `PATH` variable for easy access.

### Generate Allure Reports

1. Execute your tests using Maven with the following command:
   ```sh
   mvn clean test
   ```

2. Once the tests are executed, generate the Allure report by running:
   ```sh
   allure serve target/allure-results
   ```

3. This will start a local server and open the Allure report in your default browser.

### Example Screenshots of Allure Report:

#### Allure Test Suite Overview


#### Allure Report Summary


## Test Execution

1. **Run the Tests**:
   - Use `TestNG` to run the test classes individually or through the `testng_runner.xml` file.

2. **Allure Reporting**:
   - After running the tests, the results will be available in the `target/allure-results` folder.
   - You can use the `allure serve` command to view the results in a web browser.

### Features
- Login functionality using valid credentials.
- Add multiple products to the cart in the checkout page.
- Allure reporting for visualizing test results.
  
### Example Test Output

#### Test Suites:
- **Sauce Lab Checkout Page**
  - Test Case 1: `doLogin`
  - Test Case 2: `clickAddToCart`

- **Sauce Lab Login Page**
  - Test Case 1: `doLogin`
  - Test Case 2: `validateProductPageHeader`
  - Test Case 3: `verifyLoginTitle`
  
---

For any questions or issues, please feel free to reach out.
```

This `README.md` includes:
- Steps for setting up Allure on Windows.
- Instructions for generating reports.
- Screenshots to demonstrate Allure’s output after test execution.

You can replace the image links with the actual screenshots when you update the repository.
## Author

- Niket Patil


## Tech Stack

**Programming language:** Java 17


