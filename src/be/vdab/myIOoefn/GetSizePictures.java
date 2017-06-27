package be.vdab.myIOoefn;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

public class GetSizePictures {
    public static void main(String[] args) throws IOException {

        File pictures = new File("C:/Users/draakje/OneDrive/Documents/mao/starters/fotos");
        File[] fotolist= pictures.listFiles();

        //Path path = Paths.get("C:/Users/draakje/OneDrive/Documents/mao/starters/fotos");
        //FileOwnerAttributeView ownerAttributeView = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
        //UserPrincipal owner = ownerAttributeView.getOwner();
        //System.out.println("owner: " + owner.getName());


       /*Path path= Paths.get("C:/Users/draakje/OneDrive/Documents/mao/starters/fotos/Woof.jpg");
        FileOwnerAttributeView view= Files.getFileAttributeView(path,FileOwnerAttributeView.class);
        UserPrincipalLookupService lookupService= FileSystems.getDefault().getUserPrincipalLookupService();


       // System.out.println(owner.getName());
        //String username = owner.getName();
        */


        for (File p:fotolist){
            if (p.isFile()){
                Path pathVanp = Paths.get(p.getPath());
                UserPrincipal owner = Files.getOwner(pathVanp);

                System.out.println("Naam van de file: "+p.getName());
                System.out.println("Size in KiB: " +p.length()/1024);
                System.out.println("Owner: "+ owner.getName());
                System.out.println();

                        }
                    }
    }
}
