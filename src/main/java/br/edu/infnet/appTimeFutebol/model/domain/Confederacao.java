package br.edu.infnet.appTimeFutebol.model.domain;

public class Confederacao {

	private String descricao;
	private String email;
	private String  estado;
	
	public Confederacao(String nome, String email, String estado) {
		this.descricao  = nome;
		this.email = email;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(descricao);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(estado);
		
		return sb.toString();
	}
	
	public String getNome() {
		return descricao;
	}
	public void setNome(String nome) {
		this.descricao = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCnpj() {
		return estado;
	}
	public void setCnpj(String cnpj) {
		this.estado = cnpj;
	}
	
}
