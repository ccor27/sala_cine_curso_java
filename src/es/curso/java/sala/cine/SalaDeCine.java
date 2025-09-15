package es.curso.java.sala.cine;


public class SalaDeCine {
	
	private String nombre;//clase
	private int capacidad;
	private int ocupadas;
	private Pelicula pelicula; //Pelicula esta en Pelicula para no hacerlo otra vez. Es una clase que represneta a un objeto.
	private Usuario [] [] butacas; //Usuario porque son personas (butacas).[][] array bidimensional(butacas:filas columnas).
	
	private int valor; //creo la variable para usarla dentro del constructor. Para almacenar el valor de filas y columnas.
	
	public SalaDeCine (String nombre, int capacidad, Pelicula pelicula) {//parametro
	
	this.nombre=nombre;//azul claro es la clase. lila es parametro.(queremos que guarde el parametro en la variable local.
	this.capacidad=capacidad;
	this.pelicula=pelicula;
	this.valor=capacidad/2; //Obtenemos el valor de filas y columnas.
	this.butacas=new Usuario [valor][valor];
	this.ocupadas=0;
		
	}//No generar el valor. Porque solamente lo usamos para inicializar el arreglo de butacas.
	

	public boolean asignarButaca(Usuario usuario) {
		 for (int i = 0; i < butacas.length; i++) {
				for (int j = 0; j < butacas[i].length; j++) {
					 if(butacas[i][j] == null) {
						butacas[i][j] = usuario;
						return true;
					 }
				}
			}
		 return false;
	}
	
	/**
	 * Metodo para saber si hay butacas libres
	 * @return boolean
	 */
	public boolean hayButacasLibres() {
		 for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				 if(butacas[i][j] == null) {
					 return true;
				 }
			}
		}
		 return false;
	}
	
	public void mostrarPeliculaYDisponibilidad() {
		System.out.println( "============== Datos de " + this.nombre+ " =============="
				            +"\nPelicula a proyectar: "+this.pelicula.getTitulo()
							+ "\nNumero de asientos libres: "+numeroButacasVacias() 
							+ "\nNumero de asientos ocupados: "+this.ocupadas
							+"\n================================================");
	}
	
	/**
	 * Metodo para saber el numero de butacas vacias
	 * @return int
	 */
	public int numeroButacasVacias() {
		return this.capacidad - this.ocupadas;
	}
	
	/**
	 * Metodo para saber las butacas vacias que tenemos en la sala
	 * @return
	 */
	public String butacasVacias() {
		String butacasVacias = "";
		 for (int i = 0; i < butacas.length; i++) {
				for (int j = 0; j < butacas[i].length; j++) {
					 if(butacas[i][j] == null) {
						 
						 butacasVacias += "["+(i+1)+"]["+(j+1)+"] - ";
					 }
				}
				butacasVacias += "\n";
			}
		 return butacasVacias;
	}
	
	public void mostrarButacas() {
		System.out.println("========================================== Butacas "+this.nombre+" ==============================================");
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				 if(butacas[i][j] == null) {
				   System.out.print("["+(i+1)+"-"+(j+1)+ " Vacia"+" ]  ");
				 }else {
					 System.out.print("["+(i+1)+"-"+(j+1)+ " "+butacas[i][j].getNombre()+" ]  ");
				 }
			}
			System.out.println();
		}
		System.out.println("====================================================================================================");
	}
	
	public void mostrarSala() {
		System.out.println();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
