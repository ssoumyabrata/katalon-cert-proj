package com.cert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class AutoExerVerifyLinkWorking {
	
	@Keyword
	static def verify() {
		List<TestObject> linkObjects = []
		
		// We will find hrefs via Javascript execution (returns list of href strings)
		def hrefList = WebUI.executeJavaScript(
			"return Array.from(document.querySelectorAll('a[href]')).map(a => a.href);",
			null)
		
		// Remove duplicates and empty/null hrefs
		def uniqueHrefs = hrefList.findAll { it != null && it.trim() != '' }.toSet()
		
		WebUI.comment("Total unique links found: " + uniqueHrefs.size())
		
		boolean allLinksWorking = true
		
		uniqueHrefs.each { linkUrl ->
			try {
				URL url = new URL(linkUrl)
				HttpURLConnection connection = (HttpURLConnection)url.openConnection()
				connection.setRequestMethod("HEAD")
				connection.setConnectTimeout(5000)
				connection.setReadTimeout(5000)
				connection.connect()
		
				int responseCode = connection.getResponseCode()
		
				// Consider 200-399 as valid response codes (redirects considered OK)
				if (responseCode >= 200 && responseCode < 400) {
					KeywordUtil.markPassed("PASS: Link is working: " + linkUrl + " (Status Code: " + responseCode + ")")
				} else {
					KeywordUtil.markFailed("FAIL: Link returned bad status: " + linkUrl + " (Status Code: " + responseCode + ")")
					allLinksWorking = false
				}
				connection.disconnect()
			} catch (Exception e) {
				KeywordUtil.markFailed("ERROR: Exception for link: " + linkUrl + " - " + e.getMessage())
				allLinksWorking = false
			}
		}
		
		if (allLinksWorking) {
			KeywordUtil.markPassed("All links on the page are working.")
		} else {
			 KeywordUtil.markFailed("Some links on the page are broken or unreachable.")
		}
		
	}
	
}
