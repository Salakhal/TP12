package com.example.tp.Exercice2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        LogManager logger = new LogManager("application.log");
        logger.log("INFO", "Démarrage de l'application");
        logger.log("WARN", "Avertissement test");
        System.out.println("1. Logs mis à jour.");

        List<String> header = Arrays.asList("ID", "Nom", "Note");
        List<String[]> data = List.of(
            new String[]{"101", "Ali", "14"},
            new String[]{"102", "Fatima", "17"},
            new String[]{"103", "Samir", "12"}
        );
        CsvWriter.writeCsv("etudiants.csv", header, data);
        System.out.println("2. Fichier CSV généré.");

       
        HtmlGenerator.writeHtml(
            "accueil.html", 
            "Ma Page Java", 
            "Bienvenue, ceci est une page générée par Java PrintWriter."
        );
        System.out.println("3. Fichier HTML généré.");
        
       
        System.out.println("\n==> Exécution terminée avec succès. Veuillez rafraîchir le projet (F5) pour voir les fichiers.");
    }
}