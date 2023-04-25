package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
	
	@Override
	public BigDecimal calculateTaxFor(BigDecimal amount) {
		BigDecimal tax = new BigDecimal("0.13");
		return amount.multiply(tax);
	}
	
}
