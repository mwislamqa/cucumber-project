package testSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginC {

	WebDriver driver;

	@Before
	public void beforeScenario(Scenario scenario) {

		System.out.println("--------------------------------");
		System.out.println(scenario.getName() +" :"+ "status  :" + scenario.getStatus());
		System.out.println("--------------------------------");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@After
	public void afterScenario(Scenario scenario) throws InterruptedException {

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "Screenshots");
		}
		System.out.println("--------------------------------");
		System.out.println(scenario.getName() +" :"+ "status  :" + scenario.getStatus());
		System.out.println("--------------------------------");
		if (driver != null) {
			Thread.sleep(4000);
			driver.close();
		}
	}

	@Given("^user get the URL$")
	public void user_get_the_URL() throws Throwable {
		driver.get("https://www.saucedemo.com/");
		System.out.println("url");
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String userName, String password) throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		System.out.println("action");
	}

	@Then("^user able to login scessfully$")
	public void user_able_to_login_scessfully() throws Throwable {
		System.out.println("validation");
	}

}
