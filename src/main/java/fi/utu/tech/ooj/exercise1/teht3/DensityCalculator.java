package fi.utu.tech.ooj.exercise1.teht3;

public class DensityCalculator {

    /*
     * Alkuehto: Double massa > 0.0 ja Double tilavuus > 0.0
     * Loppuehto: palautusarvo on (massa / tilavuus)
     */
    public static Double laskeTiheys(Double massa, Double tilavuus) {
        return (massa / tilavuus);
    }
    /*
     * Alkuehto: true
     * Loppuehto: palautusarvo on (massa / tilavuus) ja  palautusarvo > 0 ja palautusarvo < 250
     * Poikkeukset: Nostaa poikkeuksen IllegalArgumentException, jos (massa / tilavuus) <= 0 tai >= 250
     */
    public static Double laskeTiheysTotaalisesti(Double massa, Double tilavuus) throws IllegalArgumentException{
        Double tiheys = massa/tilavuus;
        if(tiheys <= 0 || tiheys >= 250.0){
             throw new IllegalArgumentException();
        }

        return tiheys;
    }


}
