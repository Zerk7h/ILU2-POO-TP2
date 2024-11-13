package controleur;

import personnages.Gaulois;
import villagegaulois.Village;
import villagegaulois.lEtal;

public class ControlTrouverEtalVendeur {
	private Village village;

	public ControlTrouverEtalVendeur(Village village) {
		this.village = village;
	}

	public lEtal trouverEtalVendeur(String nomVendeur) {
		Gaulois gaulois = village.trouverHabitant(nomVendeur);
		lEtal etal = null;
		if(gaulois != null) {
			etal = village.rechercherEtal(gaulois);
		}
		return etal;
	}
}