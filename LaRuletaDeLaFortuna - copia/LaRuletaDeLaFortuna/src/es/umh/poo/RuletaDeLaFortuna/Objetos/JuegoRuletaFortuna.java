package es.umh.poo.RuletaDeLaFortuna.Objetos;

public class JuegoRuletaFortuna {
	
	private Nivel modoDeJuego; 
	private int puntuacionEnCurso;
	private String fraseEnJuego;
	private String letrasAcertadas;
	private String letrasFallidas;
	
	
	
	
	
public enum Nivel{
		
		NOVATO, MEDIO, EXPERTO
	}
	
	
	
/**
 * Imprime tipos de juego
 * @return texto
 */
public String imprimirSelectNivel() {
	
	String aux; 
	
	
	aux = "\n1. Novato"; 
	aux += "\n2. Medio"; 
	aux += "\n3. Experto"; 
	aux += "\n\nSeleccione nivel de dificultad del juego: "; 
	
	return aux; 
}
	
	

/**
 * Seleccion de dificultad del juego
 * @param num
 * @return enum tipo de nivel 
 */
public Nivel seleccionarNivel(int num) {
	
	Nivel level = null; 
	
	switch(num) {
	
	
	case 1: 
		level = Nivel.NOVATO;
		break; 
		
	case 2: 
		level = Nivel.MEDIO; 
		break; 
		
	case 3:
		level = Nivel.EXPERTO;
		break; 
		
	default: System.out.println("Error de eleccion");		
	}
	
	return level; 
	
}

	



	
	
	
	
	
	
	
	
	
	
	
	
	
	/* Getters y Setters*/
	
	
	public Nivel getModoDeJuego() {
		return modoDeJuego;
	}
	public void setModoDeJuego(Nivel modoDeJuego) {
		this.modoDeJuego = modoDeJuego;
	}
	public int getPuntuacionEnCurso() {
		return puntuacionEnCurso;
	}
	public void setPuntuacionEnCurso(int puntuacionEnCurso) {
		this.puntuacionEnCurso = puntuacionEnCurso;
	}
	public String getFraseEnJuego() {
		return fraseEnJuego;
	}
	public void setFraseEnJuego(String fraseEnJuego) {
		this.fraseEnJuego = fraseEnJuego;
	}
	public String getLetrasAcertadas() {
		return letrasAcertadas;
	}
	public void setLetrasAcertadas(String letrasAcertadas) {
		this.letrasAcertadas = letrasAcertadas;
	}
	public String getLetrasFallidas() {
		return letrasFallidas;
	}
	public void setLetrasFallidas(String letrasFallidas) {
		this.letrasFallidas = letrasFallidas;
	}
	
	
	
	
	
	
	
	

}