#Author: Puja Verma
#Keywords Summary : DummyRestAssuredAPI Test
Feature: Test to verify DummyDataAPI by RestAssured Framework
  I want to use this template for my feature file

  @regressionTestCreateDummyDataAPI
  Scenario Outline: Verify if data can be addded by API
    Given Set "Createemployee" service api endpoint with data "<name>" <salary> <age>
    When Send POST HTTP request
    Then Receive valid response status code
    And Check "status" showing "success"
   

    Examples: 
      | name  | salary | age |
      | himms |   1000 |  12 |

  @regressionTestForGetEmployeeData
  Scenario: Verify  all data can be fetch
    Given fetch "GetEmplyee" data
    When Send Get HTTP request
    Then Recieve valid status code
    
    @regressionTestForGetEmployeeDataById
  Scenario: Verify data can be fetch by id
    Given fetch "GetEmplyeeById" data
    When  Get HTTP request to getId
    Then Recieve valid status code  
    
     @regressionTestForUpdateEmployeeDataById
  Scenario: Verify Update API updatedata corretly
    Given update by "UpdateEmplyeeById" data
    When  update HTTP request to update data
    Then Recieve valid status code 
    And Check "status" showing "success"
