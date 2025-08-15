package encapsulation;

public class Circle {
    private double radius ;
    public double ar;

    public Circle(int a){
        
        setRadius(a);
        

        

    }

    public void setRadius(double b){
        this.radius = b;
    }


    public double getRadius()
    {
        return radius;
    
    }

    public double area()
    {
        ar = 3.1416*getRadius()*getRadius();
        return ar;


    }

    
}
