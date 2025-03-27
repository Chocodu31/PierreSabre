package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain prof = new Humain(54,"kombucha","Prof");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
	}
}
