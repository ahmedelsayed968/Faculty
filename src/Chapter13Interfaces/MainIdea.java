package Chapter13Interfaces;

import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MainIdea {
//    protected native Object clone() throws CloneNotSupportedException;
    public static void main(String[] args){
//        #1


//        GeometricObject circle = new Circle(5);
//        GeometricObject rectangle = new Rectangle(5,3);
//        displayGeometricObject(circle);
//        displayGeometricObject(rectangle);
//        System.out.println("have the same area ? "+CompareArea(circle,rectangle));

//        #2

//        Object[] objects = new Object[]{new Tiger(),new Chicken(),new Apple()};
//        for (int i = 0 ; i < objects.length ; i++){
//            if(objects[i] instanceof Edible){
//                System.out.println(((Edible)objects[i]).howToEat());
//            }
//            if(objects[i] instanceof Animal){
//                System.out.println(((Animal)objects[i]).sound());
//
//            }
//        }

//        #3
//        Comparable[] rectengles1 = {new Rectangle(5,6),new Rectangle(3,9),new Rectangle(9,1)};
//        Arrays.sort(rectengles1);
//        for(Object r:rectengles1){
//            System.out.println(r);
//            System.out.println();
//            }
//        #4
//        Integer n1 = new Integer(3);
//        Object n2 = new Integer(4);
//        System.out.println(n1.compareTo((Integer) n2));

        Rectangle r1 = new Rectangle(5,2);
        try {
            Rectangle r2 = r1.clone();
            System.out.println(r1==r2);
            System.out.println(r1.equals(r2));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Apple ap = new Apple();
        Apple a = new Apple();
//        a = (Apple) ap.clone();

    }

    public static boolean CompareArea(GeometricObject object1 , GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }
    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("Area : " + object.getArea());
        System.out.println("Perimeter: "+object.getPerimeter());
        System.out.println(object);
    }



}
//class A{
//
//    public void method1(){
//        System.out.println("A");
//    }
//}
//
//abstract class B extends A{
//
//    @Override
//    abstract public void method1();
//
//}
//class c extends B{
//    public void method1(){
//        System.out.println("C extends B");
//    }
//}
interface A {
    void m11();
}
class B implements A {
    public void m11() {
        System.out.println("m1");
    }
}
/*  1) interface:  can be used to define common behavior for classes (including unrelated classes).

    2) Abstract Classes:
        2.1) can not be used to create an object from it!

        2.2) may contain abstract methods and any subclasses(concrete) must have to implement them

        2.3) abstract classes are donated using (abstract keyword before class keyword && (before or after access modifiers)

        2.4) abstracted methods are donated using (abstract keyword) also ,and we can use only (public or protected access modifiers not allowed to use private + abstract)

        2.5) UML -> named of abstract classes and their abstracted methods are (italicized).

        2.6) abstract classes could have data fields

        2.7) cannot create instances of abstract classes using the new operator

        2.8) abstract methods are defined without their implementation

        2.9) a class that contains abstract methods must be defined as abstract class.

        2.10) constructors in abstract classes used only be sub-concrete classes so defined as (protected) and if we create an instance of them superclass’s constructor is
              invoked to initialize data fields defined in the superclass.

        2.11) when implementing abstracted methods we have to keep the signature the same as defined in the superclass!

        2.12) We can use @Override before implementing abstracted methods

        2.13) abstract methods are nonstatic

        2.14) all abstract methods must be implemented in the sub-concrete class extends from super-abstract class

        2.15) it's possible to define abstract class that doesn't contain any abstract methods byt verse vice not allowed

        2.16) if we want to define a base class && disable creating instances from it ,we can define it as abstract class

        2.17) superclass can be concrete and its subclasses can be abstract EX. Object class is concrete-class

        2.18) abstract class can be used as a data type like that-> GeometricObject[] objects = new GeometricObject[10];

        2.19) T/F
                a. An abstract class can be used just like a non-abstract class except that you cannot
                    use the new operator to create an instance from the abstract class.True
                b. An abstract class can be extended. True
                c. A subclass of a non-abstract superclass cannot be abstract. False
                d. A subclass cannot override a concrete method in a superclass to define it as abstract.False
                e. An abstract method must be nonstatic. True

    3) Interfaces:

        3.1) define it like this : modifier interface InterfaceName {}

        3.2) Each interface is compiled into a separate bytecode file

        3.3) you can use an interface as a data type for a reference variable, as the result of casting

        3.4) you cannot create an instance from an interface using the new operator.

        3.5) The relationship between the class and the interface is known as interface inheritance.

        3.6) by default methods in interfaces are public abstract

        3.7) implicitly data fields are static , final ,and public

        3.8) When a class implements an interface, it implements all the methods defined in the interface with the exact signature and return type

        3.9) UML-> The interface name and the method names are italicized && inheritance from the interface can be represented by
                    The dashed lines and hollow triangles are used to point to the interface.

        3.10) adding abstract keyword before interface is redundant declaration!!

        3.11) to use sort method , you have to implement Comparable interface

        3.12) Cloneable interface: helps to do deep copy of an object
              if data fields were also objects of other classes , we have explicitly done clone() to copy them


    4) Interfaces Vs abstract classes summary
        4.1) interfaces:
                1) All variables (data fields) are public static final
                2) No constructors
                3) An interface can not be instantiated using new op.
                4) All methods must be public abstract instance methods
                5) multiple extensions from interface is allowed
                6) interface can inherit from another interface using extends keyword that interface is called sub-interface
                7) An interface can extend other interfaces but not classes.
                8) If a class implements an interface, the interface is like a superclass for the class.
                9) You can use an interface as a data type and cast a variable of an interface type to its subclass








*
*
* */