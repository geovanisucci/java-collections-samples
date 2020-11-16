package br.com.listas;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		String primeiraAula = aulas.get(0);
		
		System.out.println("A primeira aula �: " + primeiraAula);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		
		
		
		Collections.sort(aulas);
		
		
		aulas.forEach(a -> {
			
			System.out.println("FOREACH = " + a);
			
			}
		);
	}
}
