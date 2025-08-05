package com.cert

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class AutoExerSubmit {
	
	@Keyword
	static def submit() {
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/Product link'))
		// Click on 'View Product' of first product
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - All Products/View Product 1st'))
		// Verify 'Write Your Review' is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/review'))
		// Enter name in review name field
		WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/review name'), 'Test Name')
		// Enter email in Review email field
		WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/Review email'), 'test@example.com')
		// Enter review text in review field
		WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/review'), 'This is a test review.')
		// Click 'Submit' button
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/submit review'))
		// Verify success message 'Thank you for your review.'
		WebUI.verifyElementText(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/submitted verify'), 'Thank you for your review.')
		
	}
}
