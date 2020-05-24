package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Practicepage;

public class PracticepageSteps {
    Practicepage practicepage = new Practicepage();
    @Given("^user is on Practice page of LetsKodeit website$")
    public void user_is_on_Practice_page_of_LetsKodeit_website() throws Throwable {
    Thread.sleep(1000);
    practicepage.assertion();
    }

    @When("^user clicks all three radioButtons (\\d+)\\. BMW (\\d+)\\. Honda and (\\d+)\\. Benz$")
    public void user_clicks_all_three_radioButtons_BMW_Honda_and_Benz(int arg1, int arg2, int arg3) throws Throwable {
        practicepage.radioButton();     //along with boolean condition true/false
    }

    @Then("^user should be able to see it is selecting on above order$")
    public void user_should_be_able_to_see_it_is_selecting_on_above_order() throws Throwable {
    }
    @When("^user clicks on dropdown car menu and selects on Benz$")
    public void userClicksOnDropdownCarMenuAndSelectsOnBenz() {
    practicepage.selectclassMethod();
    }

    @Then("^user should be able to see Benz as selected option$")
    public void user_should_be_able_to_see_Benz_as_selected_option() throws Throwable {
    }

    @When("^user bring mouse cursor on MouseHoover and clicks on Top option from MouseHoover list$")
    public void user_bring_mouse_cursor_on_MouseHoover_and_clicks_on_Top_option_from_MouseHoover_list() throws Throwable {
    practicepage.actionClassMethod();
    }

    @Then("^user should able to see list of options first and then top of the page$")
    public void user_should_able_to_see_list_of_options_first_and_then_top_of_the_page() throws Throwable {
    }
    @When("^user types a course on search in iframe$")
    public void user_types_a_course_on_search_in_iframe() throws Throwable {
       practicepage.iframeMethod();
    }

    @Then("^user should able to see result page inside that iframe$")
    public void user_should_able_to_see_result_page_inside_that_iframe() throws Throwable {
    }
    @When("^user clicks on Benz checkbox$")
    public void user_clicks_on_Benz_checkbox() throws Throwable {
    practicepage.listMethod();
    }

    @Then("^user should see Benz is selected$")
    public void user_should_see_Benz_is_selected() throws Throwable {
    }

}
