import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
4. Scroll down to footer 
5. Verify text 'SUBSCRIPTION' Object Repository/AutomationExercise/Page_Automation Exercise/Subscription header
6. Enter email address in input and click arrow button Object Repository/AutomationExercise/Page_Automation Exercise/subscribe email, Object Repository/AutomationExercise/Page_Automation Exercise/subscribe button
7. Verify success message 'You have been successfully subscribed!' is visible Object Repository/AutomationExercise/Page_Automation Exercise/Successfully subscribed
8. Take screenshot
9. Close browser
*/

// Launch browser
WebUI.openBrowser('')

// Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// Scroll down to footer
WebUI.scrollToElement(findTestObject('AutomationExercise/Page_Automation Exercise/subscribe button'), 10)

// Verify text 'SUBSCRIPTION' Object Repository/AutomationExercise/Page_Automation Exercise/Subscription header
WebUI.verifyElementText(findTestObject('AutomationExercise/Page_Automation Exercise/Subscription header'), 'SUBSCRIPTION')

// Enter email address in input and click arrow button Object Repository/AutomationExercise/Page_Automation Exercise/subscribe email, Object Repository/AutomationExercise/Page_Automation Exercise/subscribe button
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise/subscribe email'), 'test@example.com')
WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/subscribe button'))

// Verify success message 'You have been successfully subscribed!' is visible Object Repository/AutomationExercise/Page_Automation Exercise/Successfully subscribed
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise/Successfully subscribed'))

// Take screenshot
WebUI.takeScreenshot()

// Close browser
WebUI.closeBrowser()