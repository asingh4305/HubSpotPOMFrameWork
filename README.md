# HubSpotPOMFrameWork
This is code base of POM of HubSpot CRM site.


The framework is built using Java and the Selenium WebDriver API, and is organized into several packages that contain different modules and classes for various components of the framework. These include:

Pages: This package contains the classes that represent the pages of the HubSpot CRM system, and the methods to interact with those pages using Selenium.
TestCases: This package contains the test cases that leverage the pages and methods defined in the Pages package to test various functionalities of the HubSpot CRM system.
Utilities: This package contains utility classes for reading test data from external files, generating test reports, and other common functionalities that can be reused across the framework.
Config: This package contains the configuration files for the framework, including the browser and test environment settings.
The framework follows the Page Object Model (POM) design pattern, which helps to improve code maintainability, reduce code duplication, and enhance test script readability. By separating the page objects from the test scripts, the framework makes it easier to update the UI elements of the HubSpot CRM system, while minimizing the impact on the test scripts.

Overall, this repository serves as a good example of how to implement an automation framework using the POM design pattern with Selenium WebDriver API in Java.
