package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loguin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/NO BORRAR LILY/PROBADOR/Cursos/Selenium con java/CURSO PAGADO POR JORGE/Chromedriver v104/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/sign_in']")).click();//por tagname[atributo='valor']
		driver.findElement(By.cssSelector("#email")).sendKeys("jorgeyosmiel90@gmail.com");// css selector por id
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.className("auth-flash-error")).getText());
		
		
		
		
	}

}
