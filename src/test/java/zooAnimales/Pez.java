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
	listado.add(this);
}
public Pez () {
	listado.add(this);
}

public static int cantidadPez() {
	return listado.size();
}

@Override
public String movimiento() {
	return "nadar";
}

public static Pez crearSalmon(String nombre, int edad,String genero) {
	salmones+=1;	
	Pez salmon=new Pez(nombre, edad, "oceano",genero, "rojo", 6);
	return salmon;
}
public static Pez crearBacalo(String nombre, int edad,String genero) {
	bacalaos+=1;
	Pez bacalao= new Pez (nombre, edad, "oceano", genero, "gris", 6);
	return bacalao;
}

public static ArrayList<Pez> getListado(){
	return listado;
}

public static void setListado(ArrayList<Pez> listado) {
	Pez.listado=listado;
}

public String getColorEscamas() {
	return colorEscamas;
}

public void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}

public int getCantidadAletas() {
	return cantidadAletas;
}

public void setCantidadAletas(int cantidadAletas) {
	this.cantidadAletas=cantidadAletas;
}

}
