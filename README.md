# Rest Assured Code Challenge

This project contains the solution to the automation challenge using **Rest Assured**. The objective is transform API response to data transfer object and verify the value of a few variables of that object.

## Prerequisites

- **Java 11+**: [Download Java 11](https://www.oracle.com/java/technologies/downloads/#java11)  
  Verify installation: `java -version`

- **Maven**: [Download Maven](https://maven.apache.org/download.cgi)  
  Verify installation: `mvn -v`

- **Set Environment Variables**: Follow [this tutorial](https://www.tutorialspoint.com/maven/maven_environment_setup.htm).

- **IntelliJ IDEA**: [Download IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows)

## Technologies Used

- **Rest Assured**: For API automation.
- **Java**: Primary programming language.
- **TestNG**: For structuring and executing tests.
- **Maven**: For dependency management and test execution.

## Public API Used

This project uses the following public API for testing purposes:

- [Reqres API](https://reqres.in/api/users/2): The test is based on this API, which returns information for the user with ID 2.

## Project Structure

- `/src/main/java`: Contains DTO classes to deserialize the JSON Response.
- `/src/test/java`: Contains test files organized into classes and methods.
    - `GetSingleUserTest`: Test case that uses Rest Assured to perform actions.
- `pom.xml`: File for configuring dependencies and Maven plugins.

## How to Run

1. Open your terminal and navigate to the root directory of the project.
2. Run the tests using Maven with the following command:
   ```bash
   mvn clean test