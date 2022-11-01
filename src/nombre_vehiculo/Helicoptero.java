package nombre_vehiculo;

import tipo_vehiculo.Aereo;

public class Helicoptero extends Aereo {
	
	private String color = "";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void encenderHelices() {
		System.out.println("El helicoptero encendió sus helices");
	}

	@Override
	public String toString() {
		return "Helicoptero [getColor()=" + getColor() + ", getNombreAereo()=" + getNombreAereo()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	
}
