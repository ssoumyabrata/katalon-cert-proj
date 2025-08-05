/*
*use customkeyword 
*verifydouble from WebAction com.action.webaction class and verify two values 2.33 and 6.55 
*

*/
// Call custom keyword 'verifydouble' from 'com.action.webaction' class to verify values 2.33 and 6.55
CustomKeywords.'com.action.WebAction.verifyDouble'('2.33', '6.55')

CustomKeywords.'com.action.WebAction.verifyIgnoreCase'('Hi Test This', 'hi test this')

/*
 * Write use case to test the following custom keywords from below class:
 * Class = com.action.WebAction
 * Custom keyword are = isNullOrEmpty, numberCheckToString, compare, compareIgnoreCase, verifyEmpty, verify, verifyIgnoreCase, verifyDouble
 * analyse these keywords - what parameter its using. and generate script to test these keywords
 */
// Test isNullOrEmpty with an empty string
CustomKeywords.'com.action.WebAction.isNullOrEmpty'('')

// Test isNullOrEmpty with a non-empty string
CustomKeywords.'com.action.WebAction.isNullOrEmpty'('Test String')

// Test numberCheckToString with an integer
CustomKeywords.'com.action.WebAction.numberCheckToString'(123)

// Test numberCheckToString with a double
CustomKeywords.'com.action.WebAction.numberCheckToString'(45.67)

// Test compare with two equal strings
CustomKeywords.'com.action.WebAction.compare'('Test', 'Test')

// Test compare with two different strings
CustomKeywords.'com.action.WebAction.compare'('Test', 'test')

// Test compareIgnoreCase with two strings differing in case
CustomKeywords.'com.action.WebAction.compareIgnoreCase'('Test', 'test')

// Test compareIgnoreCase with two different strings
CustomKeywords.'com.action.WebAction.compareIgnoreCase'('Test', 'Demo')

// Test verifyEmpty with true flag and empty string
CustomKeywords.'com.action.WebAction.verifyEmpty'(true, '')

// Test verifyEmpty with false flag and non-empty string
CustomKeywords.'com.action.WebAction.verifyEmpty'(false, 'Not Empty')

// Test verify with two equal strings
CustomKeywords.'com.action.WebAction.verify'('Hello', 'Hello')

// Test verify with two different strings and boolean flags
CustomKeywords.'com.action.WebAction.verify'('Hello', 'hello', true, true)

// Test verifyIgnoreCase with two strings differing in case
CustomKeywords.'com.action.WebAction.verifyIgnoreCase'('HELLO', 'hello')

// Test verifyDouble with two equal double strings
CustomKeywords.'com.action.WebAction.verifyDouble'('3.14', '3.14')

// Test verifyDouble with two different double strings and boolean flag
CustomKeywords.'com.action.WebAction.verifyDouble'('2.71', '3.14', true)
