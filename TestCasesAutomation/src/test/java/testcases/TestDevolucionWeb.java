package testcases;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import time.Time;

@TestMethodOrder(OrderAnnotation.class)
public class TestDevolucionWeb {
	private WebDriver driver;
	Time wait = new Time();

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devo.cert.jetsm.art/cl/es/devoluciones");
		// driver.get("https://www.google.cl/");
	}

	@Ignore
	@Test
	@Order(1)
	public void testPlaceholderPNREmailChile() {
		wait.Tiempo(3000);
		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador", placehd);
	}

	@Ignore
	@Test
	@Order(2)
	public void testPlaceholderPNREmailEnglish() {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaEnglish = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[4]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaEnglish.click();
		wait.Tiempo(5000);

		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Passenger last name or buyer email", placehd);
	}

	@Ignore
	@Test
	@Order(3)
	public void testPlaceholderPNREmailPeru() {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaPeru = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[3]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaPeru.click();
		wait.Tiempo(5000);

		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador", placehd);
	}

	@Ignore
	@Test
	@Order(4)
	public void testPlaceholderPNREmailArgentina() {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaArgentina = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[2]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaArgentina.click();
		wait.Tiempo(5000);
 
		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador", placehd);
	}

	@Ignore
	@Test
	@Order(5)
	public void testPlaceholderPNREmailColombia() {
		wait.Tiempo(4000);
		
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaColombia = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[6]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaColombia.click();
		wait.Tiempo(5000);

		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador", placehd);
	}
	
	@Ignore
	@Test
	@Order(6)
	public void testPlaceholderPNREmailBrasil() {
		wait.Tiempo(4000);
		
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaBrasil = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[5]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaBrasil.click();
		wait.Tiempo(5000);

		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Sobrenome do passageiro ou endereço de e-mail do comprador", placehd);
	}
	
	@Ignore
	@Test
	@Order(7)
	public void testPlaceholderPNREmailUruguay() {
		wait.Tiempo(4000);
		
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaUruguay = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[7]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaUruguay.click();
		wait.Tiempo(5000);

		WebElement pnrEmail = driver.findElement(By.name("PnrEmail"));
		String placehd = pnrEmail.getAttribute("placeholder");

		// Se verifica el texto dentro del textbox PnrEmail
		assertEquals("Apellido Pasajero o Email del Comprador", placehd);
	}
	
	
    @Ignore
	@Test
	@Order(8)
	public void ToolTipPNREmailChile() throws IOException {
		wait.Tiempo(3000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailChile.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	@Ignore
	@Test
	@Order(9)
	public void ToolTipPNREmailEnglish() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaEnglish = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[4]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaEnglish.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailEnglish.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	@Ignore
	@Test
	@Order(10)
	public void ToolTipPNREmailPeru() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaPeru = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[3]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaPeru.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailPeru.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	@Ignore
	@Test
	@Order(11)
	public void ToolTipPNREmailArgentina() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaArgentina = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[2]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaArgentina.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailArgentina.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	@Ignore
	@Test
	@Order(12)
	public void ToolTipPNREmailColombia() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaColombia = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[6]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaColombia.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailColombia.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	@Ignore
	@Test
	@Order(13)
	public void ToolTipPNREmailBrasil() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaBrasil = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[5]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaBrasil.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		wait.Tiempo(3000);
		
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver, we);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailBrasil.png");
		System.out.println(file);
		//ImageIO.write(shot.getImage(), "PNG", file);
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}
	
	
	@Test
	@Order(14)
	public void ToolTipPNREmailUruguay() throws IOException {
		wait.Tiempo(4000);
		WebElement culturaChile = driver.findElement (By.cssSelector("#dropdown01"));
		WebElement culturaUruguay = driver.findElement(By.xpath("//*[@id=\"dd\"]/div[7]/a"));

		culturaChile.click();
		wait.Tiempo(4000);
		culturaUruguay.click();
		wait.Tiempo(5000);
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]"));
		action.moveToElement(we).build().perform();
		
		
		wait.Tiempo(3000);
				
		//Capture and store logo image
		Screenshot shot = new AShot().takeScreenshot(driver);
		File file = new File(System.getProperty("user.dir")+"\\ImageFolder\\toolTipEmailUruguay.png");
		System.out.println(file);
		ImageIO.write(shot.getImage(), "PNG", file);
		
		
		//Getting Expected Image
		BufferedImage expectedImg = ImageIO.read(file);
		
		//Getting Actual Image
		BufferedImage actualImg = shot.getImage();
		
		//Image Comparison
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff dif = imgDiff.makeDiff(expectedImg, actualImg);
		
		if(dif.hasDiff()){
			  System.out.println("Both images are different");
		}else {
			  System.out.println("Both images are same");
		}
		
		assertEquals(false,dif.hasDiff());
	
	}

	/*
	 * @Test public void testGooglePage() { WebElement searchbox =
	 * driver.findElement(By.name("q"));
	 * 
	 * searchbox.clear(); searchbox.sendKeys("QA"); searchbox.submit(); // Enter
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * assertEquals("QA - Buscar con Google",driver.getTitle());
	 * 
	 * }
	 */
	
	

	@After
	public void teardDown() {
		driver.quit();
	}

}
