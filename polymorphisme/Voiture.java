public class Voiture {
    protected int puissance;
    protected boolean estDemarree;
    protected double vitesse;

    public Voiture() {
        puissance = 4;
        estDemarree = false;
        vitesse = 0;
    }

    public void demarre() {
        estDemarree = true;
    }

    public void accelere(double v) {
        if (estDemarree) {
            vitesse += v;
        }
    }

    public void afficher() {
        System.out.println("Puissance : " + puissance);
        System.out.println("Démarrée : " + estDemarree);
        System.out.println("Vitesse : " + vitesse);
    }
}

