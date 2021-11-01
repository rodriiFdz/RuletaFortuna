package es.umh.poo.RuletaDeLaFortuna.Objetos;

import es.umh.poo.RuletaDeLaFortuna.Objetos.JuegoRuletaFortuna.Nivel;

public class Frase {
	
	private String frasesNovatos;
	private String frasesMedias;
	private String frasesExpertos;
	
	
	
	
	
	
	
	
	
	
	String frasesFaciles[]  = {"viva java" , "hello world", "lorem Ipsum"}; 
	
	String frasesMedio[]  = {"lentejas con choricico" , "panaderia de pan", "a llorar a la lloreria"}; 
	
	String frasesExperto[]  = {"en boca cerrada no entra falo" , "poliedro sanchez pagame el alquiler", "hablo el mudo y dijo lo que pudo"}; 
	
	 
	

	
	//Metodo de prueba
	
	public void imprimirFrase(Nivel nivel) {
		
		int random; 
		
		 
		
		
		
		switch(nivel) {
		
		case NOVATO: 
			random = (int) (Math.random()*frasesFaciles.length);
			System.out.println(frasesFaciles[random]);
			break; 
			
			
		case MEDIO: 
			random = (int) (Math.random()*frasesMedio.length);
			System.out.println(frasesMedio[random]);
			break; 
			
			
		case EXPERTO:
			random = (int) (Math.random()*frasesExperto.length);
			System.out.println(frasesExperto[random]);
			break; 
			
		}
			
		
	}
	
	
	
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* Getters y Setters*/
	

	
	public String getFrasesNovatos() {
		return frasesNovatos;
	}
	public String getFrasesMedias() {
		return frasesMedias;
	}
	public String getFrasesExpertos() {
		return frasesExpertos;
	}
	
	
	

	
	
	
	

}
