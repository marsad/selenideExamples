
Feature: Upload file

  Scenario: user can upload image file

    Given an open browser with page Upload a File
    When user selects image file from its pc
    When selects radio button Image
    When clicks on Upload button
    Then the message about successful image upload should appear

  Scenario: user can upload document file

    Given an open browser with page Upload a File
    When user selects document file from its pc
    When selects radio button A General File
    When clicks on Upload button
    Then the message about successful document upload should appear

