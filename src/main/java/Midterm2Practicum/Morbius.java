package main.java.Midterm2Practicum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class Morbius {

    public static void main(String[] args) {
        // System.out.println( new file.ge);
        // Scanner scanner = new
        // Scanner("/src/main/java/Midterm2Practicum/morbius.txt");
        int x = 0;
        try {
            FileReader FR = new FileReader(
            "/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
            BufferedReader BR = new BufferedReader(FR);
            Scanner scanner = new Scanner(BR);
            scanner.useDelimiter("\\W+");
                        while (scanner.hasNext()) {
                if (scanner.next().equalsIgnoreCase("morbius")) {
                    x++;
                }
            }
            // int x = 0;
            // FileReader FR = new FileReader(
            // "/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
            // BufferedReader BR = new BufferedReader(FR);
            // Stream<String> line = BR.lines().filter(str ->
            // str.toLowerCase().contains("morbius")).map(String x ->
            // x.split().equals("morbius").count(););
            // System.err.println(line);
            // // .forEach(System.out::println);;

        }catch (FileNotFoundException E) {System.out.println( "Error " + E);}
         finally {
            System.out.println(x);
        }
    }
}
