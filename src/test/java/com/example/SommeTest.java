package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SommeTest {

    public SommeTest(){

    }

    @Test
    public static void testSomme() {
        Somme somme = new Somme();
        int[] variables = {1, 5, 7};
        int resultat = somme.sommeTableau(variables);
        assertEquals(13, resultat);
    }

    public static void main(String[] args) {
        testSomme();
    }
}
