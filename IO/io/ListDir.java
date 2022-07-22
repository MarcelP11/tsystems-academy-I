package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListDir {
    public static void main(String[] args) {
        String path = ".";
        //listDir(new File(path)); //alebo to mozeme takto napisat
        //listDir(path);  //ak je cesta tak sa vykona metoda listDir(File f) teda o riadok vyssie
        File f=new File(path);
        List<File> allFiles = new ArrayList<>();
        File
        list(allFiles);
        //File dir = new File(".");
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

          */


    }

    private static void listDir(String fileName) {
        listDir(new File(fileName));  //zavola sa metoda nizsie ktora vytvori objekt triedy File
    }

    private static void listDir(File f) {
        System.out.println("   " + f.getName());  //vypise  nazov
        if (f.isDirectory()) {   //ak je subor adresarom tak sa vykona for slucka
            for (File sub : f.listFiles()) {   //slucka sa vykona v danom prieinku a ak je nejaky prvok directory tak sa znova
                listDir(sub);    //zavola listDir ale uz na tento adresar (rekurzia)
            }
        }
    }

    public static void list(List<File> files){
        files.stream().forEach(file -> System.out.println(file.getName()));
    }
/*
    private static List<File> filter(String path, String name) {
        List<File> filtered = new ArrayList<File>();
        File dir = new File(name);
        filter(dir, filtered);
        return filtered;
    }

    private static void filter(File f, list<File>, filtered){
    if
*/

}

