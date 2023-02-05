package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class Transfer_funds extends BaseClass{
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
	public WebElement username;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
	public WebElement password;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
	public WebElement L_button;
	@FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
	public WebElement Transfer_link;
	@FindBy(xpath = "//input[@id='amount']")
	public WebElement Amount;
	@FindBy(xpath = "//select[@id='fromAccountId']")
	public WebElement From_account;
	@FindBy(xpath = "//select[@id='toAccountId']")
	public WebElement To_Account;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[2]/input[1]")
	public WebElement Transfer_button;
	
	
	public Transfer_funds() {
		PageFactory.initElements(driver, this);
	}
	public void transfer_funds() throws InterruptedException {
		username.sendKeys("Trushit");
		password.sendKeys("Trushit@12345");
		L_button.click();
		Thread.sleep(2000);
		Transfer_link.click();
		Amount.sendKeys("200");
		Select From=new Select(From_account);
		From.selectByIndex(1);
		Thread.sleep(2000);
		Select To=new Select(To_Account);
		To.selectByIndex(1);
		Thread.sleep(2000);
		Transfer_button.click();
		Thread.sleep(3000);
		
		
				
		
	}
	

}
