public class TestDivision {
    public static void main(String[] args){

        Division d = new Division();

        System.out.println("Division methode de classe");
        System.out.println(Division.diviser(5));

        System.out.println("Division methode d'instance");
        System.out.println(d.calculerMoyenne(6));
    }
}
