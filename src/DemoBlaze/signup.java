package DemoBlaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;

public class signup {

	public static void main(String[] args) 
	{
	    // Initialize Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Open the project Url 
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		//Get title of the opened page & Verify with Expected Title
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		String Expectedtitle = "STORE";
		if(Actualtitle.contentEquals(Expectedtitle))
		{
			System.out.println("paased: " +Expectedtitle);
		}
		else
		{
			System.out.println("failed");
		}
		
		//Click on Sign up at the Home page
		driver.findElement(By.xpath("//*[@id='signin2']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.xpath("//*[@id='sign-username']"));
		username.sendKeys("testing0111");
		WebElement password = driver.findElement(By.xpath("//*[@id='sign-password']"));
		password.sendKeys("testing0111");
		driver.findElement(By.xpath("(//*[text()='Sign up'])[2]")).click();
		
		Alert alert = driver.switchTo().alert();
		 // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        		
        // Accepting alert		
        alert.accept();	
		
	}

}
