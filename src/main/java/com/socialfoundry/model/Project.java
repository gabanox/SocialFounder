package com.socialfoundry.model;

public class Project {

	private String projectName;
	
	public Project(){}

	public String getProjectName() {
		return projectName;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + "]";
	}
	
}
