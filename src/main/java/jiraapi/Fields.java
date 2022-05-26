package jiraapi;

public class Fields {
	Project project;
	String summary;
	String description;
	Issue issuetype;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Issue getIssuetype() {
		return issuetype;
	}
	public void setIssuetype(Issue issuetype) {
		this.issuetype = issuetype;
	}
}
