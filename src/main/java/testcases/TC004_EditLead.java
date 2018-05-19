package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_Editlead";
		testDescription="edit a existing lead";
		testNodes="Leads";
		category="Smoke";
		authors="Abi";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void editlead(String uName,String pwd,String fname,String cname,String verifycname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickcrmfsa()
		.clicklead()
		.clickfindlead()
		.typefnamefleadpage(fname)
		.clickfindleadbutton()
		.clickfirstid()
		.clickonedit()
		.typecnameeleadpage(cname)
		.clickupdatebutton()
		.verifytextcname(verifycname);
		
	}

}
