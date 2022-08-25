package com.discover.program.ctest.stepdefinition;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SpringBootTest
@CucumberContextConfiguration

public class StepDefinition {
	
	private Response response;
	private RequestSpecification request;

}
