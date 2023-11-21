package Ejemplos.Composicion;

public abstract class VehiculoConMotor extends Vehiculo{
	Boolean motor;
	
	public void avanzar() {
		System.out.println("Avanzando");
	}
	public void frenar() {
		System.out.println("Frenando");	
	}
	public void encenderMotor() {
		if(motor==false) {
		System.out.println("Encendiendo motor \n Motor encendido");
		}else {
			System.out.println("El motor ya esta encendido");
		}
	}
	public void apagarMotor() {
		if(motor==true) {
		System.out.println("Apagando motor \n Motor apagado");
		}else {
			System.out.println("El motor ya esta apagado");
		}
	}
}
