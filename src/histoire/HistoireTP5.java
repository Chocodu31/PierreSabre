package histoire;

import personnages.Commercant;
import personnages.Ronin;
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
	}
}
