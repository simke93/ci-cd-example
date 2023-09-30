package cucumber_example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {

    String input;

    Integer actual;

    @Given("I enter the text {string}")
    public void i_enter_the_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        input = string;
    }
    @When("I test given text for vowels")
    public void i_test_given_text_for_vowels() {
        // Write code here that turns the phrase above into concrete actions
        actual = VowelsCounter.count(input);
    }
    @Then("I should get result {int}")
    public void i_should_get_result(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(expected, actual);

    }
}


