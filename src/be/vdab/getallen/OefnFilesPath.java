package be.vdab.getallen;

import java.io.File;
import java.nio.file.Files;
import java.util.Date;

public class OefnFilesPath {

    public static void main(String[] args) {

      /*

        File dum = new File("/users/vdabcursist/Pictures/NieuweNaam.jpg");
        File starWars = new File("/Users/vdabcursist/Pictures/imperial_stormtrooper-wallpaper-2560x1440.jpg");

        starWars.renameTo(dum);

    */

        File folder = new File("/Users/vdabcursist/Desktop/prema");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("files" + listOfFiles[i].getName());
                System.out.println("Size: " +folder.length());
                System.out.println("Last Modified: " + new Date(folder.lastModified()));
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("/Users/vdabcursist/Desktop/prema" + listOfFiles[i].getName());
            }
        }


    }
}
