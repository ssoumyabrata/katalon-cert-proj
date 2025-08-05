import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


// Open browser with the url stored in GlobalVariable.G_SiteURL
WebUI.openBrowser(GlobalVariable.G_SiteURL)

LoginClass.login(Username, Password)


// Select the option by label Facility in the select_Facility_combo_facility dropdown (not regex)
WebUI.selectOptionByLabel(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/select_Facility_combo_facility'), Faci0lity, false)

// Check the program radio button with label Program
WebUI.check(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/label_Healthcare Program_radio-inline'))

// Enter the Visit_Date into the input_Visit Date (Required)_txt_visit_date field
WebUI.setText(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/input_Visit Date (Required)_txt_visit_date'), Visit_Date)

// Enter the Comment into the textarea_Comment_txt_comment field
WebUI.setText(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/textarea_Comment_txt_comment'), Comm0ent)

// Click the Make Appointment button
WebUI.click(findTestObject('Object Repository/HealthCare/Page_CuraAppointment/button_makeAppointment'))
WebUI.delay(2)

// Capture the screenshot of the page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()




