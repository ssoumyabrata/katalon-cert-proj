package com.cert

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ComplexProg {

	static def mergeIntervals(List<List<Integer>> intervals) {
		if (intervals == null || intervals.size() == 0) return []

		// Filter out invalid intervals (null or negative length)
		def validIntervals = intervals.findAll {
			it != null && it.size() == 2 && it[0] != null && it[1] != null && it[0] <= it[1]
		}

		if (validIntervals.size() == 0) return []

		// Sort intervals by start
		validIntervals.sort { a, b -> a[0] <=> b[0] }

		List<List<Integer>> merged = []
		for (interval in validIntervals) {
			if (merged.isEmpty() || merged.last()[1] < interval[0] - 1) {
				// No overlap or only touching by one value
				merged << [interval[0], interval[1]]
			} else {
				// Overlap or adjacent: merge
				merged.last()[1] = Math.max(merged.last()[1], interval[1])
			}
		}
		return merged
	}

	static def mergeIntervalsOpt(List<List<Integer>> intervals) {
		if (intervals == null || intervals.size() == 0) return []

		// Filter out invalid intervals (null or negative length)
		def validIntervals = intervals.findAll {
			it != null && it.size() == 2 && it[0] != null && it[1] != null && it[0] <= it[1]
		}

		if (validIntervals.size() == 0) return []

		// Sort intervals by start
		validIntervals.sort { a, b -> a[0] <=> b[0] }

		List<List<Integer>> merged = []
		for (interval in validIntervals) {
			if (merged.isEmpty() || merged.last()[1] < interval[0] - 1) {
				// No overlap or only touching by one value
				merged << [interval[0], interval[1]]
			} else {
				// Overlap or adjacent: merge
				merged.last()[1] = Math.max(merged.last()[1], interval[1])
			}
		}
		return merged
	}
}
