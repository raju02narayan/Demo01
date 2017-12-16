package com.sepm.stepdefinitions;

import com.sepm.config.ReadConfigFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomaPageValidation {

	ReadConfigFile readConfigFile = new ReadConfigFile();
	BaseFunctionSEP base = new BaseFunctionSEP();

	@When("^I click on a top story from SEP home page$")
	public void i_click_on_a_top_story_from_SEP_home_page() throws Throwable {
		System.out.println("I click on a top story from SEP home page");
	}

	@Then("^Top story detail page should be displayed$")
	public void top_story_detail_page_should_be_displayed() throws Throwable {
		System.out.println("Top story detail page should be displayed");
	}

	@When("^I click on read all link from Top story secton, home page$")
	public void i_click_on_read_all_link_from_Top_story_secton_home_page() throws Throwable {
		System.out.println("I click on read all link from Top story secton, home page");
	}

	@Then("^Top story list page should be displayed$")
	public void top_story_list_page_should_be_displayed() throws Throwable {
		System.out.println("Top story list page should be displayed");
	}

	@When("^I click on a video link from SEP home page$")
	public void i_click_on_a_video_link_from_SEP_home_page() throws Throwable {
		System.out.println("I click on a video link from SEP home page");
	}

	@Then("^Video should be played in a pop-up$")
	public void video_should_be_played_in_a_pop_up() throws Throwable {
		System.out.println("Video should be played in a pop-up");
	}
}
