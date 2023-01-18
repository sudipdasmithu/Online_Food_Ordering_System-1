package projectPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AdminClass {
	
	@Test
	public void addRestaurant() {
		Reporter.log("Admin added restaurant Successfully",true);
	}
	
	@Test
	public void editRestaurant() {
		Reporter.log("Admin edited restaurant Successfully",true);
	}
	
	@Test
	public void deleteRestaurant() {
		Reporter.log("Admin deleted restaurant Successfully",true);
	}

}
