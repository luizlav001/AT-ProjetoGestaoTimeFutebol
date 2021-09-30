package br.edu.infnet.appTimeFutebol.model.domain;

import br.edu.infnet.appTimeFutebol.model.exceptions.CargoNullException;

public class Gestor extends Integrante {
	
	private String cargo;
	private boolean cargoConfianca;
	private float adicional;

	public Gestor(String nome, int id, boolean registrado, float salario) {
		super(nome, id, registrado, salario);
	}


	public float calcularBonus() {
		
		return (float) (getSalario() + (cargoConfianca ? (getSalario() * 0.10) : (getSalario() * 0.05)));
	}
	
	@Override
	public String toString() {
		
	StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(cargo);
		sb.append(";");
		sb.append(cargoConfianca ? "Cargo de confiança" : "Cargo simples");
		sb.append(";");
		sb.append(adicional);
		sb.append(";");
		sb.append(calcularBonus());
		
		return sb.toString();
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) throws CargoNullException {
		if(cargo == null) {
			throw  new CargoNullException("Cargo inválido!");
		}
		
		this.cargo = cargo;
	}

	public boolean isCargoConfianca() {
		return cargoConfianca;
	}

	public void setCargoConfianca(boolean cargoConfianca) {
		this.cargoConfianca = cargoConfianca;
	}

	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
	
	

}
