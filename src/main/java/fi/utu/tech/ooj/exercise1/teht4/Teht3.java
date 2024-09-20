package fi.utu.tech.ooj.exercise1.teht4;

import java.util.Arrays;

public class Teht3 {
    public static void suoritaTeht3() {
        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Suoritetaan tehtävä 3");

        int[] lista1 = new int[] { 3,-5 ,6, 23, 11, 23, 0, -1};
        System.out.println("Lista 1 ennen järjestelyä: " + Arrays.toString(lista1));

        int[] lista2 = new int[] { 3,-5 ,6, 23, 11, 23, 0, -1};
        System.out.println("Lista 2 ennen järjestelyä: " + Arrays.toString(lista2));

        System.out.println("Lasketaan kertoma luvulle 11");
        int tulos = Factorial.calculateFactorial(11);
        System.out.println("Kertoma on: " + tulos);

        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Tehtävä 3 suoritus päättyi");
    }
}
