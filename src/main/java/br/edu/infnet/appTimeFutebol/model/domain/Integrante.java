package br.edu.infnet.appTimeFutebol.model.domain;

public abstract class Integrante {

	private String nome;
	private int id;
	private boolean registrado;
	private float salario;
	
	
	public Integrante(String nome, int id, boolean registrado, float salario) {
		this.nome = nome;
		this.id = id;
		this.registrado = registrado;
		this.salario = salario;
	}
	
	public abstract float calcularBonus();
		
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(id);
		sb.append(";");
		sb.append(registrado ? "Liberado" : "Não liberado");
		sb.append(";");
		sb.append(salario);
		
		return sb.toString();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}


	public boolean isRegistrado() {
		return registrado;
	}


	public float getSalario() {
		return salario;
	}

	public Object getTimes() {
		return null;
	}
}