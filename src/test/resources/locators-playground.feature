
Feature: Locators Playground

  Scenario: user can find paragraph by id

    Given an open browser with page Find By Playground - Locator Examples
    When a title is visible on the page
    Then the found paragraph should contain A letter

  Scenario: user can find paragraph by class name

    Given an open browser with page Find By Playground - Locator Examples
    When a title is visible on the page
    Then the found paragraph should contain F letter

