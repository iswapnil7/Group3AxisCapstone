package Swapnil.Axis_Bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationYahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Maximize Browser");
		driver.navigate().to("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN&specId=yidregsimplified&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN");
		System.out.println("Website is Launched");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for the First Name field to be visible and enter value
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-firstName")));
        firstNameField.sendKeys("Swapnil");
        System.out.println("First Name Entered");

        // Wait for the Last Name field to be visible and enter value
        WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-lastName")));
        lastNameField.sendKeys("Khose");
        String FirstName = firstNameField.getAttribute("value");
        String LastName = lastNameField.getAttribute("value");
        System.out.println("Full Name is: " + FirstName + " " + LastName);

        // Wait for the Username field to be visible and enter value
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-userId")));
        usernameField.sendKeys("swapnilkhose123");
        Thread.sleep(2000);

        // Wait for the Password field to be visible and enter value
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-password")));
        passwordField.sendKeys("Passwordz@2024");
        Thread.sleep(2000);
        // Modifying the username value
        usernameField.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        usernameField.sendKeys("5");
        Thread.sleep(2000);
        String pswd = passwordField.getAttribute("value");
        System.out.println("Entered password is: " + pswd);

        // Select Month from dropdown
        WebElement monthDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"usernamereg-month\"]")));
        Select select = new Select(monthDropdown);
        select.selectByVisibleText("May");
        System.out.println("Month Selected");
        Thread.sleep(2000);

        // Enter Day and Year
        WebElement dayField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamereg-day")));
        dayField.sendKeys("7");
        Thread.sleep(2000);
        WebElement yearField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"usernamereg-year\"]")));
        yearField.sendKeys("2000");
        System.out.println("Day and Year Entered");
        Thread.sleep(2000);

        // Click on "Next" button
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"reg-submit-button\"]")));
        nextButton.click();
        System.out.println("Clicked on Next");

        // Wait for Phone number field to be visible and enter value
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"usernamereg-phone\"]")));
        phoneField.sendKeys("8830374212");
        Thread.sleep(2000);

        // Click on "Get code by text"
        WebElement getCodeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("reg-sms-button")));
        getCodeButton.click();
        System.out.println("Clicked on Get code By Text");
        Thread.sleep(2000);

        // Prompt user to complete CAPTCHA
        System.out.println("Please complete the reCAPTCHA manually and then press enter to continue....");

        // Wait for user to manually complete reCAPTCHA
        // Manually complete reCAPTCHA, then press Enter to continue

        // Go back to the previous page after CAPTCHA
        driver.navigate().back();

        // Close the driver
        driver.quit();
	}

}