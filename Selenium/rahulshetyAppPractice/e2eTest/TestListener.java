package e2eTest;
import utilities.Driver;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
    	Driver dr = new Driver();
    	try {
			dr.screenShot(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Test Failed: " + result.getName());
        System.out.println("Testing on failure");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        System.out.println("Testing on Pass");
    }
    
//    When you going to use paste this in testng.xml
//    <listeners>
//	<listener class-name="listeners.TestListener" />
//</listeners>
}





