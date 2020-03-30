package nassurally.waseem.classe2;

public class Joueur {


    // Constante concernant le nombre de lancer de dé par partie.
    private static final int NB_LANCER_DE = 3;

    // Attributs
    private String nom;
    private String prenom;
    private int total;



    // Constructeur
    public Joueur(String nom, String prenom, int total) {
        this.nom = nom;
        this.prenom = prenom;
        this.total = total;
    }

    // Getter et setter
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    // Méthode permettant d'ajouter au total du joueur les 3 lancer de dé.
    public void addPoint(){

        int point = 0;
        De monDe = new De();

        for (int i = 0; i < NB_LANCER_DE; i++) {
            point += monDe.lance();

        }

        total += point;


    }

}
