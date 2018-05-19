package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecname;
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement elesubmit;
	
	

	
	public CreateLeadPage typecname(String data) {
		type(elecname, data);
		return this;	
	}
	
	public CreateLeadPage typefname(String data) {
		type(elefname, data);
		return this;	
	}
	public CreateLeadPage typelname(String data) {
		type(elelname, data);
		return this;	
	}
	public ViewLeadPage clicksubmit() {
		click(elesubmit);
		return new ViewLeadPage();	
	}
	
	
	
		
	
	
	
	

}
