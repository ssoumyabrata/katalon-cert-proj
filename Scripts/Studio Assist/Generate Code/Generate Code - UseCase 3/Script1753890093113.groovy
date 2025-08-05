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
* This use case is for generating script that calls other scripts using StudioAssist
*/

/*
* I have a list of test objects as below:
* - Options : Object Repository/Page_CuraAppointment/select_Facility_combo_facility
*  - Program: Object Repository/Page_CuraAppointment/label_Healthcare Program_radio-inline
*  - Date : Object Repository/Page_CuraAppointment/input_Visit Date (Required)_txt_visit_date
*  - Comment : Object Repository/Page_CuraAppointment/textarea_Comment_txt_comment
*  - Make Appointment Button : Object Repository/Page_CuraAppointment/button_makeAppointment
* 
* 
* - Write me a script to perform the steps as below:
* Find and call the 'Test Cases/Studio Assist/Resuable Tests/Login' test case with the variable 'Username' as 'John Doe' and Password as the local Password variable
* Select the options with the label 'Hongkong CURA Healthercare Center' and the label is not a regex
* Check the program
* Enter the Date as 31/07/2025
* Write comment as 'Appointment for testing'
* Submit Make Appointment button
* Capture the screenshot of the page
* Close the browser
* 
* */
// Call the Login test case with Username 'John Doe' and Password variable
WebUI.callTestCase(findTestCase('Test Cases/Studio Assist/Resuable Tests/Login'), [('Username') : 'John Doe', ('Password') : Password])
WebUI.delay(2)

// Select the option 'Hongkong CURA Healthercare Center' in the Facility dropdown by label without regex
WebUI.selectOptionByLabel(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/select_Facility_combo_facility'), 'Hongkong CURA Healthcare Center', false)

// Check the Healthcare Program radio button (assuming first label is to be checked)
WebUI.check(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/label_Healthcare Program_radio-inline'))

// Enter the date '31/07/2025' in the Visit Date input field
WebUI.setText(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/input_Visit Date (Required)_txt_visit_date'), '31/07/2025')

// Enter comment 'Appointment for testing' in the Comment textarea
WebUI.setText(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/textarea_Comment_txt_comment'), 'Appointment for testing')


// Click the Make Appointment button to submit
WebUI.click(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/button_makeAppointment'))
WebUI.delay(2)

// Capture screenshot of the current page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()
