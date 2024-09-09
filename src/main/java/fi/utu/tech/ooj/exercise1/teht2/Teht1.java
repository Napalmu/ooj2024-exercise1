package fi.utu.tech.ooj.exercise1.teht2;

public class Teht1 {
    public static void SuoritaTeht1() {
        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Suoritetaan Tehtävä 1");

        int[] nums = new int[] {  };
        Float result = -1f;
        try {
            result = Calculator.avg(nums);
        }
        catch(EmptyArrayException e) {
            System.out.println("Oho, tapahtui hassuja");
        }

        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Tehtävä 1 suoritus päättyi");
    }
}
