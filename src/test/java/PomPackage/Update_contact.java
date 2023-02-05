package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class Update_contact extends BaseClass{
	
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
	public WebElement username;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
	public WebElement password;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
	public WebElement L_button;
	@FindBy(xpath = "//a[contains(text(),'Update Contact Info')]")
	public WebElement Update_link;
	@FindBy(xpath="//input[@id='customer.firstName']")
	public WebElement First_name ;
	@FindBy(xpath="//input[@id='customer.lastName']")
	public WebElement Last_name ;
	@FindBy(xpath="//input[@id='customer.address.street']")
	public WebElement Address ;
	@FindBy(xpath="//input[@id='customer.address.city']")
	public WebElement City ;
	@FindBy(xpath="//input[@id='customer.address.state']")
	public WebElement State ;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement Zip_code ;
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public WebElement Phone;
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[1]")
	public WebElement Update_button;
	
	public Update_contact() {
		PageFactory.initElements(driver, this);
	}
	public void update_contact() throws InterruptedException {
		username.sendKeys("Trushit");
		password.sendKeys("Trushit@12345");
		L_button.click();
		Thread.sleep(3000);
		Update_link.click();
		First_name.sendKeys("Grishma");
		Last_name.sendKeys("Pat");
		Address.sendKeys("24 marsha drive");
		City.sendKeys("scarborough");
		State.sendKeys("Ontario");
		Zip_code.sendKeys("M1T 2S3");
		Phone.sendKeys("0987654321");
		Update_button.click();
		Thread.sleep(3000);
	}
	
	
	
	

}

