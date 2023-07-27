Feature: Scroll and switch window functionality

Scenario: Scrolling to bottom and click on link
Given User is on home page
And User scroll down to OpenCart
And User right click
And Open in new tab
When User switch to open tab 
And User scroll to view all button and click
And User reached to page with title "Opencart extensions"
Then User come back to parent window
And scroll up to webElement 123456789