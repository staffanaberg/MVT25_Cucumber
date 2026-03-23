Feature: Links

  Scenario Outline: Links
    Given I have navigated to Webshop
    When I click on <link>
    Then I am on the page <title>

    Examples:
      | link        | title                      |
      | "Books"     | "Demo Web Shop. Books"     |
      | "Computers" | "Demo Web Shop. Computers" |