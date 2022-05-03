package Chapter12Exceptions;

import java.awt.desktop.SystemSleepEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
*
*
* */
public class MainIdea {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
//        System.out.println(Quotient(5,0));
//        try {
//            int result = QoutientWithException(5, 0);
//        }catch (ArithmeticException ex){
//            System.out.printf(ex.getMessage());
//        }

//        DetectIntegerInput();

//        System.out.println(1.0/0);// dividing floating point by zero will not throw an exception but gives (infinity)
//        System.out.println(1/0);// throw an exception


//        long value = Long.MAX_VALUE + 10000;
//        System.out.println(value); will not throw exception but will overflow
    }
    // Case1 Not preferred The method can terminate the program
    public static int Quotient(int n1 ,int n2){
        if(n2==0){
            System.out.println("Divisor can not be Zero!");
            System.exit(1);
        }
        return n1/n2;
    }


    // Case2 Preferred Due to the method can not terminate the program and throw an exception to the caller
    public static int QoutientWithException(int n1 , int n2){
        if(n2 == 0){
            throw new ArithmeticException("Divisor can not be Zero!");
        }
        return n1/n2;
    }

    public static void DetectIntegerInput(){
        boolean continueInput = true;
        do{
            try{
                System.out.println("Enter an Interger Value");
                int input = sc.nextInt();
                continueInput = false;
                System.out.println("Congrats");
            }catch (InputMismatchException ex){
                System.out.println("Try again :)");
                // Discard Scanner
                sc. nextLine();
            }
        }while(continueInput);
    }


}
/* Main Idea
*   1) Exception: An exception is an object that represents an error or a condition that prevents execution from proceeding normally
*
*   2) If the exception is not handled, the program will terminate abnormally
*
*   3)(As a conclusion) Exception Handling:  enables a program to deal with exceptional situations and continue its normal execution.
*
*   4) You should not let the method terminate the program—the caller should decide whether to terminate the program.
*
*   5) How can a method notify its caller an exception has occurred? throw an exception that can be caught and handled by the caller.
*
*   6) The execution of a throw statement is called throwing an exception.
*
*   7) a template for a try-throw-catch:
*       try {
            Code to run;
            A statement or a method that may throw an exception;
            More code to run;
        }
        catch (type ex) {
            Code to process the exception;
        }

*   8) The key benefit of exception handling:
*       is separating the detection
        of an error (done in a called method) from the handling of an error (done in the calling
        method).

    9) Exceptions are objects, and objects are defined using classes.
*   10) The root class for exceptions is java.lang.Throwable.
*
*   11) The exception classes can be classified into three major types: system errors, exceptions, and runtime exceptions.
*
*   11.1) ■ System errors are thrown by the JVM and are represented in the Error class
*           1) The Error class describes internal system errors
*           2) there is little you can do beyond notifying the user and trying to terminate the program gracefully.
*           3) Ex. -> LinkageError, VirtualMachineError
*
*   11.2) ■ Exceptions are represented in the Exception class
*           1) which describes errors caused by your program and by external circumstances.
*           2) These errors can be caught and handled by your program
*           3) Ex. ->  ClassNotFoundException, IOException.
*           IOException: Related to input/output operations, such as invalid input, reading past the end of a file, and opening a nonexistent file.
*                       subClasses of it -> EOFException (End of File Exception)
*
*   11.3) ■ Runtime exceptions are represented in the RuntimeException class
*           1) describes programming errors
*           2) Runtime exceptions are generally thrown by the JVM.
*           3) ArithmeticException, NullPointerException, IndexOutOfBoundsException, IllegalArgumentException-> A method is passed an argument that is illegal or inappropriate
*
*   11.4) RuntimeException, Error, and their subclasses are unchecked exception (Logic error cannot be detected from the compiler)
*         All other exceptions are known as checked exceptions -> can be detected by the compiler and suggest to maintain it by try-catch block or throw exception in the method header
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */

