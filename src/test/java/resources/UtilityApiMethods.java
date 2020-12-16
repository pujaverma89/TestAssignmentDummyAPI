package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import stepdefinitions.SpecificationBuilder;

public class UtilityApiMethods {

	public final String apiUrl = "http://dummy.restapiexample.com/api/v1";
	public final String resourcePathGetEmployees = "/employees";
	public final String resourcePathCreateEmployees = "/create";
	public final String resourcePathGetEmployeeId = "/employee/16";
	public final String resourcePathUpdateEmployeeId = "/update/13";
	public final String resourcePathDeleteEmployeeId = "/delete/{id}";
	public static RequestSpecification requestSpecification;
	public ResponseSpecification responseSpecification; 
	
	Response response;

	public RequestSpecification requestSpecification() throws FileNotFoundException {
		
		if (requestSpecification == null) {
			PrintStream printstream = new PrintStream(new FileOutputStream("logging.txt"));
			requestSpecification = new RequestSpecBuilder().setBaseUri(apiUrl)
					.addFilter(RequestLoggingFilter.logRequestTo(printstream))
					.addFilter(ResponseLoggingFilter.logResponseTo(printstream)).setAccept(ContentType.JSON).build();
			return requestSpecification;
		}
		else
		return requestSpecification;
	}

	

	// JSON extraction in string
	public String getJsonPath(Response response, String key) {
		String str = response.asString();
		JsonPath js = new JsonPath(str);
		return js.get(key).toString();

	}  
	
	
	
	
	
}
