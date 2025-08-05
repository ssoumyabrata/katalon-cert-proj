import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Write a script to do the following:
 * Navigate to https://www.godaddy.com/en-in
 *  verify logo Object Repository/Go Daddy with wait of 10 sec
 *  close the browser
 */

// Navigate to https://www.godaddy.com/en-in
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.godaddy.com/en-in')
// Verify logo Object Repository/Go Daddy with wait of 10 sec
WebUI.verifyElementPresent(findTestObject('Object Repository/Go Daddy'), 10)
// Close the browser
WebUI.closeBrowser()