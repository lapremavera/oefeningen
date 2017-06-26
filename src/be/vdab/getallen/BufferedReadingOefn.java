package be.vdab.getallen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadingOefn {

    public static void main(String[] args) {

        try(BufferedReader reader= new BufferedReader(new FileReader("/Users/vdabcursist/Desktop/prema/fotos/Alice.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(" ","");     // verwijdert elke spatie; want de String is immutable, daarom line = line...
                line = line.toLowerCase();                          // alles in kleine letters
                System.out.println(line);

            }

        }catch (IOException e) {
            e.printStackTrace();

        }

    }
}
