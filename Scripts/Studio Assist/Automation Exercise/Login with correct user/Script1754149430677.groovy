import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


/* 
Generate code to automate below steps:
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
4. Click on 'Signup / Login' button Object Repository/AutomationExercise/Page_Automation Exercise/signup or login
5. Verify 'Login to your account' is visible  Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/h2_Login to your account
6. Enter correct email address and password as below:
Email id - Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/login email - 'soumyabratasaha@outlook.com' , 
Password - Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/Login Password - Password@1 
7. Click 'login' button Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/button_Login
8. Verify that 'Logged in as test' is visible  Object Repository/AutomationExercise/Page_Automation Exercise/a_Logged in as test
9. Take screenshot
10. Click on logout button Object Repository/AutomationExercise/Page_Automation Exercise/logout button
11. verify login page Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/h2_Login to your account
10. Close the browser
*/
// Launch browser
WebUI.openBrowser('')

// Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

CustomKeywords.'com.cert.AutoExerLoginCorrectUser.login'()

// Take screenshot
WebUI.takeScreenshot()

// Click on logout button
WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/logout button'))

// Verify login page
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/h2_Login to your account'))

// Close the browser
WebUI.closeBrowser()

