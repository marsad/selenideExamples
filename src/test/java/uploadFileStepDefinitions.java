import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

public class uploadFileStepDefinitions {

    @Given("an open browser with page Upload a File")
    public void an_open_browser_with_page_upload_a_file() {
        open("https://testpages.herokuapp.com/styled/file-upload-test.html");
        sleep(500);
    }

    @When("user selects image file from its pc")
    public void user_selects_image_file_from_its_pc() {
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

    @Then("the message about successful image upload should appear")
    public void the_message_about_successful_image_upload_should_appear() {
        $("h2").shouldHave(text("You uploaded this image:"));
    }

    @When("user selects document file from its pc")
    public void user_selects_document_file_from_its_pc() {
        $("#fileinput").uploadFile(new File("src/test/data/SamplePDFDoc.pdf"));
    }

    @When("selects radio button A General File")
    public void selects_radio_button_a_general_file() {
        $("#itsafile").selectRadio("text");
    }
    @Then("the message about successful document upload should appear")
    public void the_message_about_successful_document_upload_should_appear() {
        $("h2").shouldHave(text("You uploaded this file:"));
    }

}
