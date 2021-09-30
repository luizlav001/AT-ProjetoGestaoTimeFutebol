package br.edu.infnet.appTimeFutebol.model.domain;

import br.edu.infnet.appTimeFutebol.model.exceptions.PosicaoNullException;

public class Jogador extends Integrante {

	private String  posicao;
	private int idade;
	private float valorPasse;
	private boolean resultadoJogo;

	public Jogador(String nome, int id, boolean registrado, float salario) {
		super(nome, id, registrado, salario);
	}

	public float calcularBonus() {

		if(resultadoJogo ==  true) {
			return (float) (getSalario() + getSalario() * 0.10);
		}else {
			return (float) (getSalario() + getSalario() * 0.05);
		}
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(posicao);
		sb.append(";");
		sb.append(idade);
		sb.append(";");
		sb.append(valorPasse);
		sb.append(";");
		sb.append(resultadoJogo ? "Ganhou" : "Não ganhou");
		sb.append(";");
		sb.append(calcularBonus());
		
		return sb.toString();
	}
	
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) throws PosicaoNullException {
		
		if(posicao == null) {
			throw new PosicaoNullException("Posição invalida!");
		}
		this.posicao = posicao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getValorPasse() {
		return valorPasse;
	}

	public void setValorPasse(float valorPasse) {
		this.valorPasse = valorPasse;
	}
	
	public boolean isResultadoJogo() {
		return resultadoJogo;
	}

	public void setResultadoJogo(boolean resultadoJogo) {
		this.resultadoJogo = resultadoJogo;
	}

}