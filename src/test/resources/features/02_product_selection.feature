# Author: Levi
  # Language: en

Feature: Product selection and purchase
  As a user
  I want to select a product
  So that I can add it to the cart and proceed to checkout

  Background:
    Given I am on the AutomationExercises homepage

  Scenario: Select a product and complete the purchase
    When the user selects the product "Blue top"
    And adds the product to the cart
    And goes to the cart from the View Cart link
    And proceeds to checkout
    Then the order should be successfully confirmed
