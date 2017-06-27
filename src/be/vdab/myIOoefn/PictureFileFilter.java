package be.vdab.myIOoefn;

import java.io.File;
import java.io.FilenameFilter;

public class PictureFileFilter {
    private static final String FILE_DIR="c:/users/draakje/oneDrive/Documents/mao/starters";
    private static final String FILE_TEXT_EXT=".jpg";

    public static void main(String[] args) {
        new PictureFileFilter().listFile(FILE_DIR,FILE_TEXT_EXT);
    }
    public void listFile(String folder, String ext){
        GenericExtFilter filter = new GenericExtFilter(ext);
        File dir = new File (folder);

        if (dir.isDirectory()==false){
            System.out.println("Volgende directory(s) bestaat niet: "+FILE_DIR);
            return;
        }
        String[]list= dir.list(filter);
        if (list.length==0){
            System.out.println("Er zijn geen files eindigend op "+ ext);
            return;
        }
        for (String file:list){
            String temp= new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
            System.out.println("File: "+temp);
        }
    }
}
