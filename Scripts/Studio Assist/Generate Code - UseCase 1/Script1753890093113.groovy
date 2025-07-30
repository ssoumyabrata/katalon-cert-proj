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

/**
* The following use case is for generating code with StudioAssist by listing out actions as Steps in plain English Language
*/

/*
* Write a katalon studio test case to perform the following steps:
* 1. Open a browser to the url stored in the GlobalVariable.G_SiteURL
* 2. Maximize the screen
* 3. Click the make appointment button with the id 'Object Repository/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment'
* 4. Fill in the username 'Object Repository/Page_Login/input_Username_txt-username' with the value of the local variable 'Username'
* 5. Fill in the password 'Object Repository/Page_Login/input_Password_txt-password' with the value of the local variable 'Password'
* 6.Click on Login button with id 'Object Repository/Page_Login/button_Password_btn-login'
* 7. Verify that the appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' exists with timeout of 10s
* 8. Close the browser
*/
// Open a browser to the url stored in the GlobalVariable.G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Maximize the screen
WebUI.maximizeWindow()

// Click the make appointment button with the id 'Object Repository/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment'
WebUI.click(findTestObject('Object Repository/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment'))

// Fill in the username 'Object Repository/Page_Login/input_Username_txt-username' with the value of the local variable 'Username'
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_txt-username'), Username)

// Fill in the password 'Object Repository/Page_Login/input_Password_txt-password' with the value of the local variable 'Password'
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_txt-password'), Password)

// Click on Login button with id 'Object Repository/Page_Login/button_Password_btn-login'
WebUI.click(findTestObject('Object Repository/Page_Login/button_Password_btn-login'))

// Verify that the appointment div 'Object Repository/Page_CuraAppointment/div_Appointment' exists with timeout of 10s
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)

// Close the browser
WebUI.closeBrowser()
