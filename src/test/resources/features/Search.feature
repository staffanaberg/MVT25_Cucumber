Feature: Search

  Scenario Outline: Computer - Chrome
    Given I am using <browser> browser
    And I have navigated to <page>
    And I have searched for <field>
    When I click on <link> page
    Then I open the page <title>
    Examples:
      | browser   | page                                 | field       | link                             | title                                          |
      | "Chrome"  | "https://demowebshop.tricentis.com/" | "computer" | "/build-your-cheap-own-computer" | "Demo Web Shop. Build your own cheap computer" |
      | "Edge"    | "https://demowebshop.tricentis.com/" | "computer" | "/build-your-cheap-own-computer" | "Demo Web Shop. Build your own cheap computer" |
      | "Firefox" | "https://demowebshop.tricentis.com/" | "computer" | "/build-your-cheap-own-computer" | "Demo Web Shop. Build your own cheap computer" |
