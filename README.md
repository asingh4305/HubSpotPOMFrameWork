#HubSpotPOMFrameWork POM#

The HubSpotPOMFrameWork project is a Java-based automation framework for web applications built using the Page Object Model (POM) design pattern. The framework is specifically designed for testing and automating web applications built with the HubSpot CRM platform, but can be easily adapted to work with other web applications as well.

The framework uses popular Java testing tools such as TestNG, Extent Reports, Log4j and Rest-Assured to provide a robust and flexible testing infrastructure. The framework supports both UI and API testing, and includes several utility classes and methods to make writing and maintaining tests easier.

The project includes a sample HubSpot test suite that demonstrates how to use the framework to test common HubSpot features such as login, contact management, deals, tasks and workflows. The tests can be executed using Maven and generate detailed HTML test reports using Extent Reports.

Getting Started
To use the HubSpotPOMFrameWork, you need to have Java and Maven installed on your machine. Once you have cloned the project, you can import it into your preferred IDE (e.g. Eclipse, IntelliJ) and start writing your tests.

The project includes several packages that represent different layers of the framework, such as pages, tests, utilities and listeners. You can use these packages to organize your code and tests. The sample test suite can be found in the src/test/java/tests package.

To execute the tests, you can use the following Maven command from the root directory of the project:

mvn clean test

This will run all the tests in the project and generate the HTML test reports in the test-output directory.

Contributing
The HubSpotPOMFrameWork project is open for contributions and suggestions. If you find a bug or have an idea for an improvement, feel free to open an issue or submit a pull request.

License
The HubSpotPOMFrameWork project is licensed under the MIT License. Feel free to use and modify the code as you see fit.
