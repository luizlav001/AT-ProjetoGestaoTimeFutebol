package br.edu.infnet.appTimeFutebol.model.domain;

import br.edu.infnet.appTimeFutebol.model.exceptions.FuncaoNullException;

public class ComissaoTecnica extends Integrante {
	
	private String funcao;
	private boolean tecnico;
	private int qtdeTitulos;
	

	public ComissaoTecnica(String nome, int id, boolean registrado, float salario) {
		super(nome, id, registrado, salario);
	}


	public float calcularBonus() {

		return  (float) (getSalario() + (tecnico ? (getSalario() * 0.10) : (getSalario() * 0.05)));
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(funcao);
		sb.append(";");
		sb.append(tecnico ? "Técnico" : "Menbro da comissão");
		sb.append(";");
		sb.append(qtdeTitulos);
		sb.append(";");
		sb.append(calcularBonus());
		
		
		return sb.toString();
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) throws FuncaoNullException {
		
		if(funcao == null) {
			throw new FuncaoNullException("Função inválida!");
		}
		
		this.funcao = funcao;
	}


	public boolean isTecnico() {
		return tecnico;
	}


	public void setTecnico(boolean tecnico) {
		this.tecnico = tecnico;
	}


	public int getQtdeTitulos() {
		return qtdeTitulos;
	}


	public void setQtdeTitulos(int qtdeTitulos) {
		this.qtdeTitulos = qtdeTitulos;
	}
}
