import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to the landing page
WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationexercise.com')

// Wait for the page to load
WebUI.waitForPageLoad(30)

CustomKeywords.'com.cert.AutoExerVerifyLinkWorking.verify'()

// Close browser at the end
WebUI.closeBrowser()
