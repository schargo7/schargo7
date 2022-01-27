package dreamteam;

public class Test {

	public static void main(String[] args) {
		Liga nba = new Liga("NBA");

		System.out.println(nba.agregarEquipo("Lakers"));
		System.out.println(nba.agregarEquipo("Miami Heat"));
		System.out.println(nba.agregarEquipo("Miami Heat"));

		nba.agregarJugador("Lakers", 23, "James", "LeBron", Posicion.ALERO, 99);
		nba.agregarJugador("Lakers", 23, "James", "LeBron", Posicion.ALERO, 99);
		nba.agregarJugador("Lakers", 1, "Caldwell Pope", "Kentavious", Posicion.ESCOLTA, 86);
		nba.agregarJugador("Lakers", 9, "Rondo", "Rajon", Posicion.BASE, 90);
		nba.agregarJugador("Lakers", 4, "Caruso", "Alex", Posicion.ESCOLTA, 82);
		nba.agregarJugador("Lakers", 3, "Davis", "Anthony", Posicion.ALA_PIVOT, 95);
		nba.agregarJugador("Lakers", 39, "Howard", "Dwight", Posicion.PIVOT, 84);

		System.out.println("   ");
		// nba.mostrarJugadores("Lakers");

		System.out.println("    ");
		nba.mostrarJugadores("Celtics");

		System.out.println(nba.competir("Lakers", "Miami Heat"));

		nba.agregarJugador("Miami Heat", 7, "Dragic", "Goran", Posicion.BASE, 87);
		nba.agregarJugador("Miami Heat", 14, "Herro", "Tyler", Posicion.ESCOLTA, 84);
		nba.agregarJugador("Miami Heat", 28, "Iguodala", "Andre", Posicion.ESCOLTA, 88);
		nba.agregarJugador("Miami Heat", 99, "Crowder", "Jae", Posicion.ALERO, 83);
		nba.agregarJugador("Miami Heat", 22, "Butler", "Jimmy", Posicion.ALA_PIVOT, 97);
		nba.agregarJugador("Miami Heat", 13, "Adebayo", "Bam", Posicion.PIVOT, 91);

		System.out.println("   ");
		
		System.out.println("Partido entre Lakers y Miami Heat");
		System.out.println("Resultado: " + nba.competir("Lakers", "Miami Heat"));
		System.out.println("Resultado: " + nba.competir("Miami Heat", "Lakers"));
		System.out.println("Resultado: " + nba.competir("Lakers", "Lakers"));
		
		System.out.println("  ");
		
		
		System.out.println("Equipo All Star de la NBA");
		System.out.println(" ");
		nba.mostrarAllStar();



	}

}
