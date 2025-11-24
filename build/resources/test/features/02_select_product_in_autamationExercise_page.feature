#Author:  Junior Moreno
  #language:  en

  Feature: Product Selection and Configuration

    Background:
      Given I am on the Automation Exercise home page.
    Scenario: Adding a product with specific options to the cart
      Given that the user is authenticated and on the productpage
      When the user searches for a product named Blue Top
      And selects the product named "Blue Top" from the search results list
      And the user presses the "Add to Cart" button
      And the user presses the "View Cart" button
      Then the mini-cart should show product named Blue Top item
