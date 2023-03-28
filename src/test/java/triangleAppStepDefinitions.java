import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class triangleAppStepDefinitions {

    @Given("an open browser with page Triangle")
    public void an_open_browser_with_page_triangle() {
        open("https://testpages.herokuapp.com/styled/apps/triangle/triangle001.html");
        sleep(500);
    }
    @When("user fills the length of only two sides")
    public void user_fills_the_length_of_only_two_sides() {
        $("#side1").setValue("5");
        $("#side2").setValue("7");
    }
    @When("user submits the data")
    public void user_submits_the_data() {
        // Write code here that turns the phrase above into concrete actions
        $("#identify-triangle-action").click();
    }
    @Then("the error message Side {int} is missing should be displayed")
    public void the_error_message_side_is_missing_should_be_displayed(Integer int1) {
        $("#triangle-type").shouldHave(text("Error: Side is missing"));
    }
    @When("user fills the length of all three sides where sum of the length of any two sides is smaller than the length of the third side \\(negative)")
    public void user_fills_the_length_of_all_three_sides_where_sum_of_the_length_of_any_two_sides_is_smaller_than_the_length_of_the_third_side_negative() {
        $("#side1").setValue("1");
        $("#side2").setValue("2");
        $("#side3").setValue("3");
    }
    @Then("the error message Not a Triangle should be displayed")
    public void the_error_message_not_a_triangle_should_be_displayed() {
        $("#triangle-type").shouldHave(text("Error: Not a Triangle"));
    }
    @When("user fills the length of all three sides where all of them are equal")
    public void user_fills_the_length_of_all_three_sides_where_all_of_them_are_equal() {
        $("#side1").setValue("7");
        $("#side2").setValue("7");
        $("#side3").setValue("7");
    }
    @Then("the message Equilateral should be displayed")
    public void the_message_equilateral_should_be_displayed() {
        $("#triangle-type").shouldHave(text("Equilateral"));
    }
    @When("user fills all three sides where two of them are equal")
    public void user_fills_all_three_sides_where_two_of_them_are_equal() {
        $("#side1").setValue("5");
        $("#side2").setValue("5");
        $("#side3").setValue("3");
    }
    @Then("the message Isosceles should be displayed")
    public void the_message_isosceles_should_be_displayed() {
        $("#triangle-type").shouldHave(text("Isosceles"));
    }
    @When("user fills the length of all three sides which have different length")
    public void user_fills_the_length_of_all_three_sides_which_have_different_length() {
        $("#side1").setValue("4");
        $("#side2").setValue("5");
        $("#side3").setValue("6");
    }
    @Then("the message Scalene should be displayed")
    public void the_message_scalene_should_be_displayed() {
        $("#triangle-type").shouldHave(text("Scalene"));
    }
}
