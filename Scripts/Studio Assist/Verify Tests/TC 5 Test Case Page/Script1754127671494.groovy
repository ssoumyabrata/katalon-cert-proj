import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Prepare me script to automate below steps
 * 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully as Object Repository/AutomationExercise/Page_Automation Exercise/Verify land Image
4. Click on 'Test Cases' button Object Repository/AutomationExercise/Page_Automation Exercise/Test Case link
5. Verify user is navigated to test cases page successfully Object Repository/AutomationExercise/Page_Automation Practice Website for UI Testing - Test Cases/Header
 */
// Launch browser
WebUI.openBrowser('')

// Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise/Verify land Image'))

CustomKeywords.'com.cert.AutoExerVerifyTestCase.verify'()

