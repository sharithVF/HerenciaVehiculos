package nombre_vehiculo;

import tipo_vehiculo.Aereo;

public class Avion extends Aereo {
	
	private String color = "";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void bajarTrenDeAprendizaje() {
		System.out.println("El avión bajó tren de aprendizaje");
	}

	@Override
	public String toString() {
		return "Avion [getColor()=" + getColor() + ", getNombreAereo()=" + getNombreAereo() + ", getNombreVehiculo()="
				+ getNombreVehiculo() + "]";
	}
	
}
