package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

public Anfibio (String nombre,int edad,String habitat,String genero, String colorPiel, boolean venenoso) {
	super(nombre,edad,habitat,genero);
	this.colorPiel=colorPiel;
	this.venenoso=venenoso;
	listado.add(this);
}
public Anfibio () {
	listado.add(this);
}

public static int cantidadAnfibio() {
	return listado.size();
}

public String movimiento() {
	return "saltar";
}

public static Anfibio crearRana(String nombre, int edad,String genero) {
	ranas +=1;
	Anfibio rana= new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	return rana;
}

public static Anfibio crearSalamandra(String nombre, int edad,String genero) {
	salamandras +=1;
	Anfibio salamandra= new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	return salamandra;
}

public static ArrayList<Anfibio> getListado(){
	return listado;
}

public static void setListado(ArrayList<Anfibio> listado) {
	Anfibio.listado=listado;
}

public String getColorPiel() {
	return colorPiel;
}

public void setColorPiel(String colorPiel) {
	this.colorPiel=colorPiel;
}
public boolean getVenenoso() {
	return venenoso;
}

public void setVenenoso(boolean venenoso) {
	this.venenoso=venenoso;
}

}
