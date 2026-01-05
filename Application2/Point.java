public class Point {
    double x, y;

    // Constructeur principal
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur par copie
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Constructeur par défaut
    Point() {
        this.x = 0;
        this.y = 0;
    }

    // Afficher les coordonnées
    void afficher() {
        System.out.println("point X : " + this.x + " point Y : " + this.y);
    }

    // Distance entre deux points
    double distance(Point p) {
        return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }

    // Déplacer le point
    void deplacer(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
