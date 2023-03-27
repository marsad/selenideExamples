Feature: Triangle App


  Scenario: validate if length of all sides was provided (negative)

    Given an open browser with page Triangle
    When user fills the length of only two sides
    When user submits the data
    Then the error message Side "3" is missing should be displayed

  Scenario: validate if the figure is a triangle

    Given an open browser with page Triangle
    When user fills the length of all three sides where sum of the length of any two sides is smaller than the length of the third side (negative)
    When user submits the data
    Then the error message Not a Triangle should be displayed

  Scenario: validate if the triangle is Equilateral

    Given an open browser with page Triangle
    When user fills the length of all three sides where all of them are equal
    When user submits the data
    Then the message Equilateral should be displayed

  Scenario: validate if the triangle is Isosceles

    Given an open browser with page Triangle
    When user fills all three sides where two of them are equal
    When user submits the data
    Then the message Isosceles should be displayed

  Scenario: validate if the triangle is Scalene

    Given an open browser with page Triangle
    When user fills the length of all three sides which have different length
    When user submits the data
    Then the message Scalene should be displayed


