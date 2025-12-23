<h2 align="center">DemoQA Selenium Automation Project - Final Project</h2>
<p style="margin-left: 5px; margin-right: 5px;">
DemoQA Selenium Automation Project is an automated testing framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**.  
The main goal of this project is to demonstrate automation testing skills by testing the **Elements** section of the [DemoQA](https://demoqa.com) website.
</p>
<p style="margin-left: 5px; margin-right: 5px;">
This project was developed as a **final Selenium project** following best practices such as **Page Object Model (POM)** and clean test structure.
</p>

---

## Tech Stack

- **Programming Language:** Java 21 (LTS)
- **Automation Tool:** Selenium WebDriver
- **Test Framework:** TestNG
- **Build Tool:** Apache Maven 3.9.5
- **Browser:** Google Chrome
- **Driver Management:** WebDriverManager
- **IDE:** IntelliJ IDEA Community Edition
- **Design Pattern:** Page Object Model (POM)

---

## Project Structure
<p style="margin-left: 5px; margin-right: 5px;">
The project is organized following the **Page Object Model (POM)** design pattern to ensure clear separation of concerns, readability, and easy maintenance.
</p>

### Base Package
- `BaseTest`
    - WebDriver initialization
    - Browser setup and teardown
    - JavaScript utilities (scroll, ad removal)
    - Common setup for all tests

---

### Pages Package (POM)

Each web page is represented by a separate class:

- **HomePage**
- **Sidebar**
- **TextBoxPage**
- **CheckBoxPage**
- **RadioButtonPage**
- **ButtonsPage**

All page classes:
- Extend `BaseTest`
- Use `@FindBy` annotations
- Are initialized using `PageFactory`
- Contain methods that represent user actions

---

### Tests Package

Test classes implemented using **TestNG**:

- **BannerTest**
- **TextBoxTest**
- **CheckBoxTest**
- **RadioButtonTest**
- **ButtonsTest**

Each test class:
- Uses `@BeforeMethod` for navigation
- Contains clear and isolated test cases
- Uses assertions for validation

---

## Test Coverage

### BannerTest
- Verifies banner background color
- Verifies banner text content
- Verifies font size

### ButtonsTest
- Double click action
- Right click action
- Dynamic click
- Verifies confirmation messages

### CheckBoxTest
- Expands all checkbox nodes
- Selects all checkboxes
- Verifies result section

### RadioButtonTest
- Selects **Yes** radio button
- Selects **Impressive** radio button
- Verifies **No** radio button is disabled


### TextBoxTest
- Validates successful form submission with all fields populated
- Verifies correct navigation to the Text Box page
- Confirms that submitted user data is displayed correctly
- Validates form behavior when an invalid email format is provided
- Verifies form submission when optional fields are left empty:
    - Full Name
    - Email
    - Current Address
    - Permanent Address

---

## ⚙️ Setup & Installation

### Prerequisites

Before running the project, ensure the following tools are installed on your system:

- Java JDK (recommended version: 21 LTS)
- Apache Maven
- IDE (IntelliJ IDEA)
- Supported web browser (Google Chrome)

---

### Clone the Repository

Clone the project repository and navigate to the project directory:

git clone https://github.com/AnaDi993/DemoQA-FinalProject.git

---

### Install Dependencies
Download and install all required Maven dependencies:

mvn clean install

---

### ▶️ Running the Tests
To execute all automated tests using Maven, run the following command:

mvn test

Alternatively, tests can be executed directly from the IDE using TestNG run configurations.

---

## 📖 Learning Skills

This project helped develop and demonstrate key QA automation skills, including:

- Writing automated tests with Selenium WebDriver
- Organizing tests using the Page Object Model (POM)
- Using TestNG for assertions and test management
- Building and managing the project with Maven
- Performing data-driven tests with different input scenarios
- Handling dynamic web elements and waits
- Following best practices for readable and maintainable test code

---

## 👤 Author

**Ana Dinić Beriša**

JUNIOR QA SOFTWARE TESTER

---
