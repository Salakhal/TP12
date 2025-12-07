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


