package UserModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Nagbaba {
@Test
public void babaji_Test() {
	Reporter.log("baba ka swaghat new user mea", true);
	WebDriver driver= new Chromedriver();
	driver.get("https://localhost:8888");
	driver.findelement(by.xpath("//a[text='button']")).click();
}
}
