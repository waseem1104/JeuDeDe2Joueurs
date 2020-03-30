package nassurally.waseem.classe2;
import java.util.Random;

public class De {

    // Constante pour les faces du Dé.
    private static final int MAXDE = 6;

    Random ran = new Random();


    // Méthode qui renvoie un nombre aléatoire entre 1 et 6
    public int lance(){

        int alt = ran.nextInt((MAXDE - 1) +1) + 1;
        return alt;


    }


}
