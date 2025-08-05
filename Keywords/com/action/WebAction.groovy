package com.action

import org.apache.commons.lang.math.NumberUtils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.helper.KeywordHelper
import com.kms.katalon.core.util.KeywordUtil

public class VerifyAction {

	/**
	 * Check if the given object is null or an empty string (after trimming).
	 * @param value the object to check for null or empty string
	 * @return true if null or empty string
	 */
	@Keyword
	private static boolean isNullOrEmpty(Object value) {
		if (value == null) {
			return true
		}
		if (value instanceof String) {
			return value.trim().isEmpty()
		}
		return false
	}


	/**
	 * Converts input to a normalized string representation.
	 * @param value the object to be converted
	 * @return a normalized string
	 */
	@Keyword
	private static String numberCheckToString(Object value) {
		if (value == null) {
			return ''
		}
		if (value instanceof Number) {
			// Convert using BigDecimal to avoid scientific notation and trailing zeros
			return new BigDecimal(value.toString()).stripTrailingZeros().toPlainString()
		}
		// If string is a number, normalize it similarly
		if (value instanceof String && NumberUtils.isNumber(value)) {
			return new BigDecimal((String)value).stripTrailingZeros().toPlainString()
		}
		return value.toString()
	}

	/**
	 * Compare actual and expected objects for equality.
	 * @param actual the actual object
	 * @param expected the expected object
	 * @return true if the objects are equal
	 */
	@Keyword
	static boolean compare(Object actual, Object expected) {
		if (NumberUtils.isNumber(String.valueOf(actual)) && NumberUtils.isNumber(String.valueOf(expected))) {
			return KeywordHelper.comparingNumberObject(actual, expected) == 0
		} else {
			return actual == expected
		}
	}

	/**
	 * Verify if actual and expected values are equal, with logging.
	 * @param actual actual value
	 * @param expected expected value
	 * @param takeScreenshot boolean flag to take screenshot if failed
	 * @return true if they match
	 */
	@Keyword
	static boolean compareIgnoreCase(Object actual, Object expected) {
		return actual.toString().equalsIgnoreCase(expected.toString())
	}

	/**
	 * Verify whether the actual value meets expected conditions for emptiness.
	 * @param expectedEmpty expected empty condition
	 * @param actual actual value
	 * @param takeScreenshot boolean flag to take screenshot if failed
	 * @return true if the actual value meets the expected empty condition
	 */
	@Keyword
	static boolean verifyEmpty(boolean expectedEmpty, Object actual, boolean takeScreenshot = false) {
		String log = expectedEmpty ? 'empty' : 'not empty'
		if (isNullOrEmpty(actual) == expectedEmpty) {
			KeywordUtil.markPassed('Actual value is ' + log)
			return true
		} else {
			KeywordUtil.markFailed('Failed to match. Expected value is ' + log)
			return false
		}
	}

	/**
	 * Verify double values ensuring they are compared as numbers.
	 * @param actual string representation of actual value
	 * @param expected string representation of expected value
	 * @param takeScreenshot boolean flag to take screenshot if failed
	 * @return true if double values match
	 */
	@Keyword
	static boolean verify(Object actual, Object expected, boolean takeScreenshot = false, boolean numberCheck = true) {
		boolean isEqual = false
		try {
			if (numberCheck) {
				expected = numberCheckToString(expected)
				actual = numberCheckToString(actual)
			}
			isEqual = compare(actual, expected)
			if (isEqual) {
				KeywordUtil.markPassed('Expected [' + expected + '] and actual [' + actual + '] matches')
			} else {
				KeywordUtil.markFailed('Failed to match. Expected [' + expected + '] and actual [' + actual + ']')
			}
		} catch (Exception e) {
			e.printStackTrace()
			KeywordUtil.markFailed('Exception. Expected [' + expected + '] and actual [' + actual + ']')
			isEqual = false
		}
		return isEqual
	}

	/**
	 * Final verification method to check actual and expected values, including handling for empty checks.
	 * @param expecteddata expected data string
	 * @param actualdata actual data string
	 * @param emptyCheck boolean to check for emptiness
	 * @param takeScreenshot boolean to take screenshot if failed
	 * @param ignoreCase boolean to ignore case during comparison
	 * @return boolean result of verification
	 */
	@Keyword
	static boolean verifyIgnoreCase(Object actual, Object expected, boolean takeScreenshot = false) {
		return verify(actual.toString().toLowerCase(), expected.toString().toLowerCase(), takeScreenshot)
	}

	@Keyword
	static boolean verifyDouble(String actual, String expected, boolean takeScreenshot = true) {
		KeywordUtil.logInfo('Verifying double value between Expected [' + expected + '] and Actual [' + actual + ']')
		try {
			double num1 = Double.parseDouble(actual.replaceAll(',', ''))
			double num2 = Double.parseDouble(expected.replaceAll(',', ''))
			return verify(num1, num2, takeScreenshot)
		} catch (NumberFormatException e) {
			KeywordUtil.markFailed('Number format exception for actual [' + actual + '] or expected [' + expected + ']')
			return false
		}
	}

	static boolean finalVerify(String expecteddata, String actualdata, boolean emptyCheck, boolean takeScreenshot, boolean ignoreCase) {
		if (emptyCheck) {
			if (expecteddata == null || expecteddata.trim().isEmpty()) {
				return verify(actualdata, '', takeScreenshot)
			} else {
				KeywordUtil.logInfo('Checking data [value = ' + actualdata + '] is not empty')
				return verify(!isNullOrEmpty(actualdata), true, takeScreenshot)
			}
		} else {
			return ignoreCase ? verifyIgnoreCase(actualdata, expecteddata, takeScreenshot) : verify(actualdata, expecteddata, takeScreenshot)
		}
	}
}
