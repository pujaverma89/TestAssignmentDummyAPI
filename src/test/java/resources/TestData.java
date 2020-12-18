package resources;

import dummyclasspojo.CreateEmployeePojo;


public class TestData { 
	
	//setting set methods for name,age,salary
	CreateEmployeePojo createemployee= new CreateEmployeePojo(); 
	public CreateEmployeePojo addemployee(String name, int age, int salary)
	{ 
		createemployee.setName(name);
		createemployee.setAge(age);
		createemployee.setSalary(salary);
		return createemployee;
		
	} 

}
