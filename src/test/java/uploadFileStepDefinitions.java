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

public class uploadFileStepDefinitions {

    @Given("an open browser with page Upload a File")
    public void an_open_browser_with_page_upload_a_file() {
        open("https://testpages.herokuapp.com/styled/file-upload-test.html");
        sleep(500);
    }

    @When("user selects the file from its pc")
    public void user_selects_the_file_from_its_pc() {
        $("#fileinput").uploadFile(new File("src/test/data/SampleJPGImg.jpg"));
    }

    @When("selects radio button Image")
    public void selects_radio_button_image() {
        $("#itsanimage").selectRadio("image");
    }

    @When("clicks on Upload button")
    public void clicks_on_upload_button() {
        $(By.name("upload")).click();
    }

    @Then("the success message should appear on the page")
    public void the_success_message_should_appear_on_the_page() {
        $("h2").shouldHave(text("You uploaded this image:"));
    }

}
