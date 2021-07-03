@Booking
Feature: To book room in online at adactinhotel

  Scenario: To validate user is able to login using valid credentials
    Given User is in adactinhotel login page
    When User enter valid username and password
    And User click login button
    Then User must be in SearchHotel page
    When User enter Location,Hotels,Room Type,Number of Rooms,Check In Date,Check Out Date,Adults per Room,Children per Room
    And User click Search button
    Then user must be in SelectHotel page
    When User click radio button of a hotel and User click Search button
    Then User must be in BookHotel page
    When User enter First Name,Last Name,Billing Address,Credit Card No,Credit Card Type,Expiry Date,CVV Number
    And User click book now button
    Then User must be in BookingConfirm page
    And Order no for hotel room should be generated
