
Feature: Alert Box Examples

  Scenario: user can display an alert

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show alert box
    Then user can confirms the alert

  Scenario: user can display and confirm an alert

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show confirm box
    When user clicks on the OK button
    Then the message: confirm returned true should be displayed

  Scenario: user can display and cancel an alert

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show confirm box
    When user clicks on the Cancel button within alert
    Then the message: confirm returned false should be displayed

  Scenario: user can display a prompt box and confirm an alert without changing the text inside

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show prompt box
    When user confirms an alert without changing the text inside
    Then the message with unchanged text should be displayed

  Scenario: user can display a prompt box and change the text inside it

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show prompt box
    When user fills new text into the field
    Then the message with filled text should be displayed

  Scenario: user can display and cancel a prompt box

    Given an open browser with page Alert Box Examples
    When user clicks on the button Show prompt box
    When user clicks on the Cancel button within prompt
    Then the message without any text should be displayed

