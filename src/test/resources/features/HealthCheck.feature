@ui @healthcheck
Feature:  E-commerce project website health check
#
#Scenario: User is able to open the browser, navigate to the URL and search the product
#
#Given User opened a browser
#And navigate to the home application URL
#When User searched for the product "Laptop"
#Then Search result page is displayed
#
#
 #@t
  #Scenario: User is click on the Product and check the Product Details
    #Given User opened a browser
    #And  navigate to the home application URL
    #And User searched for the product "Laptop"
    #When User click on any product
    #Then Product Description is displayed in new tab
    
    
@laptop
  Scenario: User is able to Open the browser, navigate to the URL and Search for Product
    Given  navigate to the home application URL
    When User searched for the product "Laptop"
    Then Search result page is displayed

@earphone
  Scenario: User is click on the Product and check the Product Details
    Given  navigate to the home application URL
    And  User searched for the product "earphone"
    When User click on any product
    Then Product Description is displayed in new tab
    
