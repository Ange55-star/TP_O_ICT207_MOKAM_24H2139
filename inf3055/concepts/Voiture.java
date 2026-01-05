package inf3055.concepts;

public class Voiture {
    private String nom; // ajouté pour le nom
    private int puissance;
    private boolean estDemarree;
    private double vitesse;

    // Constructeur vide
    public Voiture() {
        puissance = 4;
        estDemarree = false;
        vitesse = 0;
        nom = "VoitureDefault";
    }

    // Constructeur paramétré pour super(...) dans VoituresElectrictrique
    public Voiture(String nom, int puissance, boolean estDemarree, double vitesse) {
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarree = estDemarree;
        this.vitesse = vitesse;
    }

    // Méthodes
    public void demarre() {
        estDemarree = true;
    }

    public void accelere(double v) {
        if (estDemarree) {
            vitesse += v;
        }
    }

    // Optionnel : afficher les infos
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Puissance : " + puissance);
        System.out.println("Vitesse : " + vitesse);
        System.out.println("Démarrée : " + estDemarree);
    }
}
