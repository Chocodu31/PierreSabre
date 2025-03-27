package personnages;

public class Commercant extends Humain {
	
	public Commercant(int argent, String nom) {
		super(argent, "thé" , nom);
	}

	public int seFaireExtorquer() {
		int argent = getArgent();
		if (argent<=0) {
			return 0;
		} else {
			parler("J'ai tout perdu! Le monde est trop injuste...");
			perdreArgent(argent);
			return argent;
		}
	}
	
	public void recevoir(int gain) {
		int argent = getArgent();
		gagnerArgent(gain);
		parler(argent + " sous ! Je te remerci généreux donateur!");
	}	
}
