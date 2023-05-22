package Intro_to_BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/SE20464095/eclipse-workspace/IRCTC/src/main/java/Intro_to_BDD/Linkedinsignup.feature",
glue= {"Into_to_BDD"},
 tags = "@"
 
)

 
public class Runner {

}
