
package automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		HomePage hp = new HomePage();

		hp.getUrl(driver);
		Thread.sleep(2000);
		driver.getCurrentUrl();
		String title = driver.getTitle();

		// number 3
		if (title.equalsIgnoreCase("automation exercise")) {
			System.out.println("You are on the right page");
		}

		// number 4
		WebElement element1 = driver.findElement(By.xpath("//i[@class = 'fa fa-lock']"));
		element1.click();

		// number 5
		WebElement element2 = driver.findElement(By.xpath("//div[@class = 'signup-form']"));
		if (element2.isDisplayed()) {
			System.out.println("true");
		}

		Thread.sleep(2000);

		// number 6
		WebElement fn = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		fn.sendKeys("Marjia Anwar");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@data-qa = 'signup-email']"));
		email.sendKeys("manwar2617@gmail.com");
		Thread.sleep(2000);

		// number 7
		WebElement signUp = driver.findElement(By.xpath("//button[@data-qa = 'signup-button']"));
		signUp.click();
		Thread.sleep(2000);
		
	//	WebElement message = driver.findElement(By.xpath("//p[contains(text(),'Email Address')]"));
	//	if(message.isDisplayed()) {
			
	//	}

		// number 8
		WebElement verify = driver
				.findElement(By.xpath(" //div[@class ='login-form']//b[text() ='Enter Account Information']"));

		if (verify.isDisplayed()) {
			System.out.println("Enter Account Information is visible");
		}

		// number 9

		WebElement title1 = driver.findElement(By.xpath("//input[@id = 'id_gender2']"));
		title1.click();
		Thread.sleep(3000);

		WebElement name = driver.findElement(By.xpath(" //input[@id='name']"));
		name.clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath(" //input[@id='name']")).sendKeys("Marjia Anwar");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@type = 'password']"));
		password.sendKeys("rahman");
		Thread.sleep(2000);

		WebElement date = driver.findElement(By.xpath("//select[@name = 'days']"));
		Select select1 = new Select(date);
		select1.selectByIndex(26);
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id = 'months']"));
		Select select2 = new Select(month);
        select2.selectByContainsVisibleText("July");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select select3 = new Select(year);
		select3.selectByVisibleText("1987");
		Thread.sleep(5000);
		
		// number 10
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement newsletter = driver.findElement(By.xpath("//input[@id = 'newsletter']"));
		Actions action = new Actions(driver);
		action.scrollToElement(newsletter).perform();
		Thread.sleep(2000);
		newsletter.click();
		Thread.sleep(2000);
		
		// number 11
		
		WebElement offer = driver.findElement(By.xpath("//input[@id='optin']"));
		offer.click();
		Thread.sleep(2000);
		
		// number 12
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		firstName.sendKeys("Marjia");
		Thread.sleep(2000);
		
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastName.sendKeys("Anwar");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.xpath("//input[@id='address1']"));
		address.sendKeys("8010 Tiffany Ln");
		Thread.sleep(2000);
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByContainsVisibleText("United");
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
		state.sendKeys("MaryLand");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Lanham");
		Thread.sleep(2000);
		
		WebElement zip = driver.findElement(By.xpath("//input[@id='zipcode']"));
		zip.sendKeys("20706");
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mobile.sendKeys("301-803-8667");
		Thread.sleep(2000);
		
		//number 13
		
		WebElement create = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
		create.click();
		Thread.sleep(2000);
		
		// number 14 and 15
		WebElement verified = driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
		
		   if(verified.isDisplayed()) {
			   driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		   }
		   
		   Thread.sleep(2000);
		 // number 16
		
		   WebElement visible = driver.findElement(By.xpath("//b[text()='Marjia Anwar']"));
		   
		   if(visible.isDisplayed()) {
			   System.out.println("login imformation is visible");
		   }
		   
		   Thread.sleep(2000);
		   
		 // number 17
		   WebElement delete = driver.findElement(By.xpath("//a[contains (text(),'Delete Account')]"));
		   
		   delete.click();
		   Thread.sleep(2000);
		   
		 // number 18
		   WebElement deleted = driver.findElement(By.xpath("//b[contains(text(),'Deleted')]"));
		    
		   if(deleted.isDisplayed()) {
			   WebElement finish = driver.findElement(By.xpath("//a[text()='Continue']"));
			   finish.click();
		   }
		   
		   Thread.sleep(2000);

		driver.close();
	}

}
