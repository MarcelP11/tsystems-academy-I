package io;

import java.io.File;

public class ListDir {
    public static void main(String[] args) {
        File dir = new File(".");
/*
        if (dir.isDirectory()) {
            System.out.println("Listing of: " + dir.getAbsolutePath());

            //List directory
            for (String fileName : dir.list()) {
                System.out.println("  " + fileName);
            }
        } else {
            System.err.printf("File %s is not directory", dir);
        }
        */

        listDir2("C:/Users/Student/Desktop/academy");
    }


    private static void listDir(String path) {
        System.out.println(path);
        File directory = new File(path);
        for (String fileName : directory.list()) {
            System.out.println(fileName);
            if (directory.isDirectory()) {
                listDir(path + "/" + fileName);
            }
        }
    }
//dokoncit
    private static void listDir2(String path){
        File f=new File(path);
        System.out.println("   "+f.getAbsolutePath());
        if (f.isDirectory()){
            for(String sub :f.listFiles()){
                listDir2(sub);
            }
        }
    }
}
