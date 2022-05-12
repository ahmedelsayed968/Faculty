package Chapter13Interfaces;

import java.io.ObjectStreamException;
import java.util.Date;

abstract public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private Date date;
    // constructors are used only for subclasses
    protected GeometricObject(){
        this.date = new Date();
    }
    protected GeometricObject(String color, boolean filled){
        this.date = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDate() {
        return date;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString(){
        return "Color: "+ color + "\nCreatedDate: " + date +"\nFilledStatus: "+filled;
    }
    @Override
    public abstract boolean equals(Object object);
//    @Override
//    public boolean equals(Rectangle object){
//        return
//    }
}
