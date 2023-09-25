package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;

public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
	super(nombre,edad,habitat,genero);
	this.pelaje=pelaje;
	this.patas=patas;
}
public Mamifero() {
	
}

public static int cantidadMamifero() {
	return listado.size();
}
}
