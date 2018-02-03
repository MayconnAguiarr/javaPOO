package services;
import model.SituationBill;
import model.Supplier;

public class PayBill extends Bill {

	private Supplier supplier;
	
	public PayBill() {};

	public PayBill(Supplier supplier, String description, Double value, String expirationDate) {
		this.supplier = supplier;
		this.setDescription(description);
		this.setValue(value);
		this.setExpirationDate(expirationDate);
	}
	
	public void pay() {
		if (SituationBill.PAID.equals(this.getSituationBill())) {
			System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescription() + ".");
		} else if (SituationBill.CANCELED.equals(this.getSituationBill())) {
			System.out.println("Não pode pagar uma conta que está cancelada: " + this.getDescription() + ".");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescription() + " no valor de " + this.getValue() + " e vencimento em "
							+ this.getExpirationDate() + " do fornecedor " + this.getSupplier().getName() + ".");

			this.situationBill = SituationBill.PAID;
		}
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
}
