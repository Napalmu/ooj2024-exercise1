package fi.utu.tech.ooj.exercise1.teht3;

public class DensityCalculator {

    /*
     * Alkuehto: Double massa > 0.0 ja Double tilavuus > 0.0
     * Loppuehto: palauttaa tiheyden (massa/tilavuus)
     */
    public static Double laskeTiheys(Double massa, Double tilavuus) {
        return (massa / tilavuus);
    }


    /*
     * Alkuehto: true
     * Loppuehto: palautusarvo on (massa / tilavuus) ja  palautusarvo > 0 ja palautusarvo < 250
     * Poikkeukset: Nostaa poikkeuksen IllegalArgumentException, jos... [TODO: täydennä ehto]
     */
    public static Double laskeTiheysTotaalisesti(Double massa, Double tilavuus) throws IllegalArgumentException{
        /*  TODO: Toteuta rutiini niin, että loppuehto pitää paikkansa ja poikkeus nostetaan tarvittaessa.
            Huom. alla oleva return null on lisätty, jotta harjoitustyöpohja toimii myös
            ennen kuin tehtävä on tehty.
        */

        return null;
    }


}
