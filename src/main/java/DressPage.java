import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage {

	@FindBy(id = "quantity_wanted")
	private WebElement buyEdit;

	public void editBuy(int quantityNumber) throws InterruptedException {

		// edit quantity
		buyEdit.clear();
		buyEdit.sendKeys(String.valueOf(quantityNumber));
		Thread.sleep(1000);
		
		// change size to M
		buyEdit.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
		Thread.sleep(1000);
		
		// select orange
		buyEdit.findElement(By.xpath("//*[@id=\"color_13\"]")).click();
		
		// click add to cart
		buyEdit.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
		Thread.sleep(2000);
		
		// click continue shopping
		buyEdit.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
		
	}

}
