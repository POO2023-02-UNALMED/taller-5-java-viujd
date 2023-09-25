package zooAnimales;
import java.util.ArrayList;


public class Pez extends Animal {
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
	super(nombre,edad,habitat,genero);
	this.colorEscamas=colorEscamas;
	this.cantidadAletas=cantidadAletas;
}
public Pez () {
	
}

public static int cantidadPez() {
	return listado.size();
}

}
