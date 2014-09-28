package com.socialfoundry.model;

public class Founder {

	private String founderName;
	
	public Founder(){}
	
	public Founder(String founderName){
		this.founderName = founderName;
	}
	
	public String getFounderName(){
		return this.founderName;
	}

	@Override
	public String toString() {
		return "Founder [founderName=" + founderName + "]";
	}
	
}
