package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Editlead";
		testDescription="delete existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void deletelead(String uName,String pwd,String phno) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmfsa()
		.clicklead()
		.clickfindlead()
		.clickphone()
		.typephone(phno)
		.clickfindleadbutton()
		.getfirstid()
		.clickfirstid()
		.clickondelete()
		.clickfindlead()
		.typeleadid()
		.clickfindleadbutton();
		
		
	}

}
