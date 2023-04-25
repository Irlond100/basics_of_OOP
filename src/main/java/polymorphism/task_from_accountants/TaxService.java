package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public class TaxService {
	
	public void payOut(BigDecimal taxAmount) {
		System.out.format("Уплачен налог в размере %.2f%n", taxAmount.doubleValue());
	}
	
}
