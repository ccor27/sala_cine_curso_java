package es.curso.java.sala.cine;

public class Cine {

	private String nombre;
	private SalaDeCine []salas;
	
	public Cine (String nombre) {
		
	this.nombre=nombre;
	this.salas = new SalaDeCine[3];
	iniciarCines();
	//this.salas=new SalaDeCine[numeroSalas];//new arreglo de un array es un objeto SalaDeCine.
		
		}

	
	private void iniciarCines() {
		Pelicula p4 = new Pelicula("El Caballero de la Noche (The Dark Knight)", 152, 13, 6, 4);
		Pelicula p3 = new Pelicula("Toy Story", 81, 0, 5, 3);
		Pelicula p6 = new Pelicula("Avengers: Endgame", 181, 13, 8.50, 6);
		
		
		SalaDeCine c1 = new SalaDeCine("Sala 01",20 ,p4);
		this.salas[0]=c1;
		SalaDeCine c2 = new SalaDeCine("Sala 02",10 ,p3);
		this.salas[1]=c2;
		SalaDeCine c3 = new SalaDeCine("Sala 03",14 ,p6);
		this.salas[2]=c3;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para mostrar las salas y sus disponibilidades
	 */
	public void mostrarSalasYDisponibilidad() {
		for (SalaDeCine salaDeCine : salas) {
			if(salaDeCine!=null) {
				salaDeCine.mostrarPeliculaYDisponibilidad();
			}
		}
	}
	
	/**
	 * Metodo para filtrar las salas por numero de asientos disponibles
	 * @param asientos
	 */
	public void filtrarSalasPorNumeroAsientosDisponibles(int asientos) {
		for (SalaDeCine salaDeCine : salas) {
			if(salaDeCine!=null && salaDeCine.numeroButacasVacias()>= asientos) {
				System.out.println(salaDeCine.getPelicula().getTitulo() 
						+" ("+salaDeCine.getNombre()+")"
						+ " - "+salaDeCine.numeroButacasVacias()
						+" asientos disponibles");
			}
		}
	}
	
	public void mostrarOcupacionPorSala() {
		for (SalaDeCine sala : salas) {
			if(sala != null) {
				sala.mostrarButacas();
			}
		}
	}
	
	private SalaDeCine obtenerSalaDeCinePorNombre(String nombreSala) {
		for (SalaDeCine sala : salas) {
			if(sala.getNombre().equals(nombreSala)) {
				return sala;
				}
		}
		return null;
		
	}
	
//	public String asignarButacasEnSala(String nombreSala, Usuario usuario, int numeroButacas) {
//		SalaDeCine sala = obtenerSalaDeCinePorNombre(nombreSala);
//		double precioButacas = sala.getPelicula().getPrecio() * numeroButacas;
//		if(usuario.getDinero() >= precioButacas) {
//			sala.asignarButacas(usuario, numeroButacas);
//		}else {
//			//no tiene suficiente dinero
//		}
//		
//		
//	}
	
}
