public class Division {

    // Attribut de classe
    public static final double NB = 25.0;

    // Méthode de classe
    public static double diviser(double valeur) {
        return NB / valeur;
    }

    // Attribut d'instance
    double somme = 20.0;

    // Méthode d'instance
    public double calculerMoyenne(int nombre) {
        somme = somme / nombre;
        return somme;
    }
}

