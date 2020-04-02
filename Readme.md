# Sample Rest API

## Description

This a sample project to explore various aspects of a rest api like

- Frameworks
- Monitoring
- Storage
- REST fundamentals
- Conatinerization
- Postman Best practices
- Swagger (or any other tool?)
- and Many more (Will be adding those bits based on suggestions)

## Getting Started

```sh
./gradlew bootRun
```

## Current Status

It has two endpoints as of now

- [Greeting](http://localhost:8080/greeting)
- [Get - Employee By Id](http://localhost:8080/employee/1)

## To add more variation to Data

Update **application.properties**

```yaml
- employeeID: 1
      firstName: f_emp_1
      lastName: l_emp_1
      dob: dob_1
      phone: phone_1
      address:
        firstLine: firstLine_1
        secondLine: secondLine_1
        postCode: postCode_1
        city: city_1
        country: country_1
```

This is a temporary thing should be replaced by wiremock or a dummy DB going forward

## Running Test

Test can be run

- Manually by importing [Postman collection](https://learning.postman.com/) from **.postman/sample_rest_api.postman_collection.json**

- Iteratively by using [Newman CLI](https://www.npmjs.com/package/newman)

```sh
newman run --delay-request 10 -n 200 .postman/sample_rest_api.postman_collection.json
```

This will run every test 200 times with a lag of 10ms. Please refer to [Newman CLI](https://www.npmjs.com/package/newman) for more option

- Simply using [Postman Runner](https://learning.postman.com/docs/postman/collection-runs/starting-a-collection-run/). Spoiler this gives loads of funky options.
