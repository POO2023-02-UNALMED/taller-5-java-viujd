package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

public Animal( String nombre, int edad, String habitat, String genero) {
	this.nombre=nombre;
	this.edad=edad;
	this. habitat=habitat;
	this.genero=genero;
	totalAnimales+=1;
}
public Animal () {
	totalAnimales+=1;
}

public static String totalPorTipo() {
	return "Mamifero: " + Mamifero.cantidadMamifero() + "\nAves: " + Ave.cantidadAve() + "\nReptiles: " + Reptil.cantidadReptil() + "\nPeces " + Pez.cantidadPez() + "\nAnfibios " + Anfibio.cantidadAnfibio();
}

public String toString() {
	if (zona!=null) {
		return "mi nombre es" + this.nombre + "tengo una edad de" + this.edad + "habito en" + this.habitat + "y mi genero es" + this.genero + "la zona en la que me ubico es" + this.zona + "en el" +this.zona.getZoo();
	}
	return "mi nombre es" + this.nombre + "tengo una edad de" + this.edad + "habito en" + this.habitat + "y mi genero es" + this.genero;
}

public String movimiento() {
	return "desplazarse";
}

public static int getTotalAnimales() {
	return totalAnimales;
}
public static void setTotalAnimales(int totalAnimales) {
	Animal.totalAnimales = totalAnimales;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Zona getZona() {
	return zona;
}
public void setZona(Zona zona) {
	this.zona = zona;
}

}
