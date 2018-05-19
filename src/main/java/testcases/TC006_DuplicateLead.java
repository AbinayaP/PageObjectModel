package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Duplicatelead";
		testDescription="create a duplicate lead";
		testNodes="Leads";
		category="Smoke";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void deletelead(String uName,String pwd,String email) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmfsa()
		.clicklead()
		.clickfindlead()
		.clickemail()
		.typeemail(email)
		.clickfindleadbutton()
		.getfirstname()
		.clickfirstid()
		.clickonduplicate()
		.clickcleadbutton()
		.verifydupfname();
		
	}

}
