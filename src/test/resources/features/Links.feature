Feature: Links

  Scenario Outline: Links
    Given I have navigated to Webshop
    When I click on <link>
    Then I am on the page <title>

    Examples:
      | link | title                              |
      | "1"  | "Demo Web Shop. Books"             |
      | "2"  | "Demo Web Shop. Computers"         |
      | "3"  | "Demo Web Shop. Electronics"       |
      | "4"  | "Demo Web Shop. Apparel & Shoes"   |
      | "5"  | "Demo Web Shop. Digital downloads" |
      | "6"  | "Demo Web Shop. Jewelry"           |
      | "7"  | "Demo Web Shop. Gift Cards"        |


