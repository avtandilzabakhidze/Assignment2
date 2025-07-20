# Assignment2

This project contains E2E test for a saucedemo application, using Playwright with Java and TestNG. It follows modern automation design patterns, including: Page Object Model and Fluent Interface pattern.


## Test Description


The tests cover common user journeys such as: logging in, adding products to the shopping cart and completing checkout process. The goal is to verify that the core functionalities of the application work as expected from an end-user perspective.


## Technologies Used


- **Playwright**
- **TestNG**
- **Java**


## Design Patterns


- **Page Object Model**
- **Fluent Interface**
  

## Clong Repository


git clone https://github.com/avtandilzabakhidze/Assignment2.git


## Strategy for SauceDemo


Application: SauceDemo
URL: https://www.saucedemo.com/

1. Overview
SauceDemo is an online store where users can browse products, add multiple items to a cart and complete checkout. App includes login/registration, product filters, shopping cart management and order placement.

2. Test Objectives
Verify user authentication: login and logout.

Validate product browsing: filters, product details and navigation.

Test shopping cart: add, remove product,  total price accuracy.

Check checkout process: field validations.


3. Test Environment
   
Devices: Windows 11
Browsers: Chrome

5. Approach
Automated E2E tests with Playwright + Java + TestNG

Use Page Object Model and Fluent Interface

Test positive and negative

6. Limitations & Improvements

The site does not have a product search feature, which limits user navigation and quick product finding.

It is not possible to select more than one quantity of a same product directly from the product page or the cart page, restricting user flexibility in shopping.
