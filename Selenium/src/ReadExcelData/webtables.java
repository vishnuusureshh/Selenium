
package ReadExcelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://myaccountqa.hrblock.net/mytax/");
			driver.findElement(By.id("username")).sendKeys("svqa_6717");
			driver.findElement(By.id("password")).sendKeys("Testing@1");
			driver.findElement(By.id("defaultSignInUser")).click();
			driver.findElement(By.id("resendsignInCode")).click();
			String name= driver.findElement(By.xpath("//*[@id='maindatacontent']/div[1]/fieldset/div[2]/dl/dd[1]/label")).getText();
			String[] parts = name.split(" ");
			String lastWord = parts[parts.length - 1];
		    driver.findElement(By.id("securityAnswer")).sendKeys(lastWord);
		    driver.findElement(By.xpath("//*[@id='box']")).click();
		    driver.findElement(By.id("defaultsecurityqn-next")).click();
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}


