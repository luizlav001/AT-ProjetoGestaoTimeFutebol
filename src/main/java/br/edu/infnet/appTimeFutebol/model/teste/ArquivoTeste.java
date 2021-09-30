package br.edu.infnet.appTimeFutebol.model.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appTimeFutebol.model.domain.ComissaoTecnica;
import br.edu.infnet.appTimeFutebol.model.domain.Confederacao;
import br.edu.infnet.appTimeFutebol.model.domain.Gestor;
import br.edu.infnet.appTimeFutebol.model.domain.Integrante;
import br.edu.infnet.appTimeFutebol.model.domain.Jogador;
import br.edu.infnet.appTimeFutebol.model.domain.Time;
import br.edu.infnet.appTimeFutebol.model.exceptions.CargoNullException;
import br.edu.infnet.appTimeFutebol.model.exceptions.FuncaoNullException;
import br.edu.infnet.appTimeFutebol.model.exceptions.PosicaoNullException;

public class ArquivoTeste {

public static void main(String[] args) {
		
		String dir = "C:/Users/Gregory/OneDrive/Documentos/Fundamentos Java/";
		String arq = "Time.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();

				List<Time> times = new ArrayList<Time>();
				Integrante integrante = new Integrante();
				
				while(linha != null) {
					
					campos = linha.split(";");
					
					if(campos.length == 5) {
						Confederacao confederacao = new Confederacao(
								campos[2],
								campos[3],
								campos[4]
								);
						
						integrante.setNome(campos[0]);
						integrante.setId(Integer.valueOf(campos[1]));
						integrante.setRegistrado(Boolean.valueOf(campos[2]));
						integrante.setSalario(Float.valueOf(campos[3]));
						
					}else {
					
						switch (campos[0]) {
						case "J":
							Jogador jogador = new Jogador(
										campos[1],
										Integer.valueOf(campos[2]),
										Boolean.valueOf(campos[4]),
										Float.valueOf(campos[3])
								);
							
							try {
								
								jogador.setPosicao(campos[5]);
								jogador.setIdade(Integer.valueOf(campos[5]));
								jogador.setRegistrado(Boolean.valueOf(campos[6]));
								jogador.setValorPasse(Float.valueOf(campos[7]));
								
								integrante.add(jogador);
							}catch(NumberFormatException | PosicaoNullException e) {
								System.out.println(e.getMessage());
							}
							
							break;

						case "C":
							ComissaoTecnica comissaoTecnica = new ComissaoTecnica(
									
									campos[1],
									Integer.valueOf(campos[2]),
									Boolean.valueOf(campos[4]),
									Float.valueOf(campos[3])
									
									);
							
							try {
								comissaoTecnica.setFuncao(campos[5]);
								comissaoTecnica.setQtdeTitulos(Integer.valueOf(campos[6]));
								comissaoTecnica.setTecnico(Boolean.valueOf(campos[7]));
								
								integrante.add(comissaoTecnica);
							}catch(NumberFormatException | FuncaoNullException e) {
								System.out.println(e.getMessage());	
								}
							break;

						case "G":
							Gestor gestor = new Gestor(
									
									campos[1],
									Integer.valueOf(campos[2]),
									Boolean.valueOf(campos[4]),
									Float.valueOf(campos[3])
									); 
							
							try {
								gestor.setCargo(campos[5]);
								gestor.setCargoConfianca(Boolean.valueOf(campos[6]));
								gestor.setAdicional(Float.valueOf(campos[7]));
								
								integrante.add(gestor);
							}catch(NumberFormatException | CargoNullException e) {
								System.out.println(e.getMessage());		
							}
							break;
							
						default:
							System.out.println("Pedido sem tipo!!!");
							break;
						}
					}					

					linha = leitura.readLine();
				}	
				
				for(Time time : integrante.getTimes()) {
					escrita.write(

							integrante.getNome()+";"+
							integrante.getConfederacao().getNome()+";"+
							time.getNome()+";"+
							time.get.CalcularBonus();
							
							);
					
				}
				
				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
	}
}
