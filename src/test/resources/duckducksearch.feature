Feature: DuckDuck Search

Scenario: Search text on DuckDuck
    Given the search page is opened
    When  text 'Text' entered
    Then  first link contains 'Text' text