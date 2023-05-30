package Project;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import utility.Capablity;

public class project extends Capablity{
		AndroidDriver<AndroidElement> driver;
		@BeforeTest
		public void setup() throws IOException, InterruptedException {
			startAppium().start();
			driver = hybridCapability();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
		
		@Test(priority = 0)
		public void Startup() throws InterruptedException{
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/link_2"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("(//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout)[2]"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"CB Hornet 160R\"))"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"7 days \"))"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/btnBookNow"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/llDateContainer"))))).perform();
			driver.findElementByAccessibilityId("31 May 2023").click();
			driver.findElement(By.xpath("//*[@text='OK']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
		}
		
		@Test(priority = 1)
		public void Bookings() throws InterruptedException {
			// TODO Auto-generated method stub
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='Bookings']"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/search_button"))))).perform();
			driver.findElement(By.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("activa");
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/search_close_btn"))))).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
		}
		@Test(priority = 2)
		public void Callus() throws InterruptedException {
			// TODO Auto-generated method stub
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Call Us\"))"))))).perform();
			driver.activateApp("com.forbinary.banjararide");
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			touchAction.press(PointOption.point(370, 1250)).waitAction().moveTo(PointOption.point(370, 200)).release().perform();
			Thread.sleep(1000);
			touchAction.press(PointOption.point(370, 1250)).waitAction().moveTo(PointOption.point(370, 200)).release().perform();
		}
		@Test(priority = 3)
		public void AboutUS() throws InterruptedException {
			// TODO Auto-generated method stub
			TouchAction touchAction = new TouchAction(driver);
			driver.activateApp("com.forbinary.banjararide");
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"About Us\")"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"About Company!\")"))))).perform();
			driver.navigate().back();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"Address And Contact Number.\")"))))).perform();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
		}
		
		@Test(priority = 4)
		public void Info_Center() throws InterruptedException {
			// TODO Auto-generated method stub
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByAccessibilityId("Open")))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"Information Center\")"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"Terms & Conditions\")"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(MobileBy.AndroidUIAutomator("text(\"Terms & Condition\")"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.forbinary.banjararide:id/llFileLinearLayout"))))).perform();
            driver.findElement(By.xpath("//*[@text='OK']")).click();
            Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();

		}
		@Test(priority = 5)
		public void Profile() throws InterruptedException {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='Profile']"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByAccessibilityId("Edit")))).perform();
			driver.findElement(By.xpath("//*[@text='jitender']")).clear();
			driver.findElementById("com.forbinary.banjararide:id/edtInputProfile").sendKeys("Updated Jitender");
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")))).perform();
		}
		@Test(priority = 6)
		public void Language_Change() {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='Change Language']"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='हिंदी']"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='भाषा बदलो']"))))).perform();
			touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//*[@text='ENGLISH']"))))).perform();
			driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
			touchAction.press(PointOption.point(370, 1250)).waitAction().moveTo(PointOption.point(370, 200)).release().perform();
		}
		
}
