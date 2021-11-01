package es.umh.poo.RuletaDeLaFortuna;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import es.umh.poo.RuletaDeLaFortuna.Objetos.*;
import es.umh.poo.RuletaDeLaFortuna.Objetos.JuegoRuletaFortuna.Nivel;

public class Main {
	private static Scanner scanIn; 
	
 
	
	public static void main(String args[]) throws ParseException  {
		
		//Scanner
		scanIn = new Scanner(System.in);
		
		
		//Zona variables e instancias
		
		int valorAux, numPartidas, nivelAux;
		String alias, password;    
		Jugador aux; 
		Nivel nivel; 
		
		
		
	
		
	 
		//Comienzo codigo
		
		System.out.println("La Ruleta de la Fortuna"); 
		System.out.println("---------------------------"); 
		
		
		 //Crear jugadores de prueba automaticos
		
			Jugador.crearjugadoresdummy();
		
		
		
		//Seleccion tipo de inicio de sesion
		
		System.out.println(Jugador.imprimirSeleccion()); 
		
		valorAux = Integer.parseInt(scanIn.nextLine());
		
		
		
		/**
		 * Switch para direccionar la seleccion de inicio de sesion
		 */
		
		switch(valorAux) {
		
		case 1: //Acceso con registro de nuevo usuario
			
			
			 aux = Jugador.registroJugador();
			 Jugador.addToArrayList(aux); 
			 
			 System.out.println("\nBienvenido al juego " + aux.getAlias());
					 
			break; 
			
			
		case 2: //Acceso con inicio de sesion 
			
					
			alias = leeDato("Introduce tu alias: ");
			password = leeDato("Introduce tu contraseña: ");
			
			//Probar que el usuario esta en el arraylist
			
			
			Jugador.validarInicioSesion(alias, password);
			 		
			break; 
		
		case 3: //Acceso con invitado
			
			alias = "invitado"; 
			password = "invitado"; 
			
			Jugador guest = new Jugador(alias, password); 
			System.out.println("\nBienvenid@ al juego *" + guest.getAlias() + "*");
			
			break; 
			
			
		default: System.out.println("Error de seleccion");
		
		}
		
		
		//Establecer numero de partidas 
		
		 Partida partida = new Partida(); 
		 numPartidas = leeNum("\nSeleccione el numero de partidas a jugar: "); 
		
		partida.setNumeroPartidas(numPartidas);
		
		 
		
		//Establecer modo de juego
		
		JuegoRuletaFortuna mecanica = new JuegoRuletaFortuna(); 
		Frase frase = new Frase(); 
		
		System.out.println(mecanica.imprimirSelectNivel());
		
		nivelAux = scanIn.nextInt(); 
		nivel = mecanica.seleccionarNivel(nivelAux); 
		mecanica.setModoDeJuego(nivel);
		frase.imprimirFrase(nivel);
		 
		
		
	
	
		
		
	
	
	
		
	
	
		
		
		
		
		
		
		
		
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Solicitamos strings con una función
	 * @param cadena
	 * @return string para asignar a variable
	 */

	private static String leeDato(String cadena)
	{
		System.out.println(cadena);
		 
		return scanIn.nextLine();
	}
	
	
	/**
	 * Solicitamos los datos con una función
	 * @param cadena
	 * @return dato para asignar a variable
	 */

	private static int leeNum(String cadena)
	{
		System.out.println(cadena);
		 
		return scanIn.nextInt();
	}
	

	
	
}