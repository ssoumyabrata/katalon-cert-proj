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
Generate script to automate below steps:
1. Navigate to "https://orangehrm.com"
2. Check if below elements exits:
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_About Us
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Careers
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Company
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Press Releases
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Pricing
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Resources
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Solutions
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Why OrangeHRM
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/h5_Company
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/img_OrangeHRM Logo
Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/li_News Articles
*/
// Navigate to "https://orangehrm.com"
WebUI.openBrowser('')
WebUI.navigateToUrl('https://orangehrm.com')
// Verify element "a_Company" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Company'), 10)
// Verify element "a_Pricing" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Pricing'), 10)
// Verify element "a_Resources" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Resources'), 10)
// Verify element "a_Solutions" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Solutions'), 10)
// Verify element "a_Why OrangeHRM" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Why OrangeHRM'), 10)
// Verify element "h5_Company" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/h5_Company'), 10)
// Verify element "img_OrangeHRM Logo" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/img_OrangeHRM Logo'), 10)
// Verify element "li_News Articles" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/li_News Articles'), 10)

WebUI.scrollToElement(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_About Us'), 0, FailureHandling.CONTINUE_ON_FAILURE)

// Verify element "a_About Us" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_About Us'), 10)
// Verify element "a_Careers" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Careers'), 10)
// Verify element "a_Press Releases" exists
WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRM/Page_Human Resources Management Software  HRMS  OrangeHRM/a_Press Releases'), 10)