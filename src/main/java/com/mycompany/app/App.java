package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        App ap = new App();
        for(long ;i<1000;i++)
        {
            ap.addIncremental(i);
        }
    }

    private final String getMessage() {
        return message;
    }
    publiclong addIncremental(long l)
    {
        Long sum=0L;
        sum =sum+l;
        return sum;
    }
}
