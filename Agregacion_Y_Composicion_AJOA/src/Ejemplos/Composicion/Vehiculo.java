package Ejemplos.Composicion;

public abstract class Vehiculo {
	String marca;
	String numDeRuedas;
	
	public abstract void avanzar();
	public abstract void frenar();
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setNumDeRuedas(String ruedas) {
		this.numDeRuedas = ruedas;
	}
	public String getMarca() {
		return marca;
	}
	public String getNumDeRuedas() {
		return numDeRuedas;
	}
}
