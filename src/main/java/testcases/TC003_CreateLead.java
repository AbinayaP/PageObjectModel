package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="create a new lead";
		testNodes="Leads";
		category="Smoke";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void createlead(String uName,String pwd,String cname,String fname,String lname,String verifyname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmfsa()
		.clicklead()
		.clickcreatelead()
		.typecname(cname)
		.typefname(fname)
		.typelname(lname)
		.clicksubmit()
		.verifytextfname(verifyname);
		
					
	}

}
