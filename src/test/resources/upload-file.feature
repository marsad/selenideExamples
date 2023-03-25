
Feature: Upload file

  Scenario: user can upload image file

    Given an open browser with page Upload a File
    When user selects the file from its pc
    When selects radio button Image
    When clicks on Upload button
    Then the success message should appear on the page

