package MicrosoftLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Microsoft {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://WWW.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Microsoft login"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		driver.findElement(By.id("id__4")).click();
		driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("allanpaul150602@gmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("i0118")).sendKeys("Allan@20");
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.xpath("//*[@id=\"acceptButton\"]")).click();
        System.out.println("Microsoft login page");
         }
}
