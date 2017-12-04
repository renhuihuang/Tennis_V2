
public class Deuce {

	// On entre dans DEUCE quand on a 40 - 40.
	public static boolean est_deuce(Joueur joueur1, Joueur joueur2){
		int score1 = Match.convertir_score(joueur1.getScore());
		int score2 = Match.convertir_score(joueur2.getScore());
		
		if(score1 == 40 && score2 == 40){
			return true;
		}
		return false;
	}
	
	// L'un des deux joueurs marque un but. Il entre dans l'état ADV.
	public static int jouer_en_deuce(Joueur joueur1, Joueur joueur2){
		int random = (int)(Math.random() * 2);
		
		if(random == 0){
			joueur1.setScore(4);
			joueur2.setScore(3);
			System.out.println("Alice marque un but : ADV - 40");
			return 1;
		}
		else{
			joueur2.setScore(4);
			joueur1.setScore(3);
			System.out.println("Bob marque un but   : 40 - ADV");
		}
		return 2;
	}
	
	// Balle de match, soit un joueur gagne, soit on retourne en DEUCE.
	public static boolean balle_de_match(Joueur joueur1, Joueur joueur2, int joueur_en_ADV){
		int random = (int)(Math.random() * 2);
		
		if(random == 0 && joueur_en_ADV == 1){
			System.out.println("Alice marque un but : 0 - 0");
			joueur1.setWin(true);
			return true;
		}
		
		if(random == 0 && joueur_en_ADV == 2){
			joueur1.setScore(3);
			joueur2.setScore(3);
			System.out.println("Alice marque un but : DEUCE - DEUCE");
			return false;
		}

		if(random == 1 && joueur_en_ADV == 2){
			System.out.println("Bob marque un but   : 0 - 0");
			joueur2.setWin(true);
			return true;
		}
		
		if(random == 1 && joueur_en_ADV == 1){
			joueur1.setScore(3);
			joueur2.setScore(3);
			System.out.println("Bob marque un but   : DEUCE - DEUCE");
			return false;
		}
		return false;
	}
}
