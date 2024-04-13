@smoke
Feature: AddToCart | user could select products and add them to cart
  Scenario:
    Given user go to login page
    When user login with valid phoneNumber "<mobile>" and password "<pass>"
    And add first product to cart
    And add second product to cart
    Then search for product name "<productName>"
    Then add result product to cart
    Then go to cart page
#  MI Electric Scooter Essential Black

    Examples:
      | mobile | pass | productName|
    | 01144729203 | Voda@123 | MI Electric Scooter Essential Black|
