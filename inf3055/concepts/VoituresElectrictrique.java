package inf3055.concepts;

class VoituresElectrictrique extends Voiture {
    private String typeChargeur;

    public VoituresElectrictrique(String nom, int puissance, boolean estDemarre,
                                  double vitesse, String typeChargeur) {
        super(nom, puissance, estDemarre, vitesse);
        this.typeChargeur = typeChargeur;
    }

    public void afficher() {
        System.out.println("Type de chargeur : " + typeChargeur);
    }
}

