@tag
Feature: Test Demo Virtual Shop
  Test for DemoVirtualShop functionalities

  Scenario: N°1 A simple purchase at DemoVirtualShop
    When I login into the DemoVirtualShop
    |userName     |password     |
    |standard_user|secret_sauce |
    Then I add products to cart
    |backpack |
    |jacket   |
    And I proceed to checkout
    |firstName | lastName|zipCode|
    | Alex     | Smith   |11575  |
    And I confirm checkout
    Then I logout from DemoVirtualShop
