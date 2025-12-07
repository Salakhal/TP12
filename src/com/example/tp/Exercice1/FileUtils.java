package com.example.tp.Exercice1;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    public static boolean exists(String path) {
        return new File(path).exists();
    }

    public static void delete(String path) throws IOException {
        Files.deleteIfExists(Path.of(path));
    }

    public static void printFileSize(String path) throws IOException {
        long size = Files.size(Path.of(path));
        System.out.println("Taille du fichier : " + size + " octets");
    }
}