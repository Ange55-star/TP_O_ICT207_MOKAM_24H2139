public class TestPoint{
    public static void main(String[] argument){
        Point p1 = new Point(3,1);
        Point p2 = new Point();
        Point p3 = new Point(p1);
        System.out.println("p2 :" +p2.x+ "," +p2.y);
        p3.afficher();
        System.out.println(p1.distance(p2));
        p3.deplacer(-3, -2);
        p3.afficher();
    }

}

