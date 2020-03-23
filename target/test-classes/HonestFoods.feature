Feature: Selecting products on an ClubChicken page


@InTest
Scenario Outline: Search and selection of products on desktop
Given the user launches the app on the desktop
And the user is on the homepage
And the user goes to the checkout page and adds the address "<address>"
Examples:
|address|
|Semperstraﬂe 44, 1180 Wien, Austria|