package com.cert

import com.kms.katalon.core.annotation.Keyword

public class PackageClass {

	/*
	 * Calculate the tax amount based on income, tax slabs, and rates including standard deduction and cess.
	 *
	 * @param income: the total income of the individual
	 * @param slabs: the list of income slab limits for tax calculation
	 * @param rates: the list of tax rates corresponding to each slab
	 * @return the rounded final tax amount
	 */
	@Keyword
	static def calculateTax(double income, List<Double> slabs, List<Double> rates) {
		final double STANDARD_DEDUCTION = 75000.0
		final double CEILING_INCOME = 1200000.0
		double taxableIncome = Math.max(0, income - STANDARD_DEDUCTION)
		double tax = 0.0
		double previousLimit = 0.0

		for (int i = 0; i < slabs.size(); i++) {
			double slabLimit = slabs[i]
			if (taxableIncome > previousLimit) {
				if (taxableIncome <= slabLimit) {
					tax += (taxableIncome - previousLimit) * rates[i]
					break
				} else {
					tax += (slabLimit - previousLimit) * rates[i]
					previousLimit = slabLimit
				}
			}
		}

		if (income > CEILING_INCOME) {
			tax += (taxableIncome - previousLimit) * rates[slabs.size()]  // Assuming the last slab has a rate
		}

		return Math.round(tax * 1.04)  // apply cess
	}
}

