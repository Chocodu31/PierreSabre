package personnages;

public class Commercant extends Humain {
	
	public Commercant(int argent, String nom) {
		super(argent, "thé" , nom);
	}

	public int seFaireExtorquer() {
		int argent = getArgent();
		parler("J'ai tout perdu! Le monde est trop injuste...");
		perdreArgent(argent);
		return argent;
	}
	
	public void recevoir(int gain) {
		gagnerArgent(gain);
		parler(gain + " sous ! Je te remerci généreux donateur!");
	}	
}
