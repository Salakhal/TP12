package com.example.tp.Exercice1;


import java.io.Serializable;

public class Record implements Serializable {
    private static final long serialVersionUID = 1L; // Recommandé pour la sérialisation

    private int id;
    private String name;
    private double score;

    public Record(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return "Record{id=" + id + ", name='" + name + "', score=" + score + "}";
    }
}