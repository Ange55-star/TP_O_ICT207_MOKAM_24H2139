public class TestVoiture {
    public static void main(String[] args) {
        VoitureElectrique tesla =
            new VoitureElectrique("Tesla Model S", 1020, true, 120.0, "Rapide");

        tesla.afficher();
    }
}
