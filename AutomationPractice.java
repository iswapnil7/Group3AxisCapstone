package Swapnil.Axis_Bank;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver d = new ChromeDriver();
	        System.out.println("Browser is opened");
	        d.manage().window().maximize();
	        d.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
	        System.out.println("Website is launched");

	        // 2. Enter name
	        d.findElement(By.id("name")).sendKeys("Gyandeep Sarma");
	        Thread.sleep(2000);
	        d.findElement(By.id("email")).clear();
	        Thread.sleep(2000);
	        d.findElement(By.id("email")).sendKeys("gyandeep@gmail.com");
	        Thread.sleep(2000);

	        // Print the updated name and email values
	        System.out.println("Updated Name: " + d.findElement(By.id("name")).getAttribute("value"));
	        System.out.println("Updated Email: " + d.findElement(By.id("email")).getAttribute("value"));

	        // 4. Enter phone number
	        d.findElement(By.id("phone")).sendKeys("8638288482");
	        Thread.sleep(2000);

	        // Print the phone number
	        String phoneNumber = d.findElement(By.id("phone")).getAttribute("value");
	        System.out.println("Phone Number: " + phoneNumber);
	        Thread.sleep(2000);

	        // 5. Clear the phone number
	        d.findElement(By.id("phone")).clear();
	        System.out.println("Phone Number cleared");
	        Thread.sleep(2000);

	        // Enter address
	        d.findElement(By.id("textarea")).sendKeys("Guwahati, India");
	        Thread.sleep(2000);

	        // 8. Drag and Drop operation
	        WebElement draggable = d.findElement(By.id("draggable"));
	        Thread.sleep(2000);
	        WebElement droppable = d.findElement(By.id("droppable"));
	        Thread.sleep(2000);
	        Actions actions = new Actions(d);
	        Thread.sleep(2000);
	        actions.dragAndDrop(draggable, droppable).perform();
	        Thread.sleep(2000);
	        System.out.println("Element dragged and dropped.");
	        Thread.sleep(2000);

	        // 9. Perform the double-click operation
	        WebElement doubleClickButton = d.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	        Thread.sleep(2000);
	        actions.doubleClick(doubleClickButton).perform();
	        Thread.sleep(2000);

	        // Verify the text in Field2
	        String field2Value = d.findElement(By.id("field2")).getAttribute("value");
	        System.out.println("Field2 Value after double click: " + field2Value);

	        // Close the driver
	        d.quit();
	    }
	}
