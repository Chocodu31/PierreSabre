package personnages;

public class Ronin extends Humain {
	int honneur = 1;
	
	public Ronin(int argent, String boisson, String nom) {
		super(argent, boisson, nom);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent = getArgent();
		int don = (10*argent)/100;
		perdreArgent(don);
		beneficiaire.recevoir(don);
		parler(beneficiaire.getNom() + " prend ces " + don + ".");
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		int argent = getArgent();
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force>=adversaire.getReputation()) {
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur+=1;
			parler("Je t'ai eu petit yakuza !");
		} else {
			adversaire.gagner(argent);
			perdreArgent(argent);
		}
	}
	
}
