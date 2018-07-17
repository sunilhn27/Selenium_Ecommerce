package ListnersClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import Core.Core;

public class Listners extends Core implements ITestListener {

	public void onTestStart(ITestResult result) {
		rep.startTest(result.getName() + " Test started");
		Core.infoAndReport(result.getName() + " Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		Core.PassAndReport(result.getName() + " Test Passed");
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Core.FailAndReport(result.getName() + " Test Falied");
		try {
			Core.Screenshot(name);
			rep.attachScreenshot("I:\\REST API Testing\\WORKSPACE\\AutomationPractice\\Screenshots\\" + name + ".jpg");
			log.info("Succesfully Took The ScrenShot");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		Core.SkippedAndReport(result.getName() + " Test Skipped");
		rep.log(LogStatus.SKIP, "hi");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		rep.startTest("Test started" + context.getName());
		System.out.println("name " + context.getName());
	}

	public void onFinish(ITestContext context) {
		rep.endTest();

	}
}