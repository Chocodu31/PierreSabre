package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;

	public Yakuza(int argent, String boisson, String nom, String clan) {
		super(argent, boisson, nom);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� les " + gain + " sous de " + 
				victime.getNom() + ", ce qui me fait " + getArgent() + 
				" sous dans ma poche. Hi ! Hi !");
	}

	public int getReputation() {
		return reputation;
	}

	public int perdre() {
		int argent = getArgent();
		perdreArgent(argent);

		reputation--;

		parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai d�shonor� le clan de " + clan);

		return argent;
	}
	
	public void gagner(int gain) {
		reputation++;
		
		gagnerArgent(gain);
		
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de "  + clan + " ? Je l'ai d�pouill� de ses " + gain + " sous.");
	}

	@Override 
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
	
}

