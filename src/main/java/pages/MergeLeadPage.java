package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//input[@name='partyIdFrom']/following::img")
	private WebElement fromid;
	
	@FindBy(how=How.XPATH,using="//input[@name='partyIdTo']/following::img")
	private WebElement toid;
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement elemerge;
	
		
	
	public FindLeadPage clicktoid() {
		click(toid);
		switchToWindow(1);
		
		return new FindLeadPage();	
	}

	public FindLeadPage clickfrmid() {
		// TODO Auto-generated method stub
		click(fromid);
		switchToWindow(1);
		
		return new FindLeadPage();	
	}	
	
	public ViewLeadPage clickmerge() {
		click(elemerge);
		acceptAlert();
		return new ViewLeadPage();
	}
	
	
	
	
		
	
	
	
	

}
