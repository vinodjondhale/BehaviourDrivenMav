package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Vinod J\\Desktop\\Selenium\\WorkSpaces\\ActiTimeMaven\\BehaviourDrivenMav\\src\\test\\java\\features",
		glue = {"stepDefinition"},
		plugin= {"pretty","html:target"}	
		)
public class TestRunner {

}
