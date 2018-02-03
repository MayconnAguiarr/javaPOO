package services;
import model.Client;
import model.SituationBill;

public class ReceiveBill extends Bill {

	private Client client;
	
	public ReceiveBill() {};

	public ReceiveBill(Client client, String description, Double value, String expirationDate) {
		this.client = client;
		this.setDescription(description);
		this.setValue(value);
		this.setExpirationDate(expirationDate);
	}
	
	@Override
	public void cancel() {
		if (this.getValue() > 50000d) {
			System.out.println("Essa conta a receber não pode ser cancelada. "
					+ "É muito dinheiro para deixar de receber: " + this.getDescription());
		} else {
			super.cancel();			
		}
	}

	public void receive() {
		if (SituationBill.PAID.equals(this.getSituationBill())) {
			System.out.println("Não pode receber uma conta que já está paga: " +
					this.getDescription() + ".");
		} else if (SituationBill.CANCELED.equals(this.getSituationBill())) {
			System.out.println("Não pode receber uma conta que está cancelada: " +
					this.getDescription() + ".");
		} else {
			System.out.println("Recebendo conta " +
				this.getDescription() + " no valor de " +
				this.getValue() + " e vencimento em " +
				this.getExpirationDate() + " do cliente " +
				this.getClient().getName() + ".");

			this.situationBill = SituationBill.PAID;
		}
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
