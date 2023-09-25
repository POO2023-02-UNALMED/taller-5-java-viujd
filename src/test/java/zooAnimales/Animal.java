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

public int totalAnimales() {
	return totalAnimales;
}

public String totalPorTipo() {
	return "Mamifero:" + Mamifero.cantidadMamifero() + "\nAves:" + Ave.cantidadAve() + "\nReptiles:" + Reptil.cantidadReptil() + "\nPeces" + Pez.cantidadPez() + "\nAnfibios" + Anfibio.cantidadAnfibio();
}

public String toString() {
	if (zona!=null) {
		return "mi nombre es" + this.nombre + "tengo una edad de" + this.edad + "habito en" + this.habitat + "y mi genero es" + this.genero + "la zona en la que me ubico es" + this.zona + "en el" +this.zona.getZoo();
	}
	return "mi nombre es" + this.nombre + "tengo una edad de" + this.edad + "habito en" + this.habitat + "y mi genero es" + this.genero;
}
}
