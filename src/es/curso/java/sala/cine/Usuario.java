package es.curso.java.sala.cine;

public class Usuario {
	
	private String nombre;
	private String dni;
	private int edad;
	private double dinero;
	
	
	public Usuario (String nombre, String dni, int edad, double dinero) {
		
	this.dinero = dinero;
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
		
	}//crear metodos modificables de acceso.


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getDinero() {
		return dinero;
	}


	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

}
