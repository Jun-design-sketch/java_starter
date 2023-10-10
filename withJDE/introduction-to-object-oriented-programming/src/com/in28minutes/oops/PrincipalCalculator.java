package com.in28minutes.oops;

import java.math.BigDecimal;

public class PrincipalCalculator {

	// class variable
	private BigDecimal originalValue;
	private BigDecimal principal;

	// Constructor
	public PrincipalCalculator(String originalValue, String principal) {
		this.originalValue = new BigDecimal(originalValue);
		this.principal = new BigDecimal(principal);
	}

	// setter
	public void setOriginalValue(BigDecimal originalValue) {
		this.originalValue = originalValue;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	// getter
	public BigDecimal getOriginalValue() {
		return this.originalValue;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	// method calculate
	public BigDecimal calculateTotalValue(int years) {
		// get interest value per year
		BigDecimal interestValuePerYear = this.originalValue
				.multiply(this.principal.divide(BigDecimal.valueOf(100)));
		// get interest value all year
		BigDecimal interestValueAllYear = interestValuePerYear.multiply(BigDecimal.valueOf(years));
		// total value = original value + interest value all year
		BigDecimal totalValue = this.originalValue.add(interestValueAllYear);

		return totalValue;
	}

}
