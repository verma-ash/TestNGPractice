package ui;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {

	@BeforeGroups(value = {"regresstion", "smoke"})
	public void beforeGroup() {
		System.out.println("before Group Regression");
	}

	@AfterGroups(value = "regresstion")
	public void aftereGroup() {
		System.out.println("after Group Regression");
	}

	@Test(groups = { "regresstion" })
	public void test1() {
		System.out.println("test1 regresstion");
	}

	@Test(groups = { "regresstion", "smoke" })
	public void test2() {
		System.out.println("test2 regresstion, smoke");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("test3 smoke");
	}

	@Test(groups = { "regresstion" })
	public void test4() {
		System.out.println("test4");
	}

}
