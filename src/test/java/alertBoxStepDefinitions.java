import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.Configuration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

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
    @Then("success message should be displayed")
    public void success_message_should_be_displayed() {
        $("#confirmreturn").shouldHave(text("true"));
    }

    @When("user clicks on the Cancel button")
    public void user_clicks_on_the_cancel_button() {
        dismiss("I am a confirm alert");
    }
    @Then("failure message should be displayed")
    public void failure_message_should_be_displayed() {
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

}
