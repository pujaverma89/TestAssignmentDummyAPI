$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Dummy.feature");
formatter.feature({
  "name": "Test to verify DummyDataAPI by RestAssured Framework",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if data can be addded by API",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regressionTestCreateDummyDataAPI"
    }
  ]
});
formatter.step({
  "name": "Set \"Createemployee\" service api endpoint with data \"\u003cname\u003e\" \u003csalary\u003e \u003cage\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Send POST HTTP request",
  "keyword": "When "
});
formatter.step({
  "name": "Receive valid response status code",
  "keyword": "Then "
});
formatter.step({
  "name": "Check \"status\" showing \"success\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "salary",
        "age"
      ]
    },
    {
      "cells": [
        "himms",
        "1000",
        "12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if data can be addded by API",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regressionTestCreateDummyDataAPI"
    }
  ]
});
formatter.step({
  "name": "Set \"Createemployee\" service api endpoint with data \"himms\" 1000 12",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.set_Create_employee_service_api_endpoint_with_data(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send POST HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.send_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Receive valid response status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.receive_valid_response_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check \"status\" showing \"success\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.check_showing(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify  all data can be fetch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTestForGetEmployeeData"
    }
  ]
});
formatter.step({
  "name": "fetch \"GetEmplyee\" data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.fetch_data(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send Get HTTP request",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.send_Get_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recieve valid status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.recieve_valid_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify  single data can be fetch by id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTestForGetEmployeeDataById"
    }
  ]
});
formatter.step({
  "name": "fetch \"GetEmplyeeById\" data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.fetch_data(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get HTTP request to getId",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.get_HTTP_request_to_getId()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recieve valid status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.recieve_valid_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Update API updatedata corretly",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionTestForUpdateEmployeeDataById"
    }
  ]
});
formatter.step({
  "name": "update by \"UpdateEmplyeeById\" data",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.update_by_data(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "update HTTP request to update data",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.update_HTTP_request_to_update_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recieve valid status code",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.SpecificationBuilder.recieve_valid_status_code()"
});
formatter.result({
  "status": "passed"
});
});