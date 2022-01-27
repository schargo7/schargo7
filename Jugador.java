package dreamteam;

public class Jugador {
	private int numero;
	private String apellido;
	private String nombre;
	private Posicion posicion;
	private int valoracion;

	public Jugador(int numero, String apellido, String nombre, Posicion posicion, int valoracion) {
		this.numero = numero;
		this.apellido = apellido;
		this.nombre = nombre;
		this.posicion = posicion;
		setValoracion(valoracion);
	}

	private void setValoracion(int valoracion) {
		if (valoracion < 50) {
			this.valoracion = 50;
		} else if (valoracion > 100) {
			this.valoracion = 100;
		} else {
			this.valoracion = valoracion;
		}
	}

	public int getValoracion() {
		return this.valoracion;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public Posicion getPosicion() {
		return this.posicion;
	}
	
	public String nombreApellido() {
		return this.nombre + " " + this.apellido;
	}

	@Override
	public String toString() {
		return "\nJugador Numero: " + numero + "\nApellido: " + apellido + "\nNombre: " + nombre + "\nPosicion: " + posicion
				+ "\nValoracion: " + valoracion;
	}
	
	

}
