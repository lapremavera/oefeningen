package be.vdab.getallen;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Date;

public class PrintLijstPictures {

    public static void main(String[] args) {


        //Zo wordt al de files uit de Prema-folder afgeprint.


        File pictures = new File("/Users/vdabcursist/Desktop/prema");
        File[]flist= pictures.listFiles();



        //FileOwnerAttributeView fo = Files.getFileAttributeView(pictures,FileOwnerAttributeView.class);
        //UserPrincipal owner = fo.getOwner();

        for (File p:flist){
            if (p.isFile()){
                System.out.println("Naam van de file: "+p.getName());
                System.out.println("Size in KiB: " +p.length()/1024);
                System.out.println("Last Modified: " + new Date(p.lastModified()));
                System.out.println();
            }
        }



/* alles wordt afgeprint, ook de inhoud van andere directory's -> recursive
        File startDir = new File("/Users/vdabcursist");
        print(startDir);



    }
    public static void print (File f){
        if (f.isFile()){
            System.out.println(f.getName());
        }else if(f.isDirectory()){
            System.out.println(f.getName());
            File[] children = f.listFiles();
            if (children !=null)
            {
                for (File child : children)
                {
                print(child);
                }
            }
        } */
    }

}
