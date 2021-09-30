package br.edu.infnet.appTimeFutebol.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Time {

	private String nome;
	private LocalDateTime data;
	private boolean divisao;
	private Confederacao confederacao;
	private List<Integrante> integrantes;
	
	public Time() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(divisao ? "Elite" : "Divisão  de acesso");
		sb.append(";");
		sb.append(confederacao);
		sb.append(";");
		sb.append(integrantes.size());
		
		return sb.toString();
	}
	
	public boolean isDivisao() {
		return divisao;
	}

	public void setDivisao(boolean divisao) {
		this.divisao = divisao;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Confederacao getConfederacao() {
		return confederacao;
	}
	public void setConfederacao(Confederacao confederacao) {
		this.confederacao = confederacao;
	}

	public List<Integrante> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(List<Integrante> integrantes) {
		this.integrantes = integrantes;
	}
	
}
