import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Step 1: Open Browser and Navigate to automationexercise.com
WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com')

// Step 2: Go to Signup /Login link
WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/a'))

// Step 3: In New User SignUp! , Enter Name and Email address using random generator, and click signup
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 
    name)

WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    email)

WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/button_New User Signup_btn btn-default'))

// Step 4: Check for Email Address already exists error
if (WebUI.verifyElementPresent(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/p'), 3, FailureHandling.OPTIONAL)) {
    WebUI.comment('Error: Email Address already exists')
} else {
    WebUI.comment('User created successfully, proceeding to account information entry')

    WebUI.verifyElementPresent(findTestObject('AutomationExercise/Page_Automation Exercise - Signup/EnterAccountInformation'), 
        3)
}

// Close the browser at the end
WebUI.closeBrowser()