package produit;

public class Poisson extends Produit {

	private String dateDePeche;

	public Poisson(String dateDePeche) {
		super("poisson", Unite.PIECE);
		this.dateDePeche = dateDePeche;
	}

	@Override
	public String decrireProduit() {
		return getNom() + " peché " + dateDePeche + ".";
	}

}
