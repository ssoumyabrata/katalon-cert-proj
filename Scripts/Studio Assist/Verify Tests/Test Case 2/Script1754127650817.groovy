import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/*
 * Write a script to do the following:
 * Navigate to https://www.wix.com/
 * Click on Object Repository/Login Wix
 *  close the browser
 */
// Navigate to https://www.wix.com/
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.wix.com/')
// Click on Object Repository/Login Wix
WebUI.click(findTestObject('Object Repository/Login Wix'))
// Close the browser
WebUI.closeBrowser()