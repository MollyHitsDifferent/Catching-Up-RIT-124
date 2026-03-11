package main.java.Midterm2Practicum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Morbius {

    public static void main(String[] args) {
        // System.out.println( new file.ge);
        // Scanner scanner = new
        // Scanner("/src/main/java/Midterm2Practicum/morbius.txt");
        try {
            int x = 0;
            FileReader FR = new FileReader(
                    "/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
            BufferedReader BR = new BufferedReader(FR);
           System.out.println( 
            BR.lines().filter(str -> str.toLowerCase().contains("morbius")).count()
        );
            // .forEach(System.out::println);;

        } catch (FileNotFoundException E) {
            System.out.println("Im an angry girl" + E);
        }

    }
}
