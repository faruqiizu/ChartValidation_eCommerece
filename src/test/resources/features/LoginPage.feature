@eCommerce
Feature: Add product to chart
  @LoginPage
  @Positive-case
  Scenario: As user i can add product to chart & see product inside chart feature
    Given User open the website
    When User input "arcaorye@gmail.com" as a email "tokped8888" as a password
    Then User click button Masuk
    And User already on home page
    When User search for "Sample Product" as product
    And User add "Sample Product" to cart
    Then User should see "Sample Product" in the cart
    When User proceeds to checkout
    Then User should see "Sample Product" in the checkout page
    When User completes checkout
    And User clicks logout button
    Then User should be redirected to login page