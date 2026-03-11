package main.java.Midterm2Practicum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Geminipractice {

    public static void main(String[] args) {
        int x = 0;
       try{ FileReader FR = new FileReader("/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/practice.txt");
        BufferedReader BR = new BufferedReader(FR);
        Scanner scanner = new Scanner(BR);
        while (scanner.hasNext()){
            if (scanner.useDelimiter("\\W+").next().toLowerCase().equals("error")) {
            x++;
            }
        }
    } catch (FileNotFoundException E) {System.out.println("Error Thrown " + E);}
    finally {System.out.println(x);}
} 
}
