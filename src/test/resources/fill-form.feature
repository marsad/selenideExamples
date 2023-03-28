Feature: Fill the form

  Scenario: user can fill and submit the form

    Given an open browser with page Form Example
    When user fills the username
    When user fills the password
    When user fills the comment
    When user selects the file
    When user selects the checkbox3
    When user selects the radiobutton
    When user selects multiple values
    When user selects the item5 from the dropdown
    When user submits the form
    Then the successful message about submission should appear

  Scenario: user can fill and reset the form

    Given an open browser with page Form Example
    When user fills the username
    When user fills the password
    When user fills the comment
    When user resets the form
    Then the fields should be empty
