package ui;

import org.testng.annotations.DataProvider;

public class DataHouse {

	@DataProvider(name = "dataSetHouse")
	public Object[][] dataStore() {

		Object[][] datastore = new Object[][] {
			{"User1", "Pass1" ,"mob1"},
			{"User2", "Pass2","mob2"},
			{"User3", "Pass3","mob3"},
			{"User4", "Pass4","mob3"},
		};
		return datastore;
	}
	
}
