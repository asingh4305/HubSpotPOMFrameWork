#HubSpot Page Object Model (POM) Framework#

- This project demonstrates an example of a Page Object Model (POM) framework for testing HubSpot APIs using RestAssured and TestNG. The framework is designed to provide a robust, scalable and maintainable architecture for API testing, by separating the page actions and locators into separate classes.

##Features##
Easy to maintain and scalable architecture
Reusable code through Page Object Model design
TestNG for test execution and reporting
RestAssured for API testing
Maven for dependency management
Requirements
Java 8 or higher
Maven
Installation
Clone the repository
Install the required dependencies using Maven: mvn clean install
Usage
To run the tests, use the following Maven command:

`mvn test`

TestNG will execute the tests and generate an HTML report in the target/surefire-reports directory.

Project Structure
src/main/java: contains the base classes for the framework
src/test/java: contains the test classes and POM classes
src/test/resources: contains the test data and configuration files
License
This project is licensed under the MIT License - see the LICENSE file for details.
