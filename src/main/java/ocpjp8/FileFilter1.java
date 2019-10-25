package ocpjp8;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class FileFilter1 {

    FileFilter fileFilter = new FileFilter(){
        @Override
        public boolean accept(File file){
            return file.getName().endsWith(".java");
        }
    };

    public static void main(String[] args) {
        FileFilter1 fileFilter1 = new FileFilter1();
        File dir = new File("c:/tmp");
        File[] javaFiles = dir.listFiles(fileFilter1.fileFilter);
        FileFilter filter = (File file) -> file.getName().endsWith(".java");
        File[] moreJavaFiles = dir.listFiles(filter);

    }

}
