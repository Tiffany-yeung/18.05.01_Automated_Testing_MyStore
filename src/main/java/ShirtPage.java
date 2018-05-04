import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShirtPage {

	@FindBy(id = "quantity_wanted")
	private WebElement buyEdit;

	public void editBuy(int quantityNumber) throws InterruptedException {

		// edit quantity
		buyEdit.clear();
		buyEdit.sendKeys(String.valueOf(quantityNumber));
		Thread.sleep(1000);

		// change size to L
		buyEdit.findElement(By.xpath("//*[@id=\"group_1\"]/option[3]")).click();
		Thread.sleep(1000);

		// select blue
		buyEdit.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
		Thread.sleep(2000);

		// click add to cart
		buyEdit.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		Thread.sleep(2000);

		// click proceed to checkout
		buyEdit.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		Thread.sleep(2000);

	}

}
