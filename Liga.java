package dreamteam;

import java.util.ArrayList;

public class Liga {
	private String nombre;
	private ArrayList<Equipo> equipos;

	public Liga(String nombre) {
		this.nombre = nombre;
		this.equipos = new ArrayList<>();
	}

	private Equipo buscarEquipo(String nombre) {
		int i = 0;
		Equipo equipo = null;
		while (i < equipos.size() && equipo == null) {
			if (equipos.get(i).getNombre().equals(nombre)) {
				equipo = equipos.get(i);
			} else {
				i++;
			}
		}

		return equipo;
	}

	public boolean agregarEquipo(String nombre) {
		Equipo x = buscarEquipo(nombre);
		boolean agregue = false;

		if (x == null) {
			this.equipos.add(new Equipo(nombre));
			agregue = true;
		}

		return agregue;
	}

	public void agregarJugador(String nombreEquipo, int numero, String apellido, String nombre, Posicion posicion,
			int valoracion) {
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			if (equipo.agregarJugador(numero, apellido, nombre, posicion, valoracion) == true) {
				equipo.agregarJugador(numero, apellido, nombre, posicion, valoracion);
				System.out.println("Se pudo agregar al jugador " + numero);
			} else {
				System.out.println("No se pudo agregar");
			}
		}

	}

	public void mostrarJugadores(String nombreEquipo) {
		Equipo equipo = buscarEquipo(nombreEquipo);
		if (equipo != null) {
			System.out.println(equipo);
		} else {
			System.out.println("Equipo inexistente");
		}

	}

	public Ganador competir(String equipo1, String equipo2) {
		Equipo equipoLocal = buscarEquipo(equipo1);
		Equipo equipoVisitante = buscarEquipo(equipo2);
		Ganador ganador = Ganador.PARTIDO_INEXISTENTE;
		if (equipoLocal != null && equipoVisitante != null
				&& !equipoLocal.getNombre().equals(equipoVisitante.getNombre())) {
			if (equipoLocal.cantJugadores() >= 5 && equipoVisitante.cantJugadores() >= 5) {
				if (equipoLocal.valoracionTotal() >= equipoVisitante.valoracionTotal()) {
					ganador = Ganador.LOCAL;
				} else {
					ganador = Ganador.VISITANTE;
				}
			} else {
				System.out.println("Faltan jugadores");
			}

		}

		return ganador;
	}

	public String mejorJugador(Posicion posicion) {
		int mejorJugador = 0;
		Jugador mvp = null;
		if (equipos.size() > 0) {
			for (Equipo equipo : equipos) {
				if (equipo.recorrerJugadores(posicion).getValoracion() > mejorJugador) {
					mejorJugador = equipo.recorrerJugadores(posicion).getValoracion();
					mvp = equipo.recorrerJugadores(posicion);
				}
			}

		} else {
			System.out.println("No hay equipos");
		}
		return mvp.nombreApellido();
	}

	public void mostrarAllStar() {

		System.out.println("Ala Pivot: " + mejorJugador(Posicion.ALA_PIVOT));
		System.out.println("Alero: " + mejorJugador(Posicion.ALERO));
		System.out.println("Base: " + mejorJugador(Posicion.BASE));
		System.out.println("Escolta: " + mejorJugador(Posicion.ESCOLTA));
		System.out.println("Pivot: " + mejorJugador(Posicion.PIVOT));

	}

}
