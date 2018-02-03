package main;

import model.Client;
import model.Supplier;
import services.PayBill;
import services.ReceiveBill;

public class Main {

	public static void main(String[] args) {
		// instancia Fornecedores
		Supplier imobiliaria = new Supplier();
		imobiliaria.setName("Casa & Cia Negócios Imobiliários");
		Supplier mercado = new Supplier();
		mercado.setName("Mercado do João");

		// instanciando clientes
		Client atacadista = new Client();
		atacadista.setName("Triângulo Quadrado Atacadista");
		Client telecom = new Client();
		telecom.setName("FoneNet Telecomunicações");

		// instanciando contas a pagar
		PayBill contaPagar1 = new PayBill();
		contaPagar1.setDescription("Aluguel da matriz");
		contaPagar1.setValue(1230d);
		contaPagar1.setExpirationDate("10/05/2012");
		contaPagar1.setSupplier(imobiliaria);

		PayBill contaPagar2 = new PayBill(mercado, "Compras do mês", 390d, "19/05/2012");

		// instanciando contas a receber
		ReceiveBill contaReceber1 = new ReceiveBill();
		contaReceber1.setDescription("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValue(89500d);
		contaReceber1.setExpirationDate("23/05/2012");
		contaReceber1.setClient(atacadista);

		ReceiveBill contaReceber2 = new ReceiveBill(telecom, "Manutenção em sistema de conta online", 53200d,
				"13/05/2012");

		// pagamento e cancelamento de contas a pagar
		contaPagar1.pay();
		contaPagar2.cancel();

		// recebimento e cancelamento de contas a receber
		contaReceber1.receive();
		contaReceber2.cancel();	
	}

}
