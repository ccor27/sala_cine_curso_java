package es.curso.java.sala.cine;

public class Cine {

	private String nombre;
	private SalaDeCine[] salas;
	private Usuario[] usuarios;

	public Cine(String nombre) {

		this.nombre = nombre;
		this.salas = new SalaDeCine[3];
		this.usuarios = new Usuario[3];
		iniciarCines();
		iniciarUsuarios();

	}

	private void iniciarUsuarios() {
	Usuario usuario1 = new Usuario("Manu", "67123271Q", 24, 150);
	this.usuarios[0] = usuario1;
	Usuario usuario2 = new Usuario("Juan", "12322371Z", 34, 200);
	this.usuarios[1] = usuario2;
	Usuario usuario3 = new Usuario("Daniel", "9098751Q", 19, 60);
	this.usuarios[2] = usuario3;
	}
	
	private void iniciarCines() {
		Pelicula p4 = new Pelicula("El Caballero de la Noche (The Dark Knight)", 152, 13, 6, 4);
		Pelicula p3 = new Pelicula("Toy Story", 81, 0, 5, 3);
		Pelicula p6 = new Pelicula("Avengers: Endgame", 181, 13, 8.50, 6);

		SalaDeCine c1 = new SalaDeCine("Sala 01", 20, p4);
		this.salas[0] = c1;
		SalaDeCine c2 = new SalaDeCine("Sala 02", 10, p3);
		this.salas[1] = c2;
		SalaDeCine c3 = new SalaDeCine("Sala 03", 14, p6);
		this.salas[2] = c3;
	}

	/**
	 * Metodo para mostrar las salas y sus disponibilidades
	 */
	public void mostrarSalasYDisponibilidad() {
		for (SalaDeCine salaDeCine : salas) {
			if (salaDeCine != null) {
				salaDeCine.mostrarPeliculaYDisponibilidad();
			}
		}
	}

	/**
	 * Metodo para filtrar las salas por numero de asientos disponibles
	 * 
	 * @param asientos
	 */
	public void filtrarSalasPorNumeroAsientosDisponibles(int asientos) {
		for (SalaDeCine salaDeCine : salas) {
			if (salaDeCine != null && salaDeCine.numeroButacasVacias() >= asientos) {
				System.out.println(salaDeCine.getPelicula().getTitulo() + " (" + salaDeCine.getNombre() + ")" + " - "
						+ salaDeCine.numeroButacasVacias() + " asientos disponibles");
			}
		}
		System.out.println();
	}

	public void mostrarOcupacionPorSala() {
		for (SalaDeCine sala : salas) {
			if (sala != null) {
				sala.mostrarButacas();
			}
		}
	}

	public boolean ExisteSala(String nombreSala) {
		for (SalaDeCine sala : salas) {
			if (sala.getNombre().equals(nombreSala)) {
				return true;
			}
		}
		return false;
	}
	
	private SalaDeCine obtenerSalaDeCinePorNombre(String nombreSala) {
		for (SalaDeCine sala : salas) {
			if (sala.getNombre().equals(nombreSala)) {
				return sala;
			}
		}
		return null;
		
	}

	public String asignarButacasEnSala(String nombreSala, Usuario usuario, int numeroButacas) {
		SalaDeCine sala = obtenerSalaDeCinePorNombre(nombreSala);
		String butacasAsignadas ="";

		if (sala == null || numeroButacas <= 0) {
			return "Error: Sala no válida o número de butacas incorrecto.";
		}

		double precioButacas = sala.getPelicula().getPrecio() * numeroButacas;
		
		if (usuario.getDinero() >= precioButacas) {
			butacasAsignadas = sala.asignarButacas(usuario, numeroButacas);
			if (butacasAsignadas == null) {
				return  "ERROR: Hubo un error en la asignacion de butacas\n no se le ha cobrado.";
			} else {
				usuario.comprar(precioButacas);
				return "\n¡Compra exitosa!\n"
                        + "==================================\n"
                        + "Usuario: " + usuario.getNombre() + "\n"
                        + "Pelicula: " + sala.getPelicula().getTitulo() + "\n"
                        + "Sala: " + sala.getNombre() + "\n"
                        + "Butacas compradas: " + butacasAsignadas + "\n"
                        + "Total pagado: " + precioButacas + "€\n"
                        + "Saldo restante: " + usuario.getDinero() + "€\n"
                        + "==================================\n";
			}
		} else {
			return  "ERROR: No dispone del dinero necesario para comprar las butacas";
		}

	}

	public String getNombre() {
		return nombre;
	}

	public SalaDeCine[] getSalas() {
		return salas;
	}

	public Usuario[] getUsuarios() {
		return usuarios;
	}
	
	

}
