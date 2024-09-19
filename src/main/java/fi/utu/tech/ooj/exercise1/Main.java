package fi.utu.tech.ooj.exercise1;

import fi.utu.tech.ooj.exercise1.teht2.Teht1;
import fi.utu.tech.ooj.exercise1.teht3.Teht2;
import fi.utu.tech.ooj.exercise1.teht4.Teht3;

public class Main {
    public static void main(String[] args) {
        System.out.println("DTEK0066 2024 syksy, Tehtäväkerta 1");

        /*  Tämä main-metodi on ainoa, joka tarvitaan kaikkien tehtävien suorittamiseksi.
            Jokaisessa tehtäviä sisältävässä pakkauksessa on Teht* luokka, josta löytyy
            kyseiseen tehtävään kuuluvat ajot suorittava staattinen rutiini.
            Näitä rutiineja kutsumalla suoritamme tässä kaikkien tehtävien ajot.
         */

        Teht1.SuoritaTeht1();
        System.out.println("---------------");
        Teht2.suoritaTeht2();
        System.out.println("---------------");
        Teht3.suoritaTeht3();

    }
}
