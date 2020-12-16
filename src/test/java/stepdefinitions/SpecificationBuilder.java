package stepdefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestData;
import resources.UtilityApiMethods;

public class SpecificationBuilder extends UtilityApiMethods {
	UtilityApiMethods utilityapimethods;
	Response response;
	RequestSpecification requestSpecification;
	Response responseCount;
	static String ids;
	ResponseSpecification responseSpecificationresponseSpecificationTest;
	TestData td = new TestData();

	@Given("Set {string} service api endpoint with data {string} {int} {int}")
	public void set_Create_employee_service_api_endpoint_with_data(String string, String name, Integer salary,
			Integer age) throws FileNotFoundException {
		requestSpecification = given().spec(requestSpecification()).body(td.addemployee(name, salary, age));
	}

	@When("Send POST HTTP request")
	public void send_POST_HTTP_request() {
		responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
				.build();
		response = requestSpecification.when().post(resourcePathCreateEmployees).then().spec(responseSpecification)
				.extract().response();
	}

	@Then("Receive valid response status code")
	public void receive_valid_response_status_code() {
		assertEquals(response.getStatusCode(), 200);
	}

	@And("Check {string} showing {string}")
	public void check_showing(String expectedKey, String expectedValue) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		assertEquals(js.get(expectedKey).toString(), expectedValue);
	}

	@Given("fetch {string} data")
	public void fetch_data(String string) throws FileNotFoundException {
		requestSpecification = given().spec(requestSpecification());
	}

	@When("Send Get HTTP request")
	public void send_Get_HTTP_request() {
		responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
				.build();
	    response = requestSpecification.when().get(resourcePathGetEmployees).then().spec(responseSpecification)
				.extract().response();
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		//String ids = js.get("data[00].id");
		
		for(int i=0;i<=20;i++)
		{ 
			String ids = js.get("data["+i+"].id").toString();
			System.out.println(ids);
			
			
		}
		}

	@Then("Recieve valid status code")
	public void recieve_valid_status_code() {
		assertEquals(response.getStatusCode(), 200);
	}

	@When("Get HTTP request to getId")
	public void get_HTTP_request_to_getId() throws FileNotFoundException {

		requestSpecification = given().spec(requestSpecification());
		responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
				.build();
		response = requestSpecification.when().get(resourcePathGetEmployeeId).then().spec(responseSpecification)
				.extract().response();

	}

	@Given("update by {string} data")
	public void update_by_data(String string) throws FileNotFoundException {
		requestSpecification = given().spec(requestSpecification());

	}

	@When("update HTTP request to update data")
	public void update_HTTP_request_to_update_data() {
		responseSpecification = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON)
				.build();
		response = requestSpecification.when().put(resourcePathUpdateEmployeeId).then().spec(responseSpecification)
				.extract().response();
		assertEquals(response.getStatusCode(), 200);

	}

}
