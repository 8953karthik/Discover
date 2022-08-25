package com.discover.program.entity;

public class HealthCheck {
	private String statusCode;
	private String systemName;
	private String statusDescription;
	
	
	public HealthCheck(String statusCode, String systemName, String statusDescription) {
		super();
		this.statusCode = statusCode;
		this.systemName = systemName;
		this.statusDescription = statusDescription;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	@Override
	public String toString() {
		return "HealthCheck [statusCode=" + statusCode + ", systemName=" + systemName + ", statusDescription="
				+ statusDescription + "]";
	}
	public HealthCheck() {
		super();
	}

}
