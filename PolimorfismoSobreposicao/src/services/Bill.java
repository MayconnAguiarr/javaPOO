package services;
import model.SituationBill;

public class Bill {
	
	protected String description;
	protected Double value;
	protected String expirationDate;
	protected SituationBill situationBill;	

	public Bill() {
		this.situationBill = SituationBill.PENDING;
	}	

	public void cancel() {
		if (SituationBill.PAID.equals(this.getSituationBill())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescription() + ".");
		} else if (SituationBill.CANCELED.equals(this.getSituationBill())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescription() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescription() + ".");
			this.situationBill = SituationBill.CANCELED;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public SituationBill getSituationBill() {
		return situationBill;
	}

	public void setSituationBill(SituationBill situationBill) {
		this.situationBill = situationBill;
	}	
}
