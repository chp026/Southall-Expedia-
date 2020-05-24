package org.example.StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.PageObject.FlightSearchPage;

public class FlightSearchSteps {
    FlightSearchPage flightSearchPage = new FlightSearchPage();

    @Given("^user is on Expedia website for flight search$")
    public void user_is_on_Expedia_website_for_flight_search() throws Throwable {
        Thread.sleep(3000);
        flightSearchPage.flight();
    }

    @When("^user selects flying from option$")
    public void user_selects_flying_from_option() throws Throwable {
        Thread.sleep(3000);
        flightSearchPage.departing();
        Thread.sleep(1000);
        flightSearchPage.departingAirport();
    }

    @When("^user selects flying to option$")
    public void user_selects_flying_to_option() throws Throwable {
        Thread.sleep(1000);
        flightSearchPage.arriving();
        Thread.sleep(1000);
        flightSearchPage.arrivingAirport();
    }

    @When("^user selects departing date$")
    public void user_selects_departing_date() throws Throwable {
        Thread.sleep(1000);
        flightSearchPage.leavingDate();
        Thread.sleep(1000);
        flightSearchPage.chooseLeavingDate();
    }

    @When("^user selects returing date$")
    public void user_selects_returing_date() throws Throwable {
        Thread.sleep(1000);
        flightSearchPage.comingBackDate();
        Thread.sleep(1000);
        flightSearchPage.chooseArrivingBackDate();
        Thread.sleep(1000);
        flightSearchPage.directFlightOnly();
        flightSearchPage.ScreenShot();
    }

    @When("^user clicks on search button$")
    public void user_clicks_on_search_button() throws Throwable {
        flightSearchPage.searchButton();
        Thread.sleep(5000);
        flightSearchPage.ScreenShot1();
    }

    @Then("^user should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
