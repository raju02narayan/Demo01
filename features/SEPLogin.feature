Feature: Validate SEP Login fuctionality

  Scenario: Test login with valid credentials
    Given Open the SEP application
    When Enter valid "SESA430059" and valid "Password@12345678"
    Then User should be able to login successful
    


