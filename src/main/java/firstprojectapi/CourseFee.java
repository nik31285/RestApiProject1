package firstprojectapi;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class CourseFee {

	public static void main(String[] args) {
		String json="{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"purchaseAmount\": 40000,\r\n" + 
				"    \"website\": \"www.testingshastra.com\",\r\n" + 
				"    \"studentId\" : \"911\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": {\r\n" + 
				"    \"webautomation\":[\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Selenium\",\r\n" + 
				"        \"price\": 4000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Cypress\",\r\n" + 
				"        \"price\": 6000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Protractor\",\r\n" + 
				"        \"price\": 7000\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"api\":[\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Rest API\",\r\n" + 
				"        \"price\": 5000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Soap UI\",\r\n" + 
				"        \"price\": 6000\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"MobileAutomation\":[\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"C-Test\",\r\n" + 
				"        \"price\": 5000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Appium\",\r\n" + 
				"        \"price\": 4000\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"}";
		JsonPath js=new JsonPath(json);
		String courseNames[]= {"webautomation","api","MobileAutomation"};
		int priceSum=0;
		for(int i=0;i<js.getInt("courses.size()");i++)
		{
			for(int j=0;j<js.getInt("courses."+courseNames[i]+".size()");j++){
				priceSum=priceSum+js.getInt("courses."+courseNames[i]+"["+j+"].price");
			}
		}
		System.out.println("Sum of all courses price is:"+priceSum);
	}
}
