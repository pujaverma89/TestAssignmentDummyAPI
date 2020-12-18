# TestAssignmentDummyAPI 

This is automation suite is designed to test the DummyRESTAPITest with POST,GET & DELETE method
The tech stack used for this project are:

-JAVA as the programming language for writing test code

-Cucumber as the framework

-Eclipse as the preferred IDE for writing java code.

-JDK1.8
 
**Cloning & Importing the Project** 
GitHub : (https://github.com/pujaverma89/TestAssignmentDummyAPI)
AzureRepo : (https://dev.azure.com/pujavrma110340/_git/TestAssignmentDummyAPI) 

Note: For 2nd steps, Need to follow this way CMD -> cd <change-to-project-location>

Test can run the tests directly from the eclipse, by right-clicking from TestRunnerDummy.java class and Run as Junittest.
For Windows users: mvn test verify

Run the pipeline to run the automated tests from here(https://dev.azure.com/pujavrma110340/TestAssignmentDummyAPI/_build?definitionId=2)


The project has 5 scenarios with 18 steps. Which is located in Dummy.feature files:
[/TestAssignmentLeasePlan/src/test/resources/Features/Pet.feature] 

Total 5 Scenarios will be executed with 18 stepes to verify each step and response codes,status and error messages. Report file can be found in the job artifacts like here (https://dev.azure.com/pujavrma110340/TestAssignmentDummyAPI/_build/results?buildId=9&view=MaciejMaciejewski.azure-pipelines-cucumber.build-cucumber-tab)
