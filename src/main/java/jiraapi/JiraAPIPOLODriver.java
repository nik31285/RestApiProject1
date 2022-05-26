package jiraapi;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class JiraAPIPOLODriver {

	public static void main(String[] args) {
		CreateIssue object=new CreateIssue();
		
		Fields f=new Fields();
		Project p=new Project();
		p.setKey("POLO");
		f.setProject(p);
		f.setSummary("Jira automation test case by Nishikant");
		f.setDescription("To check wheather Issue is created or not");
		Issue Is=new Issue();
		Is.setName("Story");
		f.setIssuetype(Is);
		
		object.setFields(f);
		given()
		.auth()
		.preemptive()
		.basic("testrestapi123@outlook.com", "DZH32UTW7YKpzCo8vq4u4748")
		.contentType(ContentType.JSON)
		.body(object)
		.log()
		.all()
		.when()
		.post("https://narc.atlassian.net/rest/api/2/issue/")
		.then()
		.log()
		.all();
	}
}


