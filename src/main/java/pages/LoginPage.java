package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement Login;

	public void UserName(String username) {
		UserName.sendKeys(username);
	}

	public void Password(String password) {
		Password.sendKeys(password);
	}

	public void Login() {
		Login.click();
	}

	public void enterCredentials(String userName, String password) {
		UserName.sendKeys(userName);
		Password.sendKeys(password);
	}

	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);
	File sourcefile=	ts.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat format= new SimpleDateFormat("MMddyy_HHmmss");
	Date date = new Date();
	String label = format.format(date);
	String currentdirectory = System.getProperty("user.dir");
	FileUtils.copyFile(sourcefile, new File(currentdirectory + "/screenshot/" + label + ".png"));
	
	}
}
