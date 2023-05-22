package OverviewOfCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/SE20464095/eclipse-workspace/IRCTC/src/main/java/OverviewOfCucumber/pet.feature",
glue= {"OverviewOfCucumber"}
 // tags = "@Signin"
 
)

public class Runnerpetstore extends AbstractTestNGCucumberTests {

}
