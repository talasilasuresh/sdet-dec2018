Feature: Verify the Title of our web application
	As acceptance 

  Scenario: Verify the Title of the Home Page
    Given User is on the landing page
    When User checks
    Then It must say "Facebook -Log In"
