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
 * Write me script to automate below steps:
 * 1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully as Object Repository/AutomationExercise/Page_Automation Exercise/Verify land Image
4. Click on 'Contact Us' button Object Repository/AutomationExercise/Page_Automation Exercise/Contact us link
5. Verify 'GET IN TOUCH' is visible Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/Get In Touch header
6. Enter name, email, subject and message Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/Name, email, subject and message
8. Click 'Submit' button Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/submit
9. Use SendKeys as ENTER
10. Verify success message 'Success! Your details have been submitted successfully.' is visible Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/success
 */
// Launch browser
WebUI.openBrowser('')

// Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

// Verify that home page is visible successfully as Object Repository/AutomationExercise/Page_Automation Exercise/Verify land Image
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise/Verify land Image'))

// Click on 'Contact Us' button Object Repository/AutomationExercise/Page_Automation Exercise/Contact us link
WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise/Contact us link'))

// Verify 'GET IN TOUCH' is visible Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/Get In Touch header
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/Get In Touch header'))

// Enter name in Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/Name
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/Name'), 'Test Name')

// Enter email in Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/email
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/email'), 'test@example.com')

// Enter subject in Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/subject
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/subject'), 'Test Subject')

// Enter message in Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/message
WebUI.setText(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/message'), 'This is a test message.')

// Click 'Submit' button Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/submit
WebUI.click(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/submit'))

// Use SendKeys as ENTER
//WebUI.sendKeys(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/success'), Keys.chord(Keys.ENTER))

// Verify success message 'Success! Your details have been submitted successfully.' is visible Object Repository/AutomationExercise/Page_Automation Exercise - Contact Us/success
WebUI.verifyElementVisible(findTestObject('AutomationExercise/Page_Automation Exercise - Contact Us/success'))

