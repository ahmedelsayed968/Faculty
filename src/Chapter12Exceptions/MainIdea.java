package Chapter12Exceptions;

import java.awt.desktop.SystemSleepEvent;
import java.io.IOException;
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

//        #1
//        String s = "abc";
//        System.out.println(s.charAt(3));
//        #2
//        Object o = new Object();
//        String d = (String)o;
//        #3
//        Object o = null;
//        System.out.println(o.toString());
//
//        System.out.println(1.0 / 0); --> No Exception will occur

//        #4
//        try {
//            int[] list = new int[10];
//            System.out.println("list[10] is " + list[10]);
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch (Exception ex) {
//            System.out.println("Exception");
//        }
//        #5
//        try {
//            method();
//            System.out.println("After the method call");
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("ArithmeticException");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch (Exception e) {
//            System.out.println("Exception");
//        }
//        #6
//        try {
//            method();
//            System.out.println("After the method call");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException in main");
//        }
//        catch (Exception ex) {
//            System.out.println("Exception in main");
//        }

//        try{
//            System.out.println(1/0);
//        }catch (InputMismatchException ex){
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            System.out.println("Finally");
//        }
//        System.out.println("Done");
//
//        int x = Integer.parseInt("ahmed");
//
        try {
            System.out.println(1/0);
        }catch (ArithmeticException ex){
            System.out.println("1");
            throw ex;
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Done");

    }

//    static void method() throws Exception {
//        System.out.println(1 / 0);
//    }
//
    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }

    // Case1 Not preferred The method can terminate the program
    public static int Quotient(int n1 ,int n2){
        if(n2==0){
            System.out.println("Divisor can not be Zero!");
            System.exit(1);
        }
        return n1/n2;
    }

//    public void m(int value) throws Exception{
//        if (value < 40)
//            throw new Exception("value is too small");
//    }

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
*   12) handling an exception is based on 3 operations -> declaring an exception, throwing it,catcging it
*
*   13) The throws keyword
*       13.1) indicates that myMethod might throw an Exception
*       13.2) defined only in the header of the method
*       13.3) one method can throw multiple number of exception using throws ex,ex2,ex3.....
*       13.4) used to declare exception on the header of the method
*
*   14) throwing exceptions:
*       A program that detects an error can create an instance of an appropriate exception type and throw it.
*       ex. -> throw new ArithmeticException("Divisor can not be Zero!"); constructor with string arg that throw exception with msg can be got using ex.getMessage()
*
*   15) The keyword to declare an exception is throws, and the keyword to throw an exception is throw.
*
*   16) Catching exception:
*       16.1) When an exception is thrown, it can be caught and handled in a try-catch block.
*       16.2) it's the process to find a handler through a chain of methods being invoked
*       16.3) Catch blocks are skipped if no exception occurred inside the try block
*       16.4) if one statement in try block throws an exception Java skips the remaining statements in the try block
*
*   17) The order in which exceptions are specified in catch blocks is important
*           A compile error will result if a catch block for a superclass type appears before a catch block for a subclass type
*
*   18) multi-catch feature
*       to simplify coding for the exceptions with the same handling code.
*       catch(Exception1 | Exception2 | ... | Exception ex){
*           /// code
*           }
*   19) Finally clause:
*       is always executed regardless whether an exception occurred or not!
*       19.1) Consider three possible cases:
*               1) No exception occurred in try block -> finally will be executed --> after (try-catch-finally) block will be executed!
*               2) Exception occurred in try block--> catch will be executed --> finally will be executed-->     after (try-catch-finally) block will be executed!--> rest of try block will be skipped!!
*               3) Exception occurred in try block but no catch block got it--> finally will be executed --> the exception is passed to the caller of this method--> after (try-catch-finally) block will be skipped!!
*
*   20) Rethrowing Exceptions:
*       Java allows an exception handler to rethrow the exception if the handler cannot
        process the exception or simply wants to let its caller be notified of the exception
        try {
               statements;
            }
            catch (TheException ex) {
                perform operations before exits;
                throw ex;
         }
    21)
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
*
*
*
*
* */

