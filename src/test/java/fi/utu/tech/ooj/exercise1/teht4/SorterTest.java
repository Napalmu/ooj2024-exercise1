package fi.utu.tech.ooj.exercise1.teht4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    void bubbleSort() {
        int[] arr = {1, 3, 2, 4};
        Sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);

        /*
        * bubbleSort -rutiini ei toimi tarkoituksen mukaisesti, se vaikuttaisi järjestävän alkiot suurimmasta pienimpään, eikä pienimmästä suurimpaan.
        *       -if (arr[j] < arr[j + 1]) pitäisi olla  if (arr[j] > arr[j + 1])
        * toiminnassa on rajoitteita: rutiini muokkaa alkuperäistä taulukkoa, eikä täten palauta mitään.
        *
        *
        * selectionSort -rutiini vaikuttaisi toimivan oikein.
        * sekin muokkaa alkuperäistä taulukkoa. Parempi olisi, jos se muokkaisi kopiota taulukosta ja palauttaisi myöskin jotain.
        * */

    }

    @Test
    void selectionSort() {
        int[] arr = {1, 3, 2, 4};
        Sorter.selectionSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

}