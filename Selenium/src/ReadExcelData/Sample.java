package ReadExcelData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 


public class Sample {
    public static class calendarHanding {
    	 
        static int targetDay = 4;

        static int targetMonth = 6;

        static int targetYear = 1993;

        static int currenttDate = 0;

        static int currenttMonth = 0;

        static int currenttYear = 0;

        static int jumMonthBy = 0;

        static boolean increment = true;

        public static void getCurrentDayMonth() {

            Calendar cal = Calendar.getInstance();
            currenttDate = cal.get(Calendar.DAY_OF_MONTH);
            currenttMonth = cal.get(Calendar.MONTH) + 1;
            currenttYear = cal.get(Calendar.YEAR);
        }

        public static void getTargetDayMonthYear(String dateString) {
            int firstIndex = dateString.indexOf("/");
            int lastIndex = dateString.lastIndexOf("/");

            String day = dateString.substring(0, firstIndex);
            targetDay = Integer.parseInt(day);

            String month = dateString.substring(firstIndex + 1, lastIndex);
            targetMonth = Integer.parseInt(month);

            String year = dateString.substring(lastIndex + 1,dateString.length());
            targetYear = Integer.parseInt(year);

        }

        public static void calculateToHowManyMonthToJump() {

            if ((targetMonth - currenttMonth) > 0) {
                jumMonthBy = targetMonth - currenttMonth;

            } else {
                jumMonthBy = currenttMonth - targetMonth;
                increment = false;
            }
        }

        public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub
            String dateToSet = "20/12/2017";

            getCurrentDayMonth();
            System.out.println("Current System Date");
            System.out.println(currenttDate);
            System.out.println(currenttMonth);
            System.out.println(currenttYear);

            getTargetDayMonthYear(dateToSet);
            System.out.println("Date to Set");
            System.out.println(targetDay);
            System.out.println(targetMonth);
            System.out.println(targetYear);

            calculateToHowManyMonthToJump();
            System.out.println(jumMonthBy);
            System.out.println(increment);

            ChromeOptions options=new ChromeOptions();
    		options.addArguments("--disable-notifications");
    		System.setProperty("webdriver.chrome.driver", "C:\\Sravya\\chromedriver_win32\\chromedriver.exe");
    		WebDriver driver=new ChromeDriver(options); 
    		driver.get("https://www.redbus.in");
    		driver.manage().window().maximize();
    		 Thread.sleep(3000);
    		driver.findElement(By.id("src")).sendKeys("Chennai");
    		driver.findElement(By.id("dest")).sendKeys("Nellore");
            
           
           driver.findElement(By.xpath("//section[@id='search']/div/div[3]/span")).click();
        
            for (int i = 0; i < jumMonthBy; i++) {
                if (increment) {
                    driver.findElement(
                            By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
                } else {
                    driver.findElement(
                            By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[1]/button")).click();
                            
                }
                Thread.sleep(1000);

            }

           //driver.findElement(By.linkText(Integer.toString(targetDay))).click();
            driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]"));
        }
        }


}
