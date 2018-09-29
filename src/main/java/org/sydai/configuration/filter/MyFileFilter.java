package org.sydai.configuration.filter;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {


    public boolean accept(File file) {
        return (file.isFile() && file.getName().endsWith(".class")) || file.isDirectory();
    }
}
