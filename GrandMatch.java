
public class GrandMatch {
	
	// cette fonction joue un match du Sprint 1.
	public static void jouer_un_match(Joueur joueur1, Joueur joueur2){
		int joueur_en_ADV = 0;
		
		while(!Match.fin_du_jeu(joueur1, joueur2)){
			
			// Si on a 40 - 40, on entre dans le DEUCE.
			if(Deuce.est_deuce(joueur1, joueur2)){
				joueur_en_ADV = Deuce.jouer_en_deuce(joueur1, joueur2);
				Deuce.balle_de_match(joueur1, joueur2, joueur_en_ADV);
			}
			
			// Sinon on continue à jouer.
			else{
				Match.jouer(joueur1, joueur2);
				Match.afficher_resultat(joueur1, joueur2);
			}
		}
		
		System.out.println("");
		if(joueur1.isWin()){
			joueur1.setNb_win(joueur1.getNb_win() + 1);
			joueur1.setWin(false);
			joueur1.setScore(0);
			System.out.println("Alice win 1 match : " + joueur1.getNb_win() + " - " + joueur2.getNb_win());
		}
		else{
			joueur2.setNb_win(joueur2.getNb_win() + 1);
			joueur2.setWin(false);
			joueur2.setScore(0);
			System.out.println("Bob win 1 match : " + joueur1.getNb_win() + " - " + joueur2.getNb_win());
		}
	}

	// Cette fonction teste si le jeu prend la fin.
	public static boolean fin_du_grand_jeu(Joueur joueur1, Joueur joueur2){
		int nb_win1 = joueur1.getNb_win();
		int nb_win2 = joueur2.getNb_win();
		
		if(nb_win1 > 5 && nb_win1 > nb_win2 + 1){
			joueur1.setWin(true);
			joueur2.setWin(false);
			return true;
		}
		
		if(nb_win2 > 5 && nb_win2 > nb_win1 + 1){
			joueur2.setWin(true);
			joueur1.setWin(false);
			return true;
		}
		return false;
		
	}
	
	// Le cas Tie-Break, le score final passe de 6 à 7.
	public static boolean fin_du_grand_jeu_v2(Joueur joueur1, Joueur joueur2){
		int nb_win1 = joueur1.getNb_win();
		int nb_win2 = joueur2.getNb_win();
		
		if(nb_win1 > 6 && nb_win1 > nb_win2 + 1){
			joueur1.setWin(true);
			joueur2.setWin(false);
			return true;
		}
		
		if(nb_win2 > 6 && nb_win2 > nb_win1 + 1){
			joueur2.setWin(true);
			joueur1.setWin(false);
			return true;
		}
		return false;
		
	}
	
	// Cette fonction teste si on entre dans le tie-break.
	public static boolean tie_break(Joueur joueur1, Joueur joueur2){
		int nb_win1 = joueur1.getNb_win();
		int nb_win2 = joueur2.getNb_win();
		
		if(nb_win1 > 5 && nb_win1 == nb_win2){
			return true;
		}
		
		return false;
	}
	
	
	
	
	// On joue dans le tie-break.
	public static void jouer_en_tie_break(Joueur joueur1, Joueur joueur2){
		
		// On ne garde plus les anciens joueurs, car le score s'arrête à 6-6.
		joueur1 = new Joueur("Alice", 0, 0, false);
		joueur2 = new Joueur("Bob", 0, 0, false);
		
		while(!GrandMatch.fin_du_grand_jeu_v2(joueur1, joueur2)){
			GrandMatch.jouer_un_match(joueur1, joueur2);
		}
		
		if(joueur1.getNb_win() > joueur2.getNb_win()){
			System.out.println("Alice win!");
		}
		else{
			System.out.println("Bob win!");
		}
	}
	
	
}
