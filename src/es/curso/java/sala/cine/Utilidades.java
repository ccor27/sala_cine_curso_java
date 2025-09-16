package es.curso.java.sala.cine;

import java.util.Scanner;

public class Utilidades {

	private static void pintaMenu(String[] options) {
		pintaMenu(options, "Introduce una opcion:");
	}

	private static void pintaMenu(String[] options, String message) {
		System.out.println("   =========== Menu ===========");
		for (int i = 1; i <= options.length; i++) {
			System.out.println(i + ". " + options[i - 1]);
		}
		System.out.println("   ============================");
		System.out.println(message);
	}

	private static int pideDatoNumerico(String texto) {
		if (!texto.isEmpty() && !texto.isBlank()) {
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

	public static void buildMenu() {
		String[] menu = { "Listar peliculas y disponibilidad", "comprar entradas", "mostrar ocupacion por sala",
				"salir" };
		boolean menuFlag = true;
		Cine cine = new Cine("Cine Many y Cris");
		while (menuFlag) {
			pintaMenu(menu);
			int option = pideDatoNumerico("");
			switch (option) {
			case 1: {
				opcion1(cine);
				break;
			}
			case 2: {
				opcion2(cine);
				break;
			}
			case 3: {
				opcion3(cine);
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

	private static void opcion1(Cine cine) {
		cine.mostrarSalasYDisponibilidad();
	}

	private static void opcion2(Cine cine) {
		// por el momento solo se hace con un usuario
		Usuario u1 = cine.getUsuarios()[0];
		int numeroButacasAComprar = 0;
		String salaSeleccionada = "";

		do {
			numeroButacasAComprar = pideDatoNumerico("Ingresa la cantidad de butacas para " + u1.getNombre() + "\n");
			if (numeroButacasAComprar <= 0) {
				System.out.println("Debe ingresar un numero mayor a cero.");
			}
		} while (numeroButacasAComprar <= 0);

		if (!cine.filtrarSalasPorNumeroAsientosDisponibles(numeroButacasAComprar)) {
			System.out.println("No hay salas que tenga ese numero de butacas, perdone las molestias.");

		} else {

			do {
				salaSeleccionada = pideDatoCadena("Por favor seleccione la sala de cine");
				if (salaSeleccionada.isEmpty() || salaSeleccionada.isBlank() || !cine.ExisteSala(salaSeleccionada)) {
					System.out.println("Sala no existente, por favor ingrese el nombre correcto.");
				}
			} while (salaSeleccionada.isEmpty() || salaSeleccionada.isBlank() || !cine.ExisteSala(salaSeleccionada));

			System.out.println(cine.asignarButacasEnSala(salaSeleccionada, u1, numeroButacasAComprar));
		}

	}

	private static void opcion3(Cine cine) {
		cine.mostrarOcupacionPorSala();
	}
}
