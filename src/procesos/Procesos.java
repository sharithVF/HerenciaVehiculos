package procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import nombre_vehiculo.Avion;
import nombre_vehiculo.Barco;
import nombre_vehiculo.Helicoptero;
import nombre_vehiculo.Velero;

public class Procesos {
	
	ArrayList<Barco> arrayBarco = new ArrayList();
	ArrayList<Velero> arrayVelero = new ArrayList();
	ArrayList<Avion> arrayAvion = new ArrayList();
	ArrayList<Helicoptero> arrayHelicoptero = new ArrayList();
	
	public Procesos() {
		
		String pregunta = "";
		
		String menu = "Crea tu vehiculo\n\n";
		menu += "1. Barco\n";
		menu += "2. Velero\n";
		menu += "3. Avión\n";
		menu += "4. Helicoptero\n";
		menu += "5. Imprimir lista\n";
		menu += "Salir\n\n";
		menu += "Ingrese la opción para crear el vehiculo que desee";
		
		do {
		
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			imprimirMenu(opcion);
		
			pregunta = JOptionPane.showInputDialog("¿Desea continuar?");
		
		} while (pregunta.equalsIgnoreCase("si"));
		
	}
	
	private void imprimirMenu(int opcion) {
		
			switch (opcion) {
			case 1: 
				crearBarco();
				break;
			case 2: 
				crearVelero();
				break;
			case 3: 
				crearAvion();
				break;
			case 4: 
				crearHelicoptero();
				break;
			case 5: 
				ImprimirLista();
				break;
			case 6: 
				break;
			default:
				System.out.println("El número no es valido");
			}				
	}

	public void crearBarco() {
		Barco miBarco = new Barco(); 
		miBarco.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo del vehiculo"));
		miBarco.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre del acuatico"));
		miBarco.setColor(JOptionPane.showInputDialog("Ingrese el color del acuatico"));
		arrayBarco.add(miBarco);
		System.out.println(miBarco);
		
	}
	
	public void crearVelero() {
		Velero miVelero = new Velero(); 
		miVelero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo del vehiculo"));
		miVelero.setNombreAcuatico(JOptionPane.showInputDialog("Ingrese el nombre del acuatico"));
		miVelero.setColor(JOptionPane.showInputDialog("Ingrese el color del acuatico"));
		arrayVelero.add(miVelero);
		System.out.println(miVelero);
	}

	public void crearAvion() {
		Avion miAvion = new Avion(); 
		miAvion.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo del vehiculo"));
		miAvion.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre del aereo"));
		miAvion.setColor(JOptionPane.showInputDialog("Ingrese el color del aereo"));
		arrayAvion.add(miAvion);
		System.out.println(miAvion);
	}
	
	public void crearHelicoptero() {
		Helicoptero miHelicoptero = new Helicoptero(); 
		miHelicoptero.setNombreVehiculo(JOptionPane.showInputDialog("Ingrese el tipo del vehiculo"));
		miHelicoptero.setNombreAereo(JOptionPane.showInputDialog("Ingrese el nombre del aereo"));
		miHelicoptero.setColor(JOptionPane.showInputDialog("Ingrese el color del aereo"));
		arrayHelicoptero.add(miHelicoptero);
		System.out.println(miHelicoptero);
	}
	
	private void ImprimirLista() {
		System.out.println(arrayBarco);
		System.out.println(arrayVelero);
		System.out.println(arrayAvion);
		System.out.println(arrayHelicoptero);
		
	}
	
}
