Feature: Calculation of a payment account for a liberation prime risque prestation

  Scenario: Calculation of average point of a studen
    Given A student with point math and physics and chemistry is 1,2,3
    When calculate the average point
    Then the average point is 2