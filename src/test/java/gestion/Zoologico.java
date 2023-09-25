package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas=new ArrayList<Zona>();

public Zoologico(String nombre, String ubicacion) {
	this.nombre=nombre;
	this.ubicacion=ubicacion;			
}
public Zoologico() {
	
}
public int cantidadTotalAnimales() {
	int cantidadAnimales= 0;
	for  (int i=0;i<zonas.size();i++) {
	cantidadAnimales+=zonas.get(i).cantidadAnimales();
	}
	return cantidadAnimales;
}

public void agregarZonas(Zona zona) {
	zonas.add(zona);
}

public String getNombre() {
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}

public String getUbicacion() {
	return this.ubicacion;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion=ubicacion;
}

public ArrayList<Zona> getZona(){
return Zoologico.zonas;
}

public void setZonas(Zona zonas) {
	Zoologico.zonas.add(zonas);
}

}
