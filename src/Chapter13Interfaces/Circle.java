package Chapter13Interfaces;

import java.util.Objects;

public class Circle extends GeometricObject{
    private final static double PI = 3.14;
    private double radius;

    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(String color, boolean filled,double radius){
        super(color,filled);
        this.radius = (radius > 0 ? radius : 0 );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI * radius * radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString(){
        return super.toString() +"\nradius: " +getRadius()+"\nType: Circle";
    }
    public boolean equals(Object object){
        if(this == object) return  true;
        if( this == null || this.getClass() != object.getClass()) return false;
        // casting to compare
        return Objects.equals(radius,((Circle) object).radius);
    }
}
