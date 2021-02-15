@T-Shirt
Feature: T-Shirt Order
  Order T-Shirt and Verify

  Scenario: Ordering t-shirt
    Given User is on automationpractice shopping site
    When User clicks on "T-SHIRTS" tab
    And adds first T-Shirt to Cart
    Then proceeds to checkout
    Then sign in with given account
    Then provide address details
    Then provide shipping details
    Then provide payment details
    Then verify the order is visible in order history
    Then user is on my account 
