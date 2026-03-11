package main.java.Midterm2Practicum;

import java.io.BufferedReader;
import java.io.FileReader;

public class Morbius {

    public static void main(String[] args) {
    // String filename = "/Users/mollypalocy/SoftDevII/Catching-Up-RIT-124/morbius.txt";
       FileReader FR =  new FileReader("morbius.txt");
       BufferedReader BR = new BufferedReader(FR);
       System.out.println(BR);

    }

}
