package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class Bill_Pay  extends BaseClass{
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
	public WebElement username;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
	public WebElement password;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
	public WebElement L_button;
	@FindBy(xpath = "//a[contains(text(),'Bill Pay')]")
	public WebElement Bill_link;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]")
	public WebElement Payee_name;
	@FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
	public WebElement Address;
	@FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
	public WebElement City;
	@FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
	public WebElement State;
	@FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
	public WebElement Zip_code;
	@FindBy(xpath = "//tbody/tr[6]/td[2]/input[1]")
	public WebElement Phone;
	@FindBy(xpath = "//tbody/tr[8]/td[2]/input[1]")
	public WebElement Account_no;
	@FindBy(xpath = "//tbody/tr[9]/td[2]/input[1]")
	public WebElement Veryfy_account_no;
	@FindBy(xpath = "//tbody/tr[11]/td[2]/input[1]")
	public WebElement Amount;
	@FindBy(xpath = "//tbody/tr[13]/td[2]/select[1]")
	public WebElement From_account;
	@FindBy(xpath = "//tbody/tr[14]/td[2]/input[1]")
	public WebElement Send_button;
	
	public Bill_Pay () {
		PageFactory.initElements(driver, this);
	}
	public void billpay() throws InterruptedException {
		username.sendKeys("Trushit");
		password.sendKeys("Trushit@12345");
		L_button.click();
		Thread.sleep(3000);
		Bill_link.click();
		Thread.sleep(3000);
		Payee_name.sendKeys("Grishma");
		Address.sendKeys("23 marsha drive");
		City.sendKeys("Scarboough");
		State.sendKeys("Ontario");
		Zip_code.sendKeys("M1T 2S3");
		Phone.sendKeys("1234567890");
		Account_no.sendKeys("12345");
		Veryfy_account_no.sendKeys("12345");
		Amount.sendKeys("500");
		Select From=new Select(From_account);
		From.selectByIndex(1);
		Send_button.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
