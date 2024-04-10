package retrack.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OutboundReferral_objects {

	//creating objects using page object factory 
		@FindBy(xpath="OutBound Referral Dropdown")
		WebElement outbound_nav_drpdwn;
		
		@FindBy(xpath ="Outbound Draft")
		WebElement outbound_draft;
		
		@FindBy(className ="Outbound PreAuth")
		WebElement outbound_preauth;
		
		@FindBy(linkText = "Outbound Requested")
		WebElement outbound_requested;
		
		@FindBy(xpath="Outbound Received")
		WebElement outbound_received;
		
		@FindBy(xpath="Outbound Accepted")
		WebElement outbound_accepted;
		
		@FindBy(xpath="Outbound Rejected")
		WebElement outbound_rejected;
		
		@FindBy(xpath="Outbound Appointment")
		WebElement outbound_appointment;
		
		@FindBy(xpath="Outbound Cancelled")
		WebElement outbound_cancel;
		
		@FindBy(xpath="Outbound Completed")
		WebElement outbound_cpmlt;
		
		@FindBy(xpath="Outbound Unknown")
		WebElement outbound_unkwn;
		
		@FindBy(xpath="Outbound All")
		WebElement outbound_all;
		
}
