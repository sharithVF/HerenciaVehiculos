package nombre_vehiculo;

import tipo_vehiculo.Acuatico;

public class Velero extends Acuatico {
	
	private String color = "";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void izarVelas() {
		System.out.println("El velero izó sus velas");
	}

	@Override
	public String toString() {
		return "Velero [getColor()=" + getColor() + ", getNombreAcuatico()=" + getNombreAcuatico()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	
}
