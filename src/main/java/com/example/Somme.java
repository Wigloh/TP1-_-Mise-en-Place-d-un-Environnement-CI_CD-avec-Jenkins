package com.example;
public class Somme {
    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        return somme;
    }
}
