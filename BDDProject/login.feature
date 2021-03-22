Feature: login feature

Background:
Given open browser
And nevigate to url

@ui
Scenario: as a user using valid cradantial should be logged in


When user type email in userTest box
And user type password in userTest box
And user click login button
Then user should see his profile page

@backend
Scenario Outline: as a user using invalid cradantial should not be logged in


When user type <"email"> in userTest box
And user type <"password"> in userTest box
And user click login button
Then user should not see his profile page

Examples:
|email|passworw|
|user1|s12345|
|user2|s3425|
|user3|s4535|


