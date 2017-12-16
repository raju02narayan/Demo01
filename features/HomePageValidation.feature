

Feature: Validate SEP home page fuctionality

  Scenario: Check the Top Story behavior, if user clicks on a link
    Given Open the SEP application
    And Enter valid "SESA430059" and valid "Password@12345678"
    And User should be able to login successful
    When I click on a top story from SEP home page
    Then Top story detail page should be displayed

  Scenario: Check the Top Story behavior, if user clicks on Read all link
    Given Open the SEP application
    And Enter valid "SESA430059" and valid "Password@12345678"
    And User should be able to login successful
    When I click on read all link from Top story secton, home page
    Then Top story list page should be displayed

  Scenario: Check the Videos behavior, if user clicks on video link from home page
    Given Open the SEP application
    And Enter valid "SESA430059" and valid "Password@12345678"
    And User should be able to login successful
    When I click on a video link from SEP home page
    Then Video should be played in a pop-up
    
    Scenario: Check the Videos behavior, if user clicks on video link from home page
    Given Open the SEP application
    And Enter valid "SESA430059" and valid "Password@12345678"
    And User should be able to login successful
    When I click on a video link from SEP home page
    Then Video should be played in a pop-up
