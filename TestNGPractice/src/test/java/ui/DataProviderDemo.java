package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "dataSet1")
	public void testPrints1(String userName, String password) {

//		System.out.println("i am extra method");
		System.out.println(userName + "  " + password);

	}
	
	@Test(dataProvider = "dataSet2")
	public void testPrints2(String userName, String password) {

		System.out.println(userName + "  " + password);
		
	}
	
	@Test(dataProvider = "dataSetHouse", dataProviderClass = DataHouse.class)
	public void testPrints3(String userName, String password, String mobile) {

//		System.out.println("i am extra method");
		System.out.println(userName + "  " + password + "  " + mobile);

	}

	@DataProvider(name = "dataSet1")
	public Object[][] dataStore1() {

		Object[][] datastore = new Object[4][2];
		datastore[0][0] = "User1";
		datastore[0][1] = "Pass1";
		datastore[1][0] = "User2";
		datastore[1][1] = "Pass2";
		datastore[2][0] = "User3";
		datastore[2][1] = "Pass3";
		datastore[3][0] = "User4";
		datastore[3][1] = "Pass4";
		return datastore;
	}
	
	@DataProvider(name = "dataSet2")
	public Object[][] dataStore2() {

		Object[][] datastore = new Object[][] {
			{"User1", "Pass1"},
			{"User2", "Pass2"},
			{"User3", "Pass3"},
			{"User4", "Pass4"},
		};
		return datastore;
	}

}
