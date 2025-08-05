package com.cert
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginClass {

	@Keyword
	static void login(String username, String password) {
		// Click on the make appointment button
		WebUI.click(ObjectRepository.findTestObject('Object Repository/HealthCare/Page_CURAHomePage/a_We Care About Your Health_btn-make-appointment'))

		// Enter the login username
		WebUI.setText(ObjectRepository.findTestObject('Object Repository/HealthCare/Page_Login/input_Username_txt-username'), username)

		// Enter the login password
		WebUI.setText(ObjectRepository.findTestObject('Object Repository/HealthCare/Page_Login/input_Password_txt-password'), password)

		// Click on the login button
		WebUI.click(ObjectRepository.findTestObject('Object Repository/HealthCare/Page_Login/button_Password_btn-login'))

		// Verify the appointment element exists with a timeout of 10 seconds
		WebUI.verifyElementPresent(ObjectRepository.findTestObject('Object Repository/HealthCare/Page_CuraAppointment/div_Appointment'), 10)
	}
}
