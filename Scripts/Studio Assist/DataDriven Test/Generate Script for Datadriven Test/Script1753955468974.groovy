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
 * I have a list of test objects as below:
 * - Options : Object Repository/Page_CuraAppointment/select_Facility_combo_facility
 *  - Program: Object Repository/Page_CuraAppointment/label_Healthcare Program_radio-inline
 *  - Date : Object Repository/Page_CuraAppointment/input_Visit Date (Required)_txt_visit_date
 *  - Comment : Object Repository/Page_CuraAppointment/textarea_Comment_txt_comment
 *  - Make Appointment Button : Object Repository/Page_CuraAppointment/button_makeAppointment
 *
 *
 * - Write me a script to perform the steps as below:
 *  Find and call the 'Test Cases/Studio Assist/Resuable Tests/Login' test case with the variable 'Username' as 'John Doe' and Password as the local Password variable
 * 	Select the options with the label as variable Facility and the label is not a regex
 * Check the program
 * Enter the Date as variable Visit_Date
 * Write comment as variable Comment
 * Submit Make Appointment button
 * Capture the screenshot of the page
 * Close the browser
 *
 * */
// Call the Login test case with Username as 'John Doe' and Password as local Password variable
WebUI.callTestCase(findTestCase('Test Cases/Studio Assist/Resuable Tests/Login'), [('Username') : 'John Doe', ('Password') : Password])
WebUI.delay(2)

// Select the option by label Facility in the select_Facility_combo_facility dropdown (not regex)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_CuraAppointment/select_Facility_combo_facility'), Facility, false)

// Check the program radio button with label Program
WebUI.check(findTestObject('Object Repository/Page_CuraAppointment/label_Healthcare Program_radio-inline'))

// Enter the Visit_Date into the input_Visit Date (Required)_txt_visit_date field
WebUI.setText(findTestObject('Object Repository/Page_CuraAppointment/input_Visit Date (Required)_txt_visit_date'), Visit_Date)

// Enter the Comment into the textarea_Comment_txt_comment field
WebUI.setText(findTestObject('Object Repository/Page_CuraAppointment/textarea_Comment_txt_comment'), Comment)

// Click the Make Appointment button
WebUI.click(findTestObject('Object Repository/Page_CuraAppointment/button_makeAppointment'))
WebUI.delay(2)

// Capture the screenshot of the page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()