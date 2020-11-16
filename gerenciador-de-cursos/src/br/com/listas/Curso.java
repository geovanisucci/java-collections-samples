package br.com.listas;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Curso {

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	private String nome;
	private String instrutor;
	/* A ideia de usar sempre o List, a gente encapsula tudo (� como se fosse o
	/ IList do .Net)*
	 ArrayList � mais perform�tico, mas tem um problema para manipula��o do meio, faz v�rias coisas na mem�ria
	 LinkedList � mais perform�tico em manipula��o, por�m � muito lenta para pegar um elemento*
	 ArrayList � o mais utilizado */
	private List<Aula> aulas = new LinkedList<Aula>();

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {	
		return Collections.unmodifiableList(aulas);
		
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		/*int tempoTotal = 0;
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}*/
		
		//return tempoTotal;
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[CURSO: " + nome + ", tempo total: " + this.getTempoTotal() + ", Aulas: " + this.aulas + "]";
	}

}
