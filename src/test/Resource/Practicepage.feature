Feature:
@radioButton
  Scenario: RadioButton
    Given user is on Practice page of LetsKodeit website
    When user clicks all three radioButtons 1. BMW 2. Honda and 3. Benz
    Then user should be able to see it is selecting on above order

@selectClass
  Scenario: Select Class Method
  Given user is on Practice page of LetsKodeit website
  When user clicks on dropdown car menu and selects on Benz
  Then user should be able to see Benz as selected option

@actionClass
Scenario: moving cursor on MouseHover and clicks on Top from list
  Given user is on Practice page of LetsKodeit website
  When user bring mouse cursor on MouseHoover and clicks on Top option from MouseHoover list
  Then user should able to see list of options first and then top of the page

  @switchiframe
  Scenario: accessibility of iframe
    Given user is on Practice page of LetsKodeit website
    When user types a course on search in iframe
    Then user should able to see result page inside that iframe

    @listClass
    Scenario: to test checkbox functionality
      Given user is on Practice page of LetsKodeit website
      When user clicks on Benz checkbox
      Then user should see Benz is selected