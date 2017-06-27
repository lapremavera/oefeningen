package be.vdab.myIOoefn;

import java.io.File;
import java.io.FileFilter;

public class ImageFileFilter {

    private final String[] okFileExtensions = new String[]{"jpg", "png", "gif"};

    public boolean accept(File file) {
        for (String extension : okFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true;

            }
        }return false;
    }
}
