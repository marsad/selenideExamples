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

import java.io.File;

public class fillFormStepDefinitions {

    @Given("an open browser with page Form Example")
    public void an_open_browser_with_page_form_example() {
        open("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        sleep(500);
    }
    @When("user fills the username")
    public void user_fills_the_username() {
        $("[name=username]").setValue("johny");
    }
    @When("user fills the password")
    public void user_fills_the_password() {
        $("[name=password]").setValue("mypass123");
    }
    @When("user fills the comment")
    public void user_fills_the_comment() {
        $("[name=comments]").setValue("This is my test comment!");
    }
    @When("user selects the file")
    public void user_selects_the_file() {

        $("[name=filename]").uploadFile(new File("src/test/data/SampleJPGImg.jpg"));
    }
    @When("user selects the checkbox3")
    public void user_selects_the_checkbox3() {
        $(By.name("checkboxes[]")).setSelected(true);
        $(By.name("checkboxes[]")).shouldBe(selected);
        $(By.name("checkboxes[]")).shouldBe(checked);

        $(By.name("checkboxes[]")).setSelected(true);
        $(By.name("checkboxes[]")).shouldBe(selected);
        $(By.name("checkboxes[]")).shouldBe(checked);

        sleep(5000);
    }
    @When("user selects the radiobutton")
    public void user_selects_the_radiobutton() {
        $(By.name("radioval")).selectRadio("rd1");

        sleep(5000);
    }
    @When("user selects multiple values")
    public void user_selects_multiple_values() {
        $(By.name("multipleselect[]")).selectOptionByValue("ms3");
        $(By.name("multipleselect[]")).selectOptionByValue("ms4");
    }

    @When("user selects the item5 from the dropdown")
    public void user_selects_the_item5_from_the_dropdown() {
        $(By.("dropdown")).selectOptionByValue("dd5");
    }
    @When("user submits the form")
    public void user_submits_the_form() {
        $(By.name("submitbutton")).sele("submit").click();
    }

    @Then("the successful message about submission should appear")
    public void the_successful_message_about_submission_should_appear() {
        $("p").shouldHave(text("You submitted a form. The details below show the values you entered for processing."));

        sleep(5000);
    }

}
