package com.example.tp.Exercice1;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
           
            System.out.println("1. Lecture de input.txt ");
            TextReader.readLines("input.txt");

          
            System.out.println("\n 2. Copie vers output.txt avec résumé ");
            TextWriter.copyWithSummary("input.txt", "output.txt");
            System.out.println("Fichier output.txt généré avec succès.");

         
            System.out.println("\n  3. Traitement CSV ");
            List<Record> allRecords = CsvParser.readCsv("data.csv");
            System.out.println("Lecture de " + allRecords.size() + " enregistrements.");

           
            List<Record> passed = allRecords.stream()
                                     .filter(r -> r.getScore() >= 50)
                                     .collect(Collectors.toList()); 
            
            CsvParser.writeCsv(passed, "passed.csv");
            System.out.println("Fichier passed.csv généré (" + passed.size() + " reçus).");

        
            System.out.println("\n  4. Sérialisation binaire ");
            ObjectSerializer.serialize(allRecords, "records.ser");
            System.out.println("Objets sérialisés dans records.ser");

            System.out.println(" Désérialisation ");
            List<Record> loaded = ObjectSerializer.deserialize("records.ser");
            
            System.out.println("Contenu désérialisé :");
            loaded.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur critique : " + e.getMessage());
            e.printStackTrace();
        }
    }
}