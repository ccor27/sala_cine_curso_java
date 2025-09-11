package es.curso.java.sala.cine;

public class Cine {

	private String nombre;
	private SalaDeCine []salas;
	
	public Cine (String nombre, int numeroSalas) {
		
	this.nombre=nombre;
	this.salas=new SalaDeCine[numeroSalas];//new arreglo de un array es un objeto SalaDeCine.
		
		
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SalaDeCine[] getSalas() {
		return salas;
	}

	public void setSalas(SalaDeCine[] salas) {
		this.salas = salas;
	}
	
}
