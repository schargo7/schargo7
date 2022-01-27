package dreamteam;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	private Jugador buscarJugador(int numero) {
		int i = 0;
		Jugador jugadorBuscado = null;
		while (i < jugadores.size() && jugadorBuscado == null) {
			if (jugadores.get(i).getNumero() == numero) {
				jugadorBuscado = jugadores.get(i);
			} else {
				i++;
			}
		}

		return jugadorBuscado;
	}
	
	
	
	public Jugador recorrerJugadores(Posicion posicion) {
		int valoracionMax = 0;
		Jugador mejorJugador = null;
		for (Jugador jugador : jugadores) {
			if (jugador.getPosicion().equals(posicion)) {
				if (jugador.getValoracion() > valoracionMax) {
					valoracionMax = jugador.getValoracion();
					mejorJugador = jugador;
				}
			}
		}
		
		return mejorJugador;
	}
	
	public String nombreApellido(Jugador jugador) {
		return jugador.nombreApellido();
	}
	
	public int verPuntuacion(Jugador jugador) {
		return jugador.getValoracion();
	}

	public int valoracionTotal() {
		int valoracionTotalEquipo = 0;
		if (jugadores.size() > 0) {
			for (Jugador jugador : jugadores) {
				valoracionTotalEquipo += jugador.getValoracion();
			}

		}

		return valoracionTotalEquipo;
	}
	
	public int cantJugadores() {
		return this.jugadores.size();
	}

	public boolean agregarJugador(int numero, String apellido, String nombre, Posicion posicion, int valoracion) {
		boolean agregue = false;
		Jugador jugador = buscarJugador(numero);

		if (jugador == null) {
			this.jugadores.add(new Jugador(numero, apellido, nombre, posicion, valoracion));
			agregue = true;
		}
		return agregue;
	}

	@Override
	public String toString() {
		return "Equipo: " + nombre + "\nJugadores=" + jugadores + "]";
	}
	
	
}
