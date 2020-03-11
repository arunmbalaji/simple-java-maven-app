package com.mycompany.app;
import java.net.*;
import java.io.*;
import java.util.*;
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
        
        try {
            String str = "";
            URLConnection conn = new URL("http://aws.amazon.com").openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
    
            while (br.readLine() != null) {
                str += br.readLine();
            } 

        } catch (Exception e) {
            e.printStacktrace();
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
