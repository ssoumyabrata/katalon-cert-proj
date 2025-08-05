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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise/signup or login'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'Test Automation')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 'testautomation123@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_New User Signup_btn btn-default'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/body'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/body'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/body'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup  Login/body'), 
    0)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 'testautomation202000@gmail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_New User Signup_btn btn-default'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/b'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/h2_Contact us_title text-center'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/b'), 0)

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_Mr_id_gender1'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__name'))

WebUI.setEncryptedText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__password'), 
    'p4y+y39Ir5OTdtOb306gDg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/select_Date of Birth_days'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/select_Date of Birth_months'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/select_Date of Birth_years'), 
    '2007', true)

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__first_name'), 
    'address automation')

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/div_Contact us_row'))

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__first_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__last_name'), 
    'Automation')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_Company_company'), 
    'Test Automation Company Pvt Ltd')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    'Address St')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input_Address 2_address2'), 
    'St America')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__state'), 'West Bengal')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__city'), 'Kolkata')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__zipcode'), '700195')

WebUI.setText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/input__mobile_number'), 
    '1234567890')

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Signup/button__btn btn-default'))

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Account Created/h2_Contact us_title text-center'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Account Created/b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Account Created/p'), 
    0)

WebUI.click(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise - Account Created/a_Account Created_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/AutomationExercise/Page_Automation Exercise/a_1'), 'Logged in as Test Automation')

WebUI.closeBrowser()

