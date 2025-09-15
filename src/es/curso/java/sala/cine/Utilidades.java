package es.curso.java.sala.cine;

import java.util.Scanner;

public class Utilidades {

	private static void pintaMenu(String[] options) {
		pintaMenu(options, "Introduce una opcion:");
	}
	
	private static void pintaMenu(String[] options, String message) {
		System.out.println("   =========== Menu ===========");
		for (int i = 1; i <= options.length; i++) {
			System.out.println(i+". "+options[i-1]);
		}
		System.out.println("   ============================");
		System.out.println(message);
	}
	
	private static int pideDatoNumerico(String texto) {
		if(!texto.isEmpty() && !texto.isBlank()) {
			System.out.print(texto);
		}
		Scanner scan = new Scanner(System.in);
		int dato = scan.nextInt();
		return dato;
	}
	
	private static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String dato = scan.nextLine();
		return dato;
	}
	
	private static Usuario[] iniciarUsuarios() {
		Usuario cliente1 = new Usuario ("Paco", "74221784L", 25, 12.00);
		Usuario cliente2 = new Usuario ("Juan", "74212994N", 22, 100.00);
		Usuario cliente3 = new Usuario ("Andres", "98767784Q", 35, 35.00);
		Usuario[] usuarios = {cliente1,cliente2,cliente3};
		return usuarios;
	}
	private static SalaDeCine[] iniciarCines() {
		Pelicula p4 = new Pelicula("El Caballero de la Noche (The Dark Knight)", 152, 13, 6, 4);
		Pelicula p3 = new Pelicula("Toy Story", 81, 0, 5, 3);
		Pelicula p6 = new Pelicula("Avengers: Endgame", 181, 13, 8.50, 6);
		
		
		SalaDeCine c1 = new SalaDeCine("Sala 01",20 ,p4);
		SalaDeCine c2 = new SalaDeCine("Sala 02",10 ,p3);
		SalaDeCine c3 = new SalaDeCine("Sala 03",14 ,p6);
		SalaDeCine[] cines = {c1,c2,c3};
		return cines;
	}
	
	public static void buildMenu() {
		String[] menu = { "Listar peliculas y disponibilidad", "comprar entradas", "mostrar ocupacion por sala","salir"};
		boolean menuFlag = true;
		SalaDeCine[] cines = iniciarCines();
		Usuario[] usuarios = iniciarUsuarios();
		while (menuFlag) {
			pintaMenu(menu);
			int option = pideDatoNumerico("");
			switch (option) {
			case 1: {
				opcion1(cines);
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				System.out.println("Adios!");
				menuFlag = false;
				break;
			}
			default:
				System.out.println("Opcion no valida!");
			}
		}
	}
	
	private static void opcion1(SalaDeCine[] cines) {
		for (SalaDeCine salaDeCine : cines) {
			if(salaDeCine!=null) {
				salaDeCine.mostrarPeliculaYDisponibilidad();
			}
		}
	}
}
