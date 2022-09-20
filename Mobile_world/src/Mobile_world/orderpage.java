package Mobile_world;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class orderpage {
    @Test
    public void orderMethod(){
        // TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:/Users/prathiksha.v/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get(" https://mobileworld.banyanpro.com/");
           orderlandingpage lp = new orderlandingpage(driver);
           
           lp.ordername("Prathiksha","V","prathi12@gmail.com", "prathi@12", "9686268843","Bombay dying", "Yeshwanthpur","Bangalore", "54362673456", "1", "0");
         



   }
}