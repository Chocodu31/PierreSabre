package personnages;

public class Samourai extends Ronin{
	private String seigneur;
	public Samourai(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}

	@Override 
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}
}
