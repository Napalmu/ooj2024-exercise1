package fi.utu.tech.ooj.exercise1.teht3;

public class Teht2 {
    public static void suoritaTeht2() {
        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Suoritetaan tehtävä 2");

        System.out.println("Esimerkkilasku:");

        Double massa = 10.4;
        Double tilavuus = 2.0;
        Double tiheys = DensityCalculator.laskeTiheys(massa, tilavuus);
        System.out.println("Testiajon tulos: massa " + massa + " tilavuus " + tilavuus + " tiheys " + tiheys);

        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Tehtävä 2 suoritus päättyi");
    }
}
