
public class Main {

	public static void main(String[] args) {
		Joueur joueur1 = new Joueur("Alice", 0, 0, false);
		Joueur joueur2 = new Joueur("Bob", 0, 0, false);
		System.out.println("Joueur 1 : Alice.\nJoueur 2 : Bob.\n\nDebut du jeu        : 0 - 0");
		boolean flag = true;

		while(!GrandMatch.fin_du_grand_jeu(joueur1, joueur2)){
			if(GrandMatch.tie_break(joueur1, joueur2)){
				flag = false;
				System.out.println("\n\nEntrer en Tie-Break\n\n");
				GrandMatch.jouer_en_tie_break(joueur1, joueur2);
				break;
			}
			else{
				GrandMatch.jouer_un_match(joueur1, joueur2);
			}
		}
		
		
		// Lorsqu'on entre dans l'étape Tie-Break, on construit deux nouveaux joueurs, on ne revient plus sur les anciens.
		if(flag){
			if(joueur1.getNb_win() > joueur2.getNb_win()){
				System.out.println("Alice win!");
			}
			else{
				System.out.println("Bob win!");
			}
		}
		
	}

}
