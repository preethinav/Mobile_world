import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/prathiksha.v/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("prathiksha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("V");
		driver.findElement(By.xpath(""));
		
	}
	

}
