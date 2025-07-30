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
* The following use case is for generating code with StudioAssist by seperating the objects and variables with the action
*/

/*
* I have a list of test objects as below:
* - Make appointment button: Object Repository/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment
* - Username: Object Repository/Page_Login/input_Username_txt-username
* - Password: Object Repository/Page_Login/input_Password_txt-password
* - Login Button: Object Repository/Page_Login/button_Password_btn-login
* - Appointment div elememt: Object Repository/Page_CuraAppointment/div_Appointment
* 
* I also have a url GlobalVariable.G_SiteURL, also have local variables 'Username' and 'Password'
* 
* Write me a test case to perform the following steps:
* open browser with the url and click on the make appointment button
* login to the screen and verify the appointment element exist with timeout of 10 sec
*/
// Open browser with the url stored in GlobalVariable.G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

// Click on the make appointment button
WebUI.click(findTestObject('Object Repository/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment'))

// Set text in the username input field with the variable Username
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_txt-username'), Username)

// Set text in the password input field with the variable Password
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_txt-password'), Password)

// Click on the login button
WebUI.click(findTestObject('Object Repository/Page_Login/button_Password_btn-login'))

// Verify the appointment element exists with a timeout of 10 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)




