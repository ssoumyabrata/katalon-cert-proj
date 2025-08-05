import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
Prepare script to automate the below following:
1. Launch browser
 Navigate to url 'http://automationexercise.com'
4. Click on 'Products' button Object Repository/AutomationExercise/Page_Automation Exercise/Product link
7. Click on 'View Product' of first product Object Repository/AutomationExercise/Page_Automation Exercise - All Products/View Product 1st
6. Verify 'Write Your Review' is visible  Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/review
7. Enter name, email and review Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/review name, Review email
8. Click 'Submit' button Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/submit review
9. Verify success message 'Thank you for your review.' Object Repository/AutomationExercise/Page_Automation Exercise - Product Details/submitted verify
*/
// Launch browser and navigate to url 'http://automationexercise.com'
WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationexercise.com')

CustomKeywords.'com.cert.AutoExerSubmit.submit'()

WebUI.takeScreenshot()

WebUI.closeBrowser()

