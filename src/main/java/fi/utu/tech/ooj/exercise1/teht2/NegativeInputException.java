package fi.utu.tech.ooj.exercise1.teht2;

public class NegativeInputException extends Exception{
    final int[] numbers;
    final boolean[] exceptionIndexArray;

    public NegativeInputException(int[] nums, boolean[] negativeIndexArray) {
        this.numbers = nums;
        this.exceptionIndexArray = negativeIndexArray;
    }

    @Override
    public String toString(){
        for (int i = 0; i <= numbers.length-1; i++){
            if (exceptionIndexArray[i]){
                System.out.println("Antamasi taulukon "+ Integer.toString(i+1) +". luku "+ Integer.toString(numbers[i])+" on virheellinen");
            }
        }
        return "";
    }
}
