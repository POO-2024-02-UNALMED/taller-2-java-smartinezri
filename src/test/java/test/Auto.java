package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	public int cantidadAsientos(){
		int cantidad = 0;
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public String verificarIntegridad(){
		int rMotor = this.motor.registro;
		int rAuto = this.registro;
		boolean iguales = true;
		String original;
		
		for(int i = 0; i < asientos.length - 1; i++) {
			if(asientos[i].registro != asientos[i+1].registro) {
				iguales = false;
				break;
			}
		}
		
		if(rMotor == rAuto && iguales) {
			original = "Auto original";
		}
		else {
			original = "Las piezas no son originales";
		}
		
		return original;
		
	}
	
}
