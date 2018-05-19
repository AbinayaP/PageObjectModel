package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Mergelead";
		testDescription="merge a two leads";
		testNodes="Leads";
		category="Smoke";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC008";
	}
	@Test(dataProvider="fetchData")
	public void deletelead(String uName,String pwd,String id1,String id2) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmfsa()
		.clicklead()
		.clickmergelead()
		.clickfrmid()
		.typefromleadid(id1)
		.clickfindleadmbutton()
		.clickmfirstid()
		.clicktoid()
		.typetoleadid(id2)
		.clickfindleadmbutton()
		.clickmfirstid()
		.clickmerge();
		
		
		
	}

}
