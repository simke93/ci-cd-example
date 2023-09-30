Feature: determine how many  vowels there are in some text.

  Scenario Outline: vowels counting
    Given I enter the text <input>
    When I test given text for vowels
    Then I should get result <output>


    Examples:
      | input | output |
      | "Hello Friend" | 4 |
      | "123444677"    | 0 |
      | "a"            | 1 |
      | ""             | 0 |
      | "aeiou"        | 5 |
