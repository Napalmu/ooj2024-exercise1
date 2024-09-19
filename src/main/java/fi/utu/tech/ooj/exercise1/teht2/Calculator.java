package fi.utu.tech.ooj.exercise1.teht2;

import java.util.Arrays;

public class Calculator {
    public static float avg(int[] nums) throws EmptyArrayException, NegativeInputException {
        int sum = 0;
        boolean[] negativeIndexArray = new boolean[nums.length];
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] < 0) {
                negativeIndexArray[i] = true;
            } else {
                negativeIndexArray[i] = false;

            }
        }
        if (nums == null || nums.length == 0){
            throw new EmptyArrayException();
        }
        for (boolean value : negativeIndexArray){
            if (value){
                throw new NegativeInputException(nums, negativeIndexArray);
            }
        }
        for(int n: nums) sum += n;
        return sum / nums.length;
    }
}
