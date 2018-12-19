package EjercicioRuletaRusa;
public class Revolver{
/*
 * ATRIBUTOS
 */
private static int posicionTambor; //numero que se genera automaticamente muestra en que posicion esta el tambor del revolver
private static int posicionBala;	//numero que se genera automaticamente

/*
 * CONSTRUCTOR 
 */

public Revolver() {
	posicionTambor = (int)Math.random()*6+1;
	posicionBala = (int)Math.random()*6+1;
}


/*
 * METO2
 */

//metodo que devuelve true si la bala coincide con la posicion actual de la bala
public boolean disparar() {
	
	boolean disparo = true;
	
	if(posicionTambor != posicionBala) {
		 disparo = false;
	}else {
		disparo = true;
	}
	
	siguienteBala();
		
	return disparo;
}

//metodo que cambia la posicion del tambor del revolver
public void siguienteBala() {
	if(posicionTambor == 6) {
		posicionTambor = 1;
	}else {
		posicionTambor++;
	}
}


public String toString() {
	return "Posicion del tambor: " + posicionTambor + "Posicion de la bala: " + posicionBala;
}

}