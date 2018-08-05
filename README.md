# bonify-type-identifier-service

### Challenge

You have following code part below which consist of several “if else” statements. You
need to optimize the code to support different data types in the future without
changing it one more time.
public void processContract(String type) {
if ("electricity".equals(type)) {
System.out.println("Processed electricity");
} else if ("dsl".equals(type)) {
System.out.println("Processed dsl");
} else if ("appartment_rent".equals(type)) {
System.out.println("Processed appartment");
}
}
Expected result: java Spring Boot application that can receive a “type”(dsl or other) as
an input and prints to console what was selected. Step by step explanation of how to
run the project..

The main use cases of this service are as below.
Check type requested and return matching string type from enum


### Implementation 
This is service using https://projects.spring.io/spring-boot, using Maven for compiling and building the application.This service uses Enum to hold all types which needs to be checked against input type ,In future if you would like to add more types then just add it in ContractTypeHolder enum ,No need to change implementation logic.This will allow to be more flexible then applying multiple if/else block to check type.

### List of API's

2. ``GET /type/{type}`` - get type selected


#### Request sample
GET /types/{type} HTTP/1.1
Content-Type: application/json

http://localhost:8080/types/dsl

#### Success response sample

```
200 Success
```

Processed dsl
	    
### Build
You can build using:

  $ mvn clean install

### Run
You can run using:

  $ mvn spring-boot:run

