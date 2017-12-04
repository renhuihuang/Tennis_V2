
public class Match {

	// Cette fonction simule un but, le score d'un des deux joueurs imcrémente.
	public static void jouer(Joueur joueur1, Joueur joueur2){
		int random = (int)(Math.random() * 2);
		
		if(random == 0){
			joueur1.setScore(joueur1.getScore() + 1);
			System.out.print("Alice marque un but : ");
		}
		else{
			joueur2.setScore(joueur2.getScore() + 1);
			System.out.print("Bob marque un but   : ");
		}
	}
	
	// le score 50 ne va pas afficher.
	public static int convertir_score(int score){
		if(score == 1) return 15;
		if(score == 2) return 30;
		if(score == 3) return 40;
		if(score == 4) return 50;
		return 0;
	}
	
	// Affichage du score.
	public static void afficher_resultat(Joueur joueur1, Joueur joueur2){
		int score1 = convertir_score(joueur1.getScore());
		int score2 = convertir_score(joueur2.getScore());

		if(fin_du_jeu(joueur1, joueur2)){
			System.out.println("0 - 0");
		}
		else{
			System.out.println(score1 + " - " + score2);
		}
	}
	
	public static boolean fin_du_jeu(Joueur joueur1, Joueur joueur2){
		int score1 = convertir_score(joueur1.getScore());
		int score2 = convertir_score(joueur2.getScore());
		
		if(score1 == 40 && score2 < 30){
			joueur1.setWin(true);
			return true;
		}
		
		if(score2 == 40 && score1 < 30){
			joueur2.setWin(true);
			return true;
		}
		
		if(score1 == 50){
			joueur1.setWin(true);
			return true;
		}
		
		if(score2 == 50){
			joueur2.setWin(true);
			return true;
		}
		
		return false;
	}
	
}
