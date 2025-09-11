package es.curso.java.sala.cine;

public class Pelicula {

	
	private String titulo;
	private int duracion;
	private int clasificacionPorEdad;
	private double precio;
	private int id;
	
	public Pelicula (String titulo, int duracion, int clasificacionPorEdad, double precio, int id) {
		//publico para que se puedad llamar desde fuera.
		this.titulo=titulo;
		this.duracion=duracion;
		this.clasificacionPorEdad=clasificacionPorEdad;
		this.precio=precio;
		this.id=id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getClasificacionPorEdad() {
		return clasificacionPorEdad;
	}

	public void setClasificacionPorEdad(int clasificacionPorEdad) {
		this.clasificacionPorEdad = clasificacionPorEdad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
