
public class VoitureCarburant extends Voiture {
    private String carburant;

    public VoitureCarburant(String nom, int puissance, boolean estDemarre,
                            double vitesse, String carburant) {
        super();
        this.carburant = carburant;
    }

    
    public void afficher() {
        super.afficher();
        System.out.println("Carburant : " + carburant);
    }
}

