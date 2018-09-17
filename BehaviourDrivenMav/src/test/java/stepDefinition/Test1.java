package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {
public WebDriver driver;
@Given("^User Launches a Browser$")
public void user_Launches_a_Browser() throws Throwable {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();

}

@When("^User navigates to Google Homepage$")
public void user_navigates_to_Google_Homepage() throws Throwable {
    driver.get("https://www.google.com/");
}

@Then("^Title is Google$")
public void title_is_Google() throws Throwable {
   String aTitle=driver.getTitle();
   String eTitle="Google";
   Assert.assertEquals(aTitle, eTitle);
   driver.close();
    
}


}
