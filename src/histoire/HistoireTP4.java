package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain prof = new Humain(54,"kombucha","Prof");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		System.out.println("");
		
		Commercant marco = new Commercant(20, "Marco");
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("");
		
		Yakuza yakulenoir = new Yakuza(30, "whisky", "Yaku Le Noir", "Warsong");
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
		
		System.out.println("");
		
		Ronin roro = new Ronin(60,"shochu","Roro");
		roro.direBonjour();
		roro.donner(marco);
	}
}
