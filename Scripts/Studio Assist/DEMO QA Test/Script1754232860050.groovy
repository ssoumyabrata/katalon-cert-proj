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
 * Generate scripts from below steps:
 * Navigate to URL https://demoqa.com/
 * Verify header exists Object Repository/DEMO QA/Page_DEMOQA/ToolsQA header
 * Click on the book store Object Repository/DEMO QA/Page_DEMOQA/div_Book Store Application
 * Enter git pocket guide in search box Object Repository/DEMO QA/Book Store Page/input_Type to search
 * Click on Search Box Object Repository/DEMO QA/Book Store Page/search button
 * Verify element exists Object Repository/DEMO QA/Book Store Page/div_Git Pocket Guide
 * Take a screenshot
 * Click on login button Object Repository/DEMO QA/Book Store Page/button_login
 * Enter username in Object Repository/DEMO QA/Login Page/input_UserName
 * Enter password in Object Repository/DEMO QA/Login Page/input_Password
 * Click on Login Button Object Repository/DEMO QA/Login Page/button_login
 * Click on new user button  Object Repository/DEMO QA/Login Page/button_newUser
 * Take screenshot
 * Enter First name  Object Repository/DEMO QA/Register page/input_First Name
 * Enter Last Name Object Repository/DEMO QA/Register page/input_Last Name
 * Enter username Object Repository/DEMO QA/Register page/input_UserName
 * Enter password Object Repository/DEMO QA/Register page/input_Password
 * set on I am not a robot checkbox Object Repository/DEMO QA/Register page/div_presentation
 * Enter register Object Repository/DEMO QA/Register page/button_register
 * Takes screenshot
* Close the browser
 */ 
// Navigate to URL https://demoqa.com/
WebUI.openBrowser('')
WebUI.navigateToUrl('https://demoqa.com/')
// Verify header exists Object Repository/DEMO QA/Page_DEMOQA/ToolsQA header
WebUI.verifyElementPresent(findTestObject('Object Repository/DEMO QA/Page_DEMOQA/ToolsQA header'), 10)
// Click on the book store Object Repository/DEMO QA/Page_DEMOQA/div_Book Store Application
WebUI.click(findTestObject('Object Repository/DEMO QA/Page_DEMOQA/div_Book Store Application'))
// Enter git pocket guide in search box Object Repository/DEMO QA/Book Store Page/input_Type to search
WebUI.setText(findTestObject('Object Repository/DEMO QA/Book Store Page/input_Type to search'), 'git pocket guide')
// Click on Search Box Object Repository/DEMO QA/Book Store Page/search button
WebUI.click(findTestObject('Object Repository/DEMO QA/Book Store Page/search button'))
// Verify element exists Object Repository/DEMO QA/Book Store Page/div_Git Pocket Guide
WebUI.verifyElementPresent(findTestObject('Object Repository/DEMO QA/Book Store Page/div_Git Pocket Guide'), 10)
// Take a screenshot
WebUI.takeScreenshot()
// Click on login button Object Repository/DEMO QA/Book Store Page/button_login
WebUI.click(findTestObject('Object Repository/DEMO QA/Book Store Page/button_login'))
// Enter username in Object Repository/DEMO QA/Login Page/input_UserName
WebUI.setText(findTestObject('Object Repository/DEMO QA/Login Page/input_UserName'), 'username')
// Enter password in Object Repository/DEMO QA/Login Page/input_Password
WebUI.setEncryptedText(findTestObject('Object Repository/DEMO QA/Login Page/input_Password'), 'encryptedPassword')
// Click on Login Button Object Repository/DEMO QA/Login Page/button_login
WebUI.click(findTestObject('Object Repository/DEMO QA/Login Page/button_login'))
// Click on new user button  Object Repository/DEMO QA/Login Page/button_newUser
WebUI.click(findTestObject('Object Repository/DEMO QA/Login Page/button_newUser'))
// Take screenshot
WebUI.takeScreenshot()
// Enter First name  Object Repository/DEMO QA/Register page/input_First Name
WebUI.setText(findTestObject('Object Repository/DEMO QA/Register page/input_First Name'), 'FirstName')
// Enter Last Name Object Repository/DEMO QA/Register page/input_Last Name
WebUI.setText(findTestObject('Object Repository/DEMO QA/Register page/input_Last Name'), 'LastName')
// Enter username Object Repository/DEMO QA/Register page/input_UserName
WebUI.setText(findTestObject('Object Repository/DEMO QA/Register page/input_UserName'), 'newusername')
// Enter password Object Repository/DEMO QA/Register page/input_Password
WebUI.setEncryptedText(findTestObject('Object Repository/DEMO QA/Register page/input_Password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')
// set on I am not a robot checkbox Object Repository/DEMO QA/Register page/div_presentation
WebUI.click(findTestObject('Object Repository/DEMO QA/Register page/Checkbox'))
// Enter register Object Repository/DEMO QA/Register page/button_register
WebUI.click(findTestObject('Object Repository/DEMO QA/Register page/button_register'))
// Takes screenshot
WebUI.takeScreenshot()
// Close the browser
WebUI.closeBrowser()
