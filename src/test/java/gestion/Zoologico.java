package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<>();

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
}
