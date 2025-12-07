package com.example.tp.Exercice2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CsvWriter {

    public static void writeCsv(String path, List<String> header, List<String[]> rows) {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.println(String.join(",", header));
            
            for (String[] row : rows) {
                pw.println(String.join(",", row));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erreur CSV : " + e.getMessage());
        }
    }
}