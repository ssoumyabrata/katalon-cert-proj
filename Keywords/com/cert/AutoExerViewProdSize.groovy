package com.cert

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class AutoExerViewProdSize {
	
	@Keyword
	def static viewProd(){
		// Click on 'Products' button Object Repository/AutomationExercise/Page_Automation Exercise/Product link
		// Click on Products button
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/Product link'))
		
		// Verify user is navigated to ALL PRODUCTS page successfully Object Repository/AutomationExercise/Page_Automation Exercise - All Products/Header
		// Verify ALL PRODUCTS page header is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - All Products/Header'))
		
		// The products list is visible Object Repository/AutomationExercise/Page_Automation Exercise - All Products/All Products List
		// Verify products list is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - All Products/All Products List'))
		
		// Click on 'View Product' of first product Object Repository/AutomationExercise/Page_Automation Exercise - All Products/View Product 1st
		// Click on View Product of first product
		WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - All Products/View Product 1st'))
		
		// User is landed to product detail page Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/Availibility
		// Verify product availability element is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/Availibility'))
		
		// Verify that detail detail is visible: product availablility Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/Price
		// Verify product price element is visible
		WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Product Details/Price'))
	}
}
