# Restful Booker Api Test

This is just a test project to practice API testing, using this API:
- https://restful-booker.herokuapp.com/apidoc/index.html

## Run tests:
    - mvn test

## Run test with a specific tag:
    - mvn test -Dcucumber.filter.tags="{filtername}"

## Generate report with Allure
    - allure serve allure-results