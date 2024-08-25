Feature: MWS Login feature

Scenario Outline:: Successful Login into MWS using valid credential

			
			Given  User open url
			Then    Title of Login page is "My webMethods: My webMethods Login Page"
			When  User enters user name as "<username>" and password as "<password>" and click on login button
			Then User close browser
			
			Examples:
					| username |	password	|
					|	Administrator|	manage |
