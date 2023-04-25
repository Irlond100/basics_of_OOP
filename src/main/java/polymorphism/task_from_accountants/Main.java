package polymorphism.task_from_accountants;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		TaxService taxService = new TaxService();
		Bill[] payments = new Bill[]{
			new Bill(new BigDecimal("100000"), new IncomeTaxType(), taxService),
			new Bill(new BigDecimal("200000"), new VATaxType(), taxService),
			new Bill(new BigDecimal("300000"), new ProgressiveTaxType(), taxService),
			
		};
		for (Bill bill : payments) {
			bill.payTaxes();
		}
	}
	
}
