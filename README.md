# TP 12 : Gestion des Fichiers 
## Exercice 1 : FileReader/FileWriter, BufferedReader/BufferedWriter, Files
Ce projet est un Travail Pratique (TP) conçu pour maîtriser les opérations d'Entrées/Sorties (I/O) en Java. Il couvre la lecture et l'écriture de fichiers texte, le traitement de fichiers CSV et la sérialisation d'objets binaires.

##  Objectifs Pédagogiques

* **Lecture de texte** : Utiliser `FileReader` et `BufferedReader`.
* **Écriture de texte** : Utiliser `FileWriter` et `BufferedWriter`.
* **Traitement de données** : Parser un fichier CSV et filtrer des données.
* **Sérialisation** : Sauvegarder et restaurer des objets Java via `ObjectOutputStream` / `ObjectInputStream`.
* **Bonnes pratiques** : Utilisation du `try-with-resources`.

##  Structure du Projet

```text
TPFiles/
├── src/
│   └── com/
│       └── example/
│           └── tp/
│               ├── Main.java             # Point d'entrée
│               ├── TextReader.java       # Exo 1 : Lecture
│               ├── TextWriter.java       # Exo 2 : Écriture
│               ├── CsvParser.java        # Exo 3 : Parsing CSV
│               ├── ObjectSerializer.java # Exo 4 : Sérialisation
│               └── Record.java           # Objet métier (implements Serializable)
├── input.txt   # Fichier d'entrée requis (Texte)
├── data.csv    # Fichier d'entrée requis (CSV)
└── README.md   # Documentation
```
##  Exemple d’exécution (image)
 
Voici un exemple de l'exécution du programme (screenshot) :

<img width="976" height="601" alt="image" src="https://github.com/user-attachments/assets/1be81dfe-27a3-4dbb-ab45-c8f51000d2e2" />

---
 ## Exercice 2 : PrintWriter et BufferedReader


Ce projet est un Travail Pratique (TP) focalisé sur l'utilisation de la classe **`PrintWriter`** en Java. Il démontre comment générer et formater différents types de fichiers texte (Logs, CSV, HTML) de manière efficace.

##  Objectifs Pédagogiques

1.  **Journalisation (Logging)** : Écrire dans un fichier en mode "ajout" (`append`) sans écraser le contenu précédent.
2.  **Formatage de données** : Générer un fichier CSV structuré à partir d'une liste d'objets.
3.  **Génération Web** : Créer dynamiquement une page HTML avec gestion de l'encodage (UTF-8).
4.  **Gestion des ressources** : Utilisation systématique du `try-with-resources` pour la fermeture automatique des flux.

##  Structure du Projet

Voici l'organisation des fichiers sources et des fichiers générés après exécution :

```text
TPPrintWriter/
├── src/
│   └── com/
│       └── example/
│           └── tp/
│               ├── Main.java           # Programme principal (lance tous les tests)
│               ├── LogManager.java     # Exo 1 : Gestion des logs
│               ├── CsvWriter.java      # Exo 2 : Création de CSV
│               └── HtmlGenerator.java  # Exo 3 : Création de HTML
├── application.log   # Fichier généré (Logs)
├── report.csv        # Fichier généré (Données)
├── index.html        # Fichier généré (Page Web)
└── README.md         # Ce fichier
```
##  Exemple d’exécution (image)
 
Voici un exemple de l'exécution du programme (screenshot) :

<img width="1196" height="157" alt="image" src="https://github.com/user-attachments/assets/62a35ba4-0d59-4edc-8cd5-a32fcb4f2c82" />
