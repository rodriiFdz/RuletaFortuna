package es.umh.poo.RuletaDeLaFortuna.Objetos;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Jugador {

	static Scanner scan = new Scanner(System.in); 
	

	
	//ArrayList para almacenar jugadores
	
	static ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>(); 
	
	//Variables
	
	private String alias; 
	private String password; 
	private String nombre; 
	private Date fechaNacimiento;
	
	 
	
	
	 
	


	/**
	 * Constructor de nuevos usuarios
	 */
	
	 public Jugador(String alias, String password) {
	
		this.alias = alias; 
		this.password = password; 
	 }
	 
	 

	 
	 /**
		 * Imprime de tipo de inicio de sesion 
		 * @return texto
		 */
		
		public static String imprimirSeleccion() {
			String aux; 
			aux = "1. Registro de usuario" + "\n";
			aux += "2. Inicio de sesion"+ "\n";
			aux += "3. Jugar como invitado" + "\n" ;
			aux += "Elija una de las siguientes opciones para comenzar a jugar: ";
			
			return aux;
			
		}
	 
		
		
		/**
		 * Metodo registro de usuarios 
		 */
		public static Jugador registroJugador() throws ParseException{
			
			int passwdLong; 
			String alias,nombre, password; 
			Date fechaNacimiento; 
			Jugador aux; 
			
			alias = LeeDato("Introduce un alias: ");
			password = LeeDato("Introduce una contraseña: "); 
			
			passwdLong = password.length(); 
			
			
			if(passwdLong < 6) {
				System.out.println("La contraseña debe tener 6 caracteres como minimo");
				System.exit(0); 
			}
			
			
			nombre = LeeDato("Introduce tu nombre: ");
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //Casting String to Date
			fechaNacimiento = formato.parse(LeeDato("Introduce tu fecha de nacimiento (Con formato dd/MM/yyyy): ")); 
			
			
			aux = new Jugador(alias , password); 
			
			aux.setNombre(nombre); 
			aux.setFechaNacimiento(fechaNacimiento); 
		
			 
			
			return aux; 
					
			}
	 
	 
		
		
	 
	 
	 
	 /**
		 * Metodo para añadir jugadores al arraylist 
		 * @param jugador
		 */
		public static void addToArrayList(Jugador jugador) {
			
			Jugador player = jugador;
			listaJugadores.add(player);

			}
		
	
		

		
		/**
		 * Metodo para iniciar sesion 
		 * @param alias
		 * @param password
		 * @return validacion de nuestra cuenta
		 */
		
		public static void validarInicioSesion(String alias, String password) {
			
			String alias_ = alias; 
			String passwd = password; 
			Jugador aux; 
			String aliasRegistrado,passwordRegistrado; 
			
			int i = 0; 
			
			for( i = 0 ; i < listaJugadores.size(); i++) {
			
				aux = listaJugadores.get(i); 
				aliasRegistrado = aux.getAlias(); 
				passwordRegistrado = aux.getPassword(); 
				
				
				
				if(alias_ .equals(aliasRegistrado) && passwd.equals(passwordRegistrado)) {
					System.out.println("\nInicio de sesion correcto");
					System.out.println("\nBienvenid@ al juego *" + aux.getAlias() + "*");
				}
				
				else {
					System.out.println("\nError de autentificacion");
					System.exit(0);
					
				}																			
			}			
		}
	
	
		

		/**
		 * Metodo para crear jugadores de prueba
		 */
		
		public static void crearjugadoresdummy(){
			
			Jugador jug;
			
			jug = new Jugador ("usu", "pass");		
			Jugador.addToArrayList(jug);		
		}
		
		


		public static void mostrarUsuarios() {
			
			int i = 0; 
			Jugador aux;
			String alias; 
			
			for( i = 0 ; i < listaJugadores.size(); i++) {
				aux = listaJugadores.get(i); 
				alias = aux.getAlias(); 
				
				System.out.println("Alias usuario" + "[" + i + "]" + " :" + alias);
				
			}			
		}
		
		
		
		/**
		 * Solicitamos los datos con una función
		 * @param cadena
		 * @return dato para asignar a variable
		 */

		private static String LeeDato(String cadena)
		{
			System.out.println(cadena);
			 
			return scan.nextLine();
		}
			
		
		
			
			
			
			
			
			
	
	
	/* Getters y setters*/
	
	public String getAlias() {
		return alias;
	}
	
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	
	
	
	}