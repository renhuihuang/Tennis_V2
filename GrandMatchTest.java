import static org.junit.Assert.*;

import org.junit.Test;

public class GrandMatchTest {

	@Test
	public void testFin_du_grand_jeu() {
		Joueur joueur1 = new Joueur("Alice", 0, 0, false);
		Joueur joueur2 = new Joueur("Bob", 0, 0, false);
		
		if(GrandMatch.fin_du_grand_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 6, false);
		joueur2 = new Joueur("Bob", 0, 4, false);
		if(!GrandMatch.fin_du_grand_jeu(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 6, false);
		joueur2 = new Joueur("Bob", 0, 4, false);
		if(!GrandMatch.fin_du_grand_jeu(joueur2, joueur1)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 6, false);
		joueur2 = new Joueur("Bob", 0, 5, false);
		if(GrandMatch.fin_du_grand_jeu(joueur2, joueur1)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 5, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(GrandMatch.fin_du_grand_jeu(joueur2, joueur1)){
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testFin_du_grand_jeu_v2() {
		Joueur joueur1 = new Joueur("Alice", 0, 0, false);
		Joueur joueur2 = new Joueur("Bob", 0, 0, false);
		
		if(GrandMatch.fin_du_grand_jeu_v2(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 9, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(!GrandMatch.fin_du_grand_jeu_v2(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 9, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(!GrandMatch.fin_du_grand_jeu_v2(joueur2, joueur1)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 7, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(GrandMatch.fin_du_grand_jeu_v2(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 7, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(GrandMatch.fin_du_grand_jeu_v2(joueur2, joueur1)){
			fail("Not yet implemented");
		}

	}

	@Test
	public void testTie_break() {
		Joueur joueur1 = new Joueur("Alice", 0, 0, false);
		Joueur joueur2 = new Joueur("Bob", 0, 0, false);
		
		if(GrandMatch.tie_break(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 9, false);
		joueur2 = new Joueur("Bob", 0, 6, false);
		if(GrandMatch.tie_break(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 5, false);
		joueur2 = new Joueur("Bob", 0, 5, false);
		if(GrandMatch.tie_break(joueur1, joueur2)){
			fail("Not yet implemented");
		}
		
		joueur1 = new Joueur("Alice", 0, 7, false);
		joueur2 = new Joueur("Bob", 0, 7, false);
		if(!GrandMatch.tie_break(joueur1, joueur2)){
			fail("Not yet implemented");
		}
	}

}
