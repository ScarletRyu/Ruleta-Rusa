package EjercicioRuletaRusa;

public class Jugador{
private int id;
private String nombre;
private boolean vivo;

/*
 * GETTERS Y SETTERS
 */

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean isVivo() {
	return vivo;
}

public void setVivo(boolean vivo) {
	this.vivo = vivo;
}


/*
 * CONSTRUCTOR
 */

public Jugador(int id) {
	this.id = id;
	this.nombre = "Jugardo" + id;
	this.vivo  = true;
}
	
/*
 * METODOS
 */

//Disparo del revolver
public void disparar(Revolver r) {
	System.out.println("El " + nombre+ "se apunta con la pistola");
	
	if(r.disparar()) {
		this.vivo = false;										//si el jugador se muere
		System.out.println("El " + nombre + " se ha muerto");	//si el jugador se muere
	}else {
		System.out.println("el " + nombre + " ha muerto");		//si el jugador no se muere
	}
	
}

public boolean estaVivo() {
	return vivo;
}


}
