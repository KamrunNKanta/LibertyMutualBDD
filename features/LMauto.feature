Feature:Home quote validation
BackGround: Initiate driver


Scenario:Quote for new Home Insurance
Given the title of the page 'Customize your insurance coverage | Liberty Mutual'
When user click cursor onto the property Tab
And user click onto the home tab
And user fill the zipcode
Then user click on Get my price