package jiraapi;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
public class JiraAPIDriver {

	public static void main(String[] args) {
		CreateIssue object=new CreateIssue();
		
		Fields f=new Fields();
		Project p=new Project();
		p.setKey("HOME");
		f.setProject(p);
		f.setSummary("Nishikant GIRA Api Automation Test case");
		f.setDescription("To check wheather Issue is created or not");
		Issue Is=new Issue();
		Is.setName("Story");
		f.setIssuetype(Is);
		
		object.setFields(f);
		given()
		.auth()
		.preemptive()
		.basic("nishan3d@gmail.com", "M259XE1ofltAXjBQ5gI31846")
		.contentType(ContentType.JSON)
		.body(object)
		.log()
		.all()
		.when()
		.post("https://nishikantpatil312.atlassian.net/rest/api/2/issue/")
		.then()
		.log()
		.all();
	}
}
