package personnages;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	private Random random = new Random();

	public Traitre(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom, seigneur);
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant * 2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !" +
					" Donne-moi " + argentRanconner + "sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï"
					+ " risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais persone ! Snif.");
		} else {
			int opif = random.nextInt(nbConnaissance);
			Humain ami = memoire[opif];
			int don = getArgent() * 1/20;
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance." + 
					" Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! " + "Je voudrais vous aider en vous donnant "
					+ don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise>1) {
				niveauTraitrise--;
			}
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " 
				+ niveauTraitrise + ". Chut !");
		
	}
	
}
