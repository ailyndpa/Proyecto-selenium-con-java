import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntrocution {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/NO BORRAR LILY/PROBADOR/Cursos/Selenium con java/CURSO PAGADO POR JORGE/Chromedriver v104/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		String titulo=driver.getTitle();
		System.out.println(titulo);
		//String errorMessageFormat= "El titulo no es 'Rahul Shetty Academy'";
		//Assert.isTrue(true, errorMessageFormat, titulo=="Rahul Shetty Academy");
		
	}

}
