Feature: End to End Scenario

Scenario: As a User will be able to buy a shirt

Given Open Browser 
|chrome|
|firefox|
And Nevigate to URL
When user click in MenMenu
And user click in ShirtOption
And user select first product
And user Select acolor and size
|color|size|
|gray|m|
|black|s|
And user add product into the cart
And user proced for checkout