
class VoitureElectrique extends Voiture{
    private String typeChargeur;

    public VoitureElectrique(String nom, int puissance, boolean estDemarre, double vitesse, String typeChargeur){
        super();
        this.typeChargeur=typeChargeur;
    }
   
     public void afficher(){
        super.afficher();
        System.out.println("Type : Electrique");
        System.out.println("Type de chargeur : " + typeChargeur);
    }
} 



