import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class alertBoxStepDefinitions {

    @Given("an open browser with page Alert Box Examples")
    public void an_open_browser_with_page() {
        open("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        sleep(500);
    }

    @When("user clicks on the button Show alert box")
    public void user_clicks_on_the_button_show_alert_box() {
        WebElement alertBox = $("#alertexamples").shouldHave(value("Show alert box"));
        alertBox.click();
    }

    @Then("user can confirms the alert")
    public void the_alert_should_be_displayed() {
        confirm("I am an alert box!");
    }

    @When("user clicks on the button Show confirm box")
    public void user_clicks_on_the_button_show_confirm_box() {
        WebElement confirmBox = $("#confirmexample").shouldHave(value("Show confirm box"));
        confirmBox.click();
    }

    @When("user clicks on the OK button")
    public void user_clicks_on_the_ok_button() {
        confirm("I am a confirm alert");
    }

    @Then("the message: confirm returned true should be displayed")
    public void the_message_confirm_returned_true_should_be_displayed() {
        $("#confirmreturn").shouldHave(text("true"));
    }

    @When("user clicks on the Cancel button within alert")
    public void user_clicks_on_the_cancel_button_within_alert() {
        dismiss("I am a confirm alert");
    }

    @Then("the message: confirm returned false should be displayed")
    public void the_message_confirm_returned_false_should_be_displayed() {
        $("#confirmreturn").shouldHave(text("false"));
    }

    @When("user clicks on the button Show prompt box")
    public void user_clicks_on_the_button_show_prompt_box() {
        WebElement promptBox = $("#promptexample").shouldHave(value("Show prompt box"));
        promptBox.click();
    }

    @When("user confirms an alert without changing the text inside")
    public void user_confirms_an_alert_without_changing_the_text_inside() {
        confirm("I prompt you");

    }
    @Then("the message with unchanged text should be displayed")
    public void the_message_with_unchanged_text_should_be_displayed() {
        $("#promptreturn").shouldHave(text("change me"));

    }

    @When("user clicks on the Cancel button within prompt")
    public void user_clicks_on_the_cancel_button_within_prompt() {
        dismiss("I prompt you");
    }

    @Then("the message without any text should be displayed")
    public void the_message_without_any_text_should_be_displayed() {
        $("#promptexplanation").shouldHave(text("You clicked Cancel. 'prompt' returned"));
    }

    @When("user fills new text into the field")
    public void user_fills_new_text_into_the_field() {
        prompt("I prompt you", "This is my text!");
    }
    @Then("the message with filled text should be displayed")
    public void the_message_with_filled_text_should_be_displayed() {
        $("#promptreturn").shouldHave(text("This is my text!"));
    }



}
