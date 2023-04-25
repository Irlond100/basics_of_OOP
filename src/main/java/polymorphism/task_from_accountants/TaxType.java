package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public abstract class TaxType {
	
	public abstract BigDecimal calculateTaxFor(BigDecimal amount);
	
}
