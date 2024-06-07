package TestesSelenium;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
//		System.setProperty("webdriver.geckod.driver", "C:\\Users\\cyber\\Downloads\\selenium-drivers\\chrome.exe");
//		System.setProperty("webdriver.geckod.driver", "C:\\Users\\cyber\\Downloads\\selenium-drivers\\geckodriver.exe");
		
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		// Configurar uma posição manualmente para o navegador (para usar ao trabalhar com dois monitores)
		//driver.manage().window().setPosition(new Point(100, 100));
		driver.manage().window().setSize(new Dimension(1200, 765));
		//driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
		// Mata a instancia do browser e a execuão do driver
		driver.quit();
	}
}
