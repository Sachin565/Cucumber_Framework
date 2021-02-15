@UpdateInfo
Feature: Update Information
  Update Personal Information

  Scenario: Updating information
    Given User is on automationpractice shopping site
    When User clicks goes to Sign IN section
    Then User provide credential to 'Sign In ' section
    When User is on 'My Account ' section
    Then He updates his first name from XXX to YYY OR YYY to XXX
    And confirmation of update is received
