package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
	
	public BigDecimal calculateTaxFor(BigDecimal amount) {
		BigDecimal tax10 = new BigDecimal("0.1");
		BigDecimal tax15 = new BigDecimal("0.15");
		BigDecimal b = new BigDecimal("100000");
		if (amount.compareTo(b) < 0) {
			return amount.multiply(tax10);
		} else {
			return amount.multiply(tax15);
		}
	}
	
}
