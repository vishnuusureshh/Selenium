package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;




public class libclass {

              public static void main(String[] args) throws InterruptedException {
                             // TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Sravya\\chromedriver_win32\\chromedriver.exe");

                             WebDriver driver = new ChromeDriver();
                             driver.get("https://myaccountqa.hrblock.net/"); 
                             Thread.sleep(3000);
                             driver.findElement(By.xpath("//a [@id='createID']")).click();
                             driver.findElement(By.xpath("//input [@id='email']")).sendKeys("ipsha.jain@hrblock.com");
                             driver.findElement(By.xpath("//input [@id='userName']")).sendKeys("hrblockij178");
                             driver.findElement(By.xpath("//input [@id='password']")).sendKeys("Testing123$");
                             driver.findElement(By.xpath("//input [@id='confirmpassword']")).sendKeys("Testing123$");
                             driver.findElement(By.xpath("//input [@type='button']")).click();
                             Select dd1 = new Select(driver.findElement(By.xpath("//select [@id='securityQuestion1']")));
                             dd1.selectByIndex(1);
                             driver.findElement(By.xpath("//input [@id='securityAnswer1']")).sendKeys("born");
                             Select dd2=new Select(driver.findElement(By.xpath("//select [@id='securityQuestion2']")));
                             dd2.selectByValue("2");
                             driver.findElement(By.xpath("//input [@id='securityAnswer2']")).sendKeys("job");
                             Select dd3=new Select(driver.findElement(By.xpath("//select [@id='securityQuestion3']")));
                             dd3.selectByVisibleText("What is the middle name of your youngest child?");
                             driver.findElement(By.xpath("//input [@id='securityAnswer3']")).sendKeys("child");
                             driver.findElement(By.xpath("//span [@id='termsbox']")).click();
                             driver.findElement(By.xpath("//input [@id='submitButton']")).click();
                             WebElement usernameHover=driver.findElement(By.id("maLi"));
                             Actions obj =new Actions (driver);
                             obj.moveToElement(usernameHover).perform();
                             Thread.sleep(2000);
                             usernameHover= driver.findElement(By.xpath("(//a[@title='Sign Out'])"));
                             obj.moveToElement(usernameHover).click().build().perform();
              }

}
