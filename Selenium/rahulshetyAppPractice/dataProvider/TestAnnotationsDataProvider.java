package dataProvider;

import org.testng.annotations.DataProvider;

public class TestAnnotationsDataProvider {

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
            {"ranjeet@gmail.com", "Ranjeet@123"},
            {"ranjeett@gmail.com", "Ranjeet@123"},
            {"ranjeettiwari@gmail.com", " "}
        };
    }
}
