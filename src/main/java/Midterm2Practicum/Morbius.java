package main.java.Midterm2Practicum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Morbius {

    public static void stageDirections(String filename) {
        try {
            FileReader Fr = new FileReader(filename);
            BufferedReader BR = new BufferedReader(Fr);
            Scanner scanner = new Scanner(BR);

            while (scanner.hasNext()) {
                String checker = scanner.next();
                if (checker.contains("[")) {
                    String holder = "";
                    holder = holder + checker + " ";
                    while (!checker.contains("]") && scanner.hasNext()) {
                        checker = scanner.next();
                        holder = holder + checker + " ";
                    }
                    System.out.println(holder);
                }
            }
        } catch (FileNotFoundException E) {
            System.out.println("MADMADMAD " + E);
        }
    }

    public static void reverse(String filename){
        Scanner scanner = new Scanner((System.in));
        System.out.println( "Please enter a line # :");
        int x =  scanner.nextInt();
        scanner.close();
        String temp = "";
        String destiantionString = null;
        int counter = 1;
        // System.out.println(x);
        try {
        FileReader FR = new FileReader(filename);
        BufferedReader BR = new BufferedReader(FR);
        try{while ((temp = BR.readLine())!=null){
            counter++;
            if (counter == x) {
                destiantionString = temp;
                break;
            }}} catch (IOException E) {System.out.println("ERRORERRORERRO " + E);}

        } finally {System.out.println(destiantionString);}
    }

    public static void main(String[] args) {
        // int x = 0;
        // try {
        // FileReader FR = new FileReader(
        // "/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
        // BufferedReader BR = new BufferedReader(FR);
        // Scanner scanner = new Scanner(BR);
        // scanner.useDelimiter("\\W+");
        // while (scanner.hasNext()) {
        // if (scanner.next().equalsIgnoreCase("morbius")) {
        // x++;
        // }
        // }

        // } catch (FileNotFoundException E) {
        // System.out.println("Error " + E);
        // } finally {}}
        // System.out.println(x);
        // }
        // stageDirections("/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
        reverse("/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/src/main/java/Midterm2Practicum/morbius.txt");
    }
}
