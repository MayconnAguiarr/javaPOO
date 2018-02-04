package model;

public class Carro implements Veiculo, Motor {

	private int id;
	private String nome;
	private String fabricante;
	private String modelo;

	public Carro() {
	}

	public Carro(int id, String nome, String modelo, String fabricante) {
		this.id = id;
		this.nome = nome;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	@Override
	public String getModelo() {
		return modelo;
	}

	@Override
	public String getFabricante() {
		return fabricante;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getNome() {
		return nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void listar() {		
		System.out.println("id " + this.getId());
		System.out.println("Nome " + this.getNome());
		System.out.println("Modelo " + this.getModelo());
		System.out.println("Fabricante " + this.getFabricante());
		System.out.println("--------------------------------------");
	}		
}
