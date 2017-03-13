package pageObjects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
public class MainAccount_Menu {
		private static WebElement element = null;
		//Method to find profile link
		public static WebElement link_Profile(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='all-accounts']/li/ul/a[1]")));
			return element;
		}
		//Method to find security link
		public static WebElement link_Security(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='all-accounts']/li/ul/a[2]")));
			return element;
		}
		//Method to find logout link
		public static WebElement link_Logout(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='btn_logout']")));
			return element;
		}
		//Method to find Main Account link
		public static WebElement link_MainAccount(WebDriver driver){
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='main-logout']")));
			return element;
		}
}