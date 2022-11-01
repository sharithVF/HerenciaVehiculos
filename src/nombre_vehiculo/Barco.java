package nombre_vehiculo;

import tipo_vehiculo.Acuatico;

public class Barco extends Acuatico {
	
	private String color = "";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void prenderMotor() {
		System.out.println("El barco prendió su motor");
	}

	@Override
	public String toString() {
		return "Barco [getColor()=" + getColor() + ", getNombreAcuatico()=" + getNombreAcuatico()
				+ ", getNombreVehiculo()=" + getNombreVehiculo() + "]";
	}
	
}
