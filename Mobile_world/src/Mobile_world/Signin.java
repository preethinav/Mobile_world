package Mobile_world;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Signin {
    @Test
    public void Signin() throws InterruptedException



   {
        System.setProperty("webdriver.chrome.driver","C:/Users/prathiksha.v/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        String name =  "prathi12@gmail.com";
        String password = "prathi@12";
        
        
        landing_page.goTo();
        landing_page.character3(name, password);
       
        Thread.sleep(2000);
        driver.close();
       
        
        
    }
    
    @Test
    public void Signin2() throws InterruptedException
    {
        String name =  "prathi@12";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.character20(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void Signin3() throws InterruptedException
    {
        String name =  "V";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.character2(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
        
    }
    @Test
    public void Signin4() throws InterruptedException
    {
        String name =  "abcdefghijklmnodfrtyuist";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.character21(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void Signin5() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.validemail(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void Signin6() throws InterruptedException
    {
        String name =  "prath@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.unregisteremail(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void Signin7() throws InterruptedException
    {
        String name =  "prathi";
        String password = "prathi@12";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.validdetails(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void Signin8() throws InterruptedException
    {
        String name =  "Prathi";
        String password = "Prat";
        WebDriver driver = new ChromeDriver();
        landing_page landing_page = new landing_page(driver);
        landing_page.goTo();
        landing_page.pass2(name, password);
        landing_page.goTo();
        landing_page.character3(name, password);
        String ExpectedURL="https://mobileworld.banyanpro.com/sign.html";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        Thread.sleep(2000);
        driver.close();
    }
}
