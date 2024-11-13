package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {

	private int poids;
	private Gaulois chasseur;

	public Sanglier(int poids, Gaulois chasseur) {
		super("Sanglier", Unite.KILOGRAMME);
		this.chasseur = chasseur;
		this.poids = poids;
	}

	@Override
	public String decrireProduit() {
		return getNom() + " de " + poids + " " + Unite.KILOGRAMME + " par " + chasseur + ".";
	}

}
