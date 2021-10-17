package PART_V_fileHnadling.I_fileClass;

import java.io.File;

/**
 * WAP to show how to create a file with different mode and methods of File class to
 * find path, directory etc.
 * @author 20CE155 ADNAN VAHORA
 * @since 24/9/2021
 * @version 1.0
 */
public class FileDemo {
    static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
/*
        this program contains information about File class.
        A directory in java is treated as a File with one additional property that is list() method

        Constructors of file class
        --- File(String directoryPath)
        --- File(String directoryPath, String fileName)
        --- File(File dirObj, String fileName)
        --- File(URI uriObj)

*/
        //File with directory path as argument
        File f1 = new File("G:\\Other computers\\My Laptop\\college document\\0 SEM 3\\CE 251 JAVA\\Java-practicals\\5_1_File_basics\\src");

        //File with directory path and file name
        File f2 = new File("G:\\Other computers\\My Laptop\\college document\\0 SEM 3\\CE 251 JAVA\\Java-practicals\\5_1_File_basics\\src","autoexec.txt");

        //File with file path assigned to f1 and a filename
        //f3 refers to the same file as f2
        File f3 = new File(f1,"autoexec.txt");

        //Note: "/dir/filename.txt" and "\\dir\\filename.txt" acts as same path for JAVA
        print("File name: " + f1.getName());
        print("path: " + f1.getPath());
        print("Abs Path: " + f1.getAbsolutePath());
        print("Parent: " + f1.getParent());
        print(f1.exists() ? "exists" : "Does not exists");
        print(f1.canRead() ? "is readable" : "is not readable");
        print(f1.canWrite() ? "is writeable" : "is not writeable");
        print("is " + (f1.isDirectory() ?"a directory":"not a directory"));
        print("is " + (f1.isFile() ?"a File":"might be a named pipe"));
        print(f1.isAbsolute()? "Is absolute" : "Is not absolute");
        print("File last modified: "+f1.lastModified());
        print("File size "+f1.length()+ " Bytes");
    }
}
