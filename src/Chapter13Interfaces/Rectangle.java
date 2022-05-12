package Chapter13Interfaces;

import java.util.Date;
import java.util.Objects;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>,Cloneable{
    private double width , height;

    public Rectangle(){super();}
    public Rectangle(double width ,double  height){
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width ,double  height, String color, boolean filled){
        super(color, filled);
        this.height =height;
        this.width = width;
    }

    public int compareTo(Rectangle object){
        if(this.getArea() == object.getArea())
            return 0;
        else if(this.getArea() > object.getArea())
            return 1;
        return -1;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
       return this.getWidth() * this.getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    @Override
    public String toString(){
        return super.toString() + "\nWidth: " +getWidth() +"\nHeight: "+getHeight()+"\nType: Rectangle";
    }


    /*
    * Override the protected clone method defined in
      the Object class, and strengthen its accessibility*/
    @Override
    public Rectangle clone() throws  CloneNotSupportedException{
            Rectangle clone = (Rectangle) super.clone();
            clone.setDate((Date) getDate().clone());
            return clone;
    }

    public  boolean equals(Object object){
        if(this == object) return  true;
        if( this == null || this.getClass() != object.getClass()) return false;
        // casting to compare
        return Objects.equals(width,((Rectangle) object).width) && Objects.equals(height,((Rectangle) object).getHeight());
    }
}
