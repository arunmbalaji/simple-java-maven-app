package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    static final ArrayList list = new ArrayList(100);
    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();  
        System.out.print("Enter second number- ");  
        int b= sc.nextInt();  
        System.out.print("Enter third number- ");  
        int c= sc.nextInt();  
        int d=a+b+c;  
        //System.out.println("Total= " +d);  
        return (message +d);
    }

}
