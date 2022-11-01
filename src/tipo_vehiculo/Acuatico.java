package tipo_vehiculo;

import vehiculo.Vehiculo;

public class Acuatico extends Vehiculo{

	private String nombreAcuatico = "";

	public String getNombreAcuatico() {
		return nombreAcuatico;
	}

	public void setNombreAcuatico(String nombreAcuatico) {
		this.nombreAcuatico = nombreAcuatico;
	}
	
	public void navegar() {
		System.out.println("El " + nombreAcuatico + "esta navegando");
	}

}
