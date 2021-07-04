package ui;

import org.testng.annotations.Test;

public class SameTestNames {

	@Test(priority = 1, description="This is of priority 1")
	public void Test1() {
		System.out.println("This is Test1");
	}

	@Test(priority = -1)
	public void Test2() {
		System.out.println("This is Test2");
	}

	@Test(priority = -2)
	public void Test3() {
		System.out.println("This is Test3");
	}

}
