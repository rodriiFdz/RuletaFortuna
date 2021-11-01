package es.umh.poo.RuletaDeLaFortuna.Objetos;

public class Tirada {
	
	private int puntosObtenidos;
	
	
	int puntuacion[] = {0, 10, 20 ,30, 40}; 
	
	
	
	/**
	 * Metodo para obtener la puntuacion de forma random 
	 * @return puntuacion random 
	 */
	public int damePuntos() {
		
		int aux; 
		aux= (int) (Math.random()*4); 		
		
		//En otro metodo haremos un setPuntosObtenidos para establecer la variable
		
		return aux; 
	}
	
	
	
	
	
	
	
	/*Getters y Setters*/

	public int getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(int puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	
	
	
	

}