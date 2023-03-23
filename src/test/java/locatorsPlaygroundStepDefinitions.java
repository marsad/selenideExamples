import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

import org.openqa.selenium.By;

import com.codeborne.selenide.Configuration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class locatorsPlaygroundStepDefinitions {
    @Given("an open browser with page Find By Playground - Locator Examples")
    public void openFindByPlayground() {
        open("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        sleep(500);
    }

    @When("a title is visible on the page")
    public void a_title_is_visible_on_the_page() {
        $("h1").shouldHave(text("Find By Playground - Locator Examples"));
    }

    @Then("the found paragraph should contain A letter")
    public void the_found_paragraph_should_contain_A_letter() {
        $("#p1").shouldHave(text("This is a paragraph text"));
    }

    @Then("the found paragraph should contain F letter")
    public void the_found_paragraph_should_contain_F_letter() {
        $(By.name("pName6")).shouldHave(text("This is f paragraph text"));
    }

}
