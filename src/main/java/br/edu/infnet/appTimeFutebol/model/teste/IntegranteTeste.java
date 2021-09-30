package br.edu.infnet.appTimeFutebol.model.teste;

import br.edu.infnet.appTimeFutebol.model.domain.ComissaoTecnica;
import br.edu.infnet.appTimeFutebol.model.domain.Gestor;
import br.edu.infnet.appTimeFutebol.model.domain.Jogador;
import br.edu.infnet.appTimeFutebol.model.exceptions.CargoNullException;
import br.edu.infnet.appTimeFutebol.model.exceptions.FuncaoNullException;
import br.edu.infnet.appTimeFutebol.model.exceptions.PosicaoNullException;

public class IntegranteTeste {
	
	public static void main(String[] args) {
		
		//Jogador
		
		try {
			Jogador jogador1 = new Jogador("Luiz", 1, true, 2000);
			jogador1.setPosicao("Atacante");
			jogador1.setIdade(30);
			jogador1.setValorPasse(3000);
			jogador1.setResultadoJogo(true);
			System.out.println(jogador1);
			
		} catch (PosicaoNullException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			Jogador jogador2 = new Jogador("Lincoln", 2, false, 1500);
			jogador2.setPosicao("Zagueiro");
			jogador2.setIdade(25);
			jogador2.setValorPasse(2000);
			jogador2.setResultadoJogo(false);
			System.out.println(jogador2);
		} catch (PosicaoNullException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		//Comossão técnica
		
		try {
			ComissaoTecnica  ct = new ComissaoTecnica("Gregory",30, true, 900);
			ct.setFuncao("Treinaddor");
			ct.setTecnico(true);
			ct.setQtdeTitulos(5);
			System.out.println(ct);
		} catch (FuncaoNullException e) {
			System.out.println(e.getMessage());
		}
		
				
		
		try {
			ComissaoTecnica  ct1 = new ComissaoTecnica("Lays",31, false, 800);
			ct1.setFuncao("Nutrucionista");
			ct1.setTecnico(false);
			ct1.setQtdeTitulos(2);
			System.out.println(ct1);
		} catch (FuncaoNullException e) {
			System.out.println(e.getMessage());
		}
		
		
		//Gestor
		
		try {
			Gestor gestor = new Gestor("João",50, true, 1200);
			gestor.setCargo("Presidente");
			gestor.setCargoConfianca(true);
			gestor.setAdicional(0);
			System.out.println(gestor);
		} catch (CargoNullException e) {
			System.out.println(e.getMessage());
		}
	
		
		try {
			Gestor gestor1 = new Gestor("Pedro",51, true, 500);
			gestor1.setCargo("Diretor de futebol");
			gestor1.setCargoConfianca(false);
			gestor1.setAdicional(0);
			System.out.println(gestor1);
		} catch (CargoNullException e) {
			System.out.println(e.getMessage());
		}
	
	}

}