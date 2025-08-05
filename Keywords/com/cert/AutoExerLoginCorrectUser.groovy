package com.cert

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class AutoExerLoginCorrectUser {
	
	@Keyword
	static def login(){
		// Click on 'Signup / Login' button
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/signup or login'))
		
		// Verify 'Login to your account' is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/h2_Login to your account'))
		
		// Enter email address
		WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/login email'), 'soumyabratasaha@outlook.com')
		
		// Enter password
		WebUI.setEncryptedText(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/Login Password'), 'p4y+y39Ir5OTdtOb306gDg==')
		
		// Click 'login' button
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - Signup  Login/button_Login'))
		
		// Verify that 'Logged in as test' is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise/a_Logged in as test'))
		
	}
}
