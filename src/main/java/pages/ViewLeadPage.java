package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elefname;
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement editlink;
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elecname;
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement deletelink;
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicatelink;
	
	public ViewLeadPage verifytextfname(String data) {
		verifyExactText(elefname, data);
		return this;
				
	}
	public ViewLeadPage verifydupfname() {
		
		verifyExactText(elefname,text1);
		return this;
				
	}
	public ViewLeadPage verifytextcname(String data) {
		verifyPartialText(elecname, data);
		return this;
				
	}
	public EditLeadpage clickonedit() {
		click(editlink);
		return new EditLeadpage();
				
	}
	public MyLeadPage clickondelete() {
		click(deletelink);
		return new MyLeadPage();
				
	}
	public DuplicateLeadPage clickonduplicate() {
		click(duplicatelink);
		return new DuplicateLeadPage();
				
	}
	
		
	
	
	
	

}
