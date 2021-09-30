package br.edu.infnet.appTimeFutebol.model.teste;

import br.edu.infnet.appTimeFutebol.model.domain.Confederacao;

public class ConfederacaoTeste {

	public static void main(String[] args) {
		
		Confederacao confederacao = new  Confederacao("Carioca","confcarioca@infnet.com.br", "123.456.789-89");
		System.out.println(confederacao);
	}
}