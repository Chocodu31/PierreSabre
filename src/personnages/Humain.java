package personnages;

public class Humain {
	private int argent;
	private String boisson;
	private String nom;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];

	public Humain(int argent, String boisson, String nom) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix
					+ " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un(e) " + bien + " à "
					+ prix + " sous.");
		}

	}

	private void memoriser(Humain humain) {

		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			for (int i = 0; i < nbConnaissance - 1; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[nbConnaissance-1] = humain;
		}

	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {

		StringBuilder texte = new StringBuilder("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance-1; i++) {
			texte.append(memoire[i].getNom() + ", ");
		}
		texte.append(memoire[nbConnaissance-1].getNom());
		this.parler(texte.toString());
	}

}
