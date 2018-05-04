
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStoreTest {

	WebDriver driver = null;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/Tiffany/Development/Chrome_Driver/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void buyDressTest() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");

		SearchFeature search = PageFactory.initElements(driver, SearchFeature.class);
		DressPage buyDress = PageFactory.initElements(driver, DressPage.class);
		ShirtPage buyShirt = PageFactory.initElements(driver, ShirtPage.class);
		
		search.searchFor("dress");
		
		WebElement dressElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a"));
		dressElement.click();
		
		buyDress.editBuy(3);
		
		search.searchFor("shirt");
		
		WebElement shirtElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
		shirtElement.click();
		
		buyShirt.editBuy(5);
		
		Thread.sleep(2000);
		
		WebElement checkTotal = driver.findElement(By.xpath("//*[@id=\"total_price\"]"));
		assertEquals("$171.49", checkTotal.getText());
	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();

	}

}
