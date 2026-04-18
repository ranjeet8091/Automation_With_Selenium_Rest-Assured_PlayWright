package dummyTest;

import org.testng.annotations.Test;

import dataProvider.TestAnnotationsDataProvider;

public class DummyTestdataProvider {

	@Test(dataProvider = "data-provider", dataProviderClass = TestAnnotationsDataProvider.class)
	public void printTest(String username, String password) {
		System.out.print(username + " " + password);
	}
}
