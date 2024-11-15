package controleur;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlAfficherVillageTest {

	ControlAfficherVillage caff;
	ControlEmmenager cm;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("leVillage", 19, 20);
		Chef chef = new Chef("chef", 4, village);
		village.setChef(chef);
		cm = new ControlEmmenager(village);
		cm.ajouterGaulois("Bonemine", 3);
		cm.ajouterDruide("Panoramix", 4, 5, 6);
		caff = new ControlAfficherVillage(village);
	}

	@Test
	void testDonnerNomsVillageois() {
		String[] nv = { "chef", "Bonemine", "le druide Panoramix" };
		assertArrayEquals(caff.donnerNomsVillageois(), nv);
	}

	@Test
	void testDonnerNomVillage() {
		String nom = caff.donnerNomVillage();
		assertEquals("leVillage", nom);
	}

	@Test
	void testDonnerNbEtals() {
		int nb = caff.donnerNbEtals();
		assertEquals(20, nb);
	}

}
