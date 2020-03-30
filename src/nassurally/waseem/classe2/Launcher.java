package nassurally.waseem.classe2;

public class Launcher {

    // Constante pour le nombre de manches.
    private static final int NB_MANCHES = 10;

    public static void main(String[] args) {


        // Instances de la classe Joueur
        Joueur joueur1 = new Joueur("Nassurally","Waseem",0);
        Joueur joueur2 = new Joueur("Ye","Steven",0);


        // Boucle pour chaque manche permettant de lancer le dé. (3 fois dans la méthode addPoint).
        for (int i = 0; i < NB_MANCHES ; i++) {
           joueur1.addPoint();
           joueur2.addPoint();

        }

        // J'affiche le total des joueurs.
        System.out.println("Total points joueur 1: " + joueur1.getTotal());
        System.out.println("Total points joueur 2: " + joueur2.getTotal());



        // Condition afin de savoir qui a gagné !
        if ( joueur1.getTotal() == joueur2.getTotal()){

            System.out.println("Egalité !");

        }else if (joueur1.getTotal() < joueur2.getTotal()){

            System.out.println("Le joueur 2 a gagné !");

        }else{

            System.out.println("Le joueur 1 a gagné !");
        }


    }
}
