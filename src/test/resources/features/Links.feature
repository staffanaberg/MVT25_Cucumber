Feature: Links

  Scenario Outline: Clicking links
    Given I have navigated to Webshop
    When I click on "Books"
    Then I am on the page "Demo Web Shop. Books"

    Examples:
      |  |