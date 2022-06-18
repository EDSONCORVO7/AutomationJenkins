package testcases;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import time.Time;

@TestMethodOrder(OrderAnnotation.class)
public class TestDevolucionWeb {
private WebDriver driver;
Time wait = new Time();
	
	@Before
	public void setUp( ) {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devo.cert.jetsm.art/cl/es/devoluciones");
		//driver.get("https://www.google.cl/");
	}
	
	//@Ignore
	@Test
	@Order(1)
	public void testPlaceholderPNREmailChile() {
		wait.Tiempo(3000);
		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");
		
		//Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador",placehd);
		
	}
	
	//@Ignore
	@Test
	@Order(2)
	public void testPlaceholderPNREmailEnglish() {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement(By.cssSelector("#dropdown01"));
		WebElement culturaEnglish = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[4]/a"));
		
		culturaChile.click(); 
		wait.Tiempo(4000);
		culturaEnglish.click();
		wait.Tiempo(5000);
		
		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");
		
		//Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Passenger last name or buyer email",placehd);
		
	}
	
	@Test
	@Order(3)
	public void testPlaceholderPNREmailPeru() {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement(By.cssSelector("#dropdown01"));
		WebElement culturaPeru = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[3]/a"));
		
		culturaChile.click();
		wait.Tiempo(4000);
		culturaPeru.click();
		wait.Tiempo(5000);
		
		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");
		
		//Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador",placehd);
		
	}
	
	/*
	@Test
	public void testGooglePage() {
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		searchbox.sendKeys("QA");
		searchbox.submit(); // Enter
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("QA - Buscar con Google",driver.getTitle());
		
	}
	*/
	
	@After
	public void teardDown() {
		driver.quit();
	}

}
