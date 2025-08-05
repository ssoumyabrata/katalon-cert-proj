import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully as Object Repository/AutomationExercise/Page_Automation Exercise/Verify land Image
4. Click on 'Products' button Object Repository/AutomationExercise/Page_Automation Exercise/Product link
5. Verify user is navigated to ALL PRODUCTS page successfully Object Repository/AutomationExercise/Page_Automation Exercise - All Products/Header
6. The products list is visible Object Repository/AutomationExercise/Page_Automation Exercise - All Products/All Products List
7. Click on 'View Product' of first product Object Repository/AutomationExercise/Page_Automation Exercise - All Products/View Product 1st
8. User is landed to product detail page Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/Availibility
9. Verify that detail detail is visible: product availablility Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/Price
*/
// Launch browser
WebUI.openBrowser('')

// Navigate to url 'http://automationexercise.com'
// Navigate to the specified URL
WebUI.navigateToUrl('http://automationexercise.com')

// Verify that home page is visible successfully as Object Repository/AutomationExercise/Page_Automation Exercise/Verify land Image
// Verify visibility of home page element
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise/Verify land Image'))

CustomKeywords.'com.cert.AutoExerViewProdSize.viewProd'()

WebUI.closeBrowser()

