package es.curso.java.sala.cine;

public class SalaDeCine {
	
	private String nombre;//clase
	private int capacidad;
	private Pelicula pelicula; //Pelicula esta en Pelicula para no hacerlo otra vez. Es una clase que represneta a un objeto.
	private Usuario [] [] butacas; //Usuario porque son personas (butacas).[][] array bidimensional(butacas:filas columnas).
	
	private int valor; //creo la variable para usarla dentro del constructor. Para almacenar el valor de filas y columnas.
	
	public SalaDeCine (String nombre, int capacidad, Pelicula pelicula) {//parametro
	
	this.nombre=nombre;//azul claro es la clase. lila es parametro.(queremos que guarde el parametro en la variable local.
	this.capacidad=capacidad;
	this.pelicula=pelicula;
	this.valor=capacidad/2; //Obtenemos el valor de filas y columnas.
	this.butacas=new Usuario [valor][valor];
		
	}//No generar el valor. Porque solamente lo usamos para inicializar el arreglo de butacas.

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Usuario[][] getButacas() {
		return butacas;
	}

	public void setButacas(Usuario[][] butacas) {
		this.butacas = butacas;
	}
	
	
	
}
