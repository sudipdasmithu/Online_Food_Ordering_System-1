package projectPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

public class AddRestaurantTest {
	@Test
	public void resturantTest() {
	Reporter.log("Restaurant Added Successfully",true);
	
	}

	public void verifyRestaurantTest() {
		Reporter.log("Restaurant get added Successfully");
	}


}
