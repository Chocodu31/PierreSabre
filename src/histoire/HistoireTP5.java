package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant(20, "Marco");
		Commercant chonin = new Commercant(40, "Chonin");
		Commercant kumi = new Commercant(10, "Kumi");
		Yakuza yaku = new Yakuza(30, "whisky", "Yaku Le Noir", "Warsong");
		Ronin roro = new Ronin(60, "shochu", "Roro");
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		Samourai akimoto = new Samourai(80, "sak�", "Akimoto", "Miyamoto");
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		
		Traitre masako = new Traitre(100, "whisky", "Masako", "Miyamoto");
		
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
	}
}
