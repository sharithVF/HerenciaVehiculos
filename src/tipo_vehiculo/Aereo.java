package tipo_vehiculo;

import vehiculo.Vehiculo;

public class Aereo extends Vehiculo{
	
	private String nombreAereo = "";

	public String getNombreAereo() {
		return nombreAereo;
	}

	public void setNombreAereo(String nombreAereo) {
		this.nombreAereo = nombreAereo;
	}
	
	public void volar() {
		System.out.println("El " + nombreAereo + "está volando");
	}
	
}
