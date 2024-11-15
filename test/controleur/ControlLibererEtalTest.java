package controleur;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlLibererEtalTest {

	ControlPrendreEtal pe;
	ControlEmmenager cm;
	ControlLibererEtal le;
	ControlVerifierIdentite vi;

	@BeforeEach
	void setUp() throws Exception {
		Village village = new Village("leVillage", 19, 20);
		Chef chef = new Chef("chef", 4, village);
		village.setChef(chef);
		cm = new ControlEmmenager(village);
		cm.ajouterGaulois("Azer", 9);
		pe = new ControlPrendreEtal(vi, village);
		pe.prendreEtal("Azer", "fleur", 3)
		le = new ControlLibererEtal(vi);
		System.out.println(le.isVendeur("Azer"));
	}

	@Test
	void testControlLibererEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testIsVendeur() {
		assertTrue(le.isVendeur("Azer"));
		assertFalse(le.isVendeur("Liana"));
	}


	@Test
	void testLibererEtal() {
		fail("Not yet implemented");
	}

}
