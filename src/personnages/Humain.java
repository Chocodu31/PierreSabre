package personnages;

public class Humain {
	private int argent;
	private String boisson;
	private String nom;
	private String[] bien = {};
	
	public Humain(int argent, String boisson, String nom) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}

	private void parler(String texte) {
		System.out.println("("+ nom + ") - " + texte);
	}
	
	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + 
				" et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + 
					bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + 
					bien + " à " + prix + " sous.");
		}
		
	}
	
	
	
}
