package fi.utu.tech.ooj.exercise1.teht2;

public class Teht1 {
    public static void SuoritaTeht1() {
        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Suoritetaan Tehtävä 1");

        int[] nums = new int[] {1, -2, -3, 4};
        Float result = -1f;
        try {
            result = Calculator.avg(nums);
            System.out.println(result);
        }
        catch(EmptyArrayException | NegativeInputException e) {
            System.out.println("Oho, tapahtui hassuja");
            System.out.println(e.toString());
        }

        //Tulostetaan info-rivi, jotta suoritusta on helpompi seurata
        System.out.println("Tehtävä 1 suoritus päättyi");
    }
}
