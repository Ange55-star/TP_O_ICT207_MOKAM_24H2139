public class Point1{
    double x;
    double y;
    Point1 (double a, double b)
    {
        int n;
        x=a;
        y=b;
    }
    Point1 ()
    {
        x=0;
        y=0;
    
    }
    void deplacer (double dx, double dy)
    {
        x=x+dx;
        y=y+dy;
    }
}