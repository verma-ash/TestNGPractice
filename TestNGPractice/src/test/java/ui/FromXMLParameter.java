package ui;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FromXMLParameter {

	@Parameters({ "browser", "operatingSys" })
	@Test
	public void testingParameter(String parameter1, String operatingSys) {

		System.out.println(parameter1 + "  " + operatingSys);

	}

}
