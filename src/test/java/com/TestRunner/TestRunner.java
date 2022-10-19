package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		//features = {"Feature/ToGet_Details_Using_CountryName_UsingAPI.feature"}
		//features = {"Feature/TestChercher_Tech_GET_Detail.feature"}
		//features = {"Feature/WebOrder_Login_DataTable_All_TCs.feature"}
//		features = {"Feature/WebOrder_Login_DataTable_MultipleData.feature"}
//		features = {"Feature/WebOrder_Login.feature"}
//		features = {"Feature/WebOrder_CreateOrder.feature"}
		features = {"Feature"}
		,glue= "com.StepDefinition"
		,dryRun=false
		,monochrome=true
		,plugin  = {"pretty","html:CucumberReport/Report.html"}
		//,tags="~@sanity"
		//,tags= "@smoke,@sanity"
		,tags= "@smoke"
		
		)
public class TestRunner {
	
	

}
