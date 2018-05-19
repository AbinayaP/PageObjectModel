package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//div[@class='x-tab-panel-header x-unselectable']/following::input[2]")
	private WebElement fname;
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']/ancestor::td[1]")
	private WebElement finleadbutton;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement firstid;
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement phonetab;
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement emailtab;
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement phonenumber;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-tab-panel-header x-unselectable']/following::input[1]")
	private WebElement leadid;
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement email;
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")
	private WebElement fnameid;
	
	public String text;
	
	
	public FindLeadPage typefnamefleadpage(String data) {
		type(fname, data);
		return this;	
	}
	
	public FindLeadPage clickfindleadbutton() {
		click(finleadbutton);
		return this;	
	}
	public FindLeadPage clickfindleadmbutton() {
		click(finleadbutton);
		return this;	
	}
	
	public ViewLeadPage clickfirstid() {
		click(firstid);
		return new ViewLeadPage();	
	}
	public MergeLeadPage clickmfirstid() {
		click(firstid);
		switchToWindow(0);
		return new MergeLeadPage();	
	}

	
	public FindLeadPage clickphone() {
		click(phonetab);
		return this;	
	}
	public FindLeadPage clickemail() {
		click(emailtab);
		return this;	
	}
	
	public FindLeadPage typephone(String data) {
		type(phonenumber, data);
		return this;	
	}
	public FindLeadPage typeemail(String data) {
		type(email, data);
		return this;	
	}
	public FindLeadPage getfirstid() {
		text= getText(firstid);
		System.out.println(text);
		return this;	
	}
	
	public FindLeadPage getfirstname() {
		text1= getText(fnameid);
		System.out.println(text1);
		return this;	
	}
	
	public FindLeadPage typeleadid() {
		type(leadid, text);
		return this;	
	}
	public FindLeadPage typefromleadid(String data) {
		type(leadid, data);
		return this;	
	}
	public FindLeadPage typetoleadid(String data) {
		type(leadid, data);
		return this;	
	}
		
	
	
	
	

}
