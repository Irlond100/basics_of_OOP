package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
	
	public BigDecimal calculateTaxFor(BigDecimal amount) {
		BigDecimal tax = new BigDecimal("0.18");
		return amount.multiply(tax);
	}
	
}
