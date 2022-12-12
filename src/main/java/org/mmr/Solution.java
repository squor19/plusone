package org.mmr;

public class Solution {
    /*
        There are two important cases:
        1) when the length of array is bigger than one;
        2) when the length of array is one;
     */
    public static int[] plusOne(int[] digits) {
        if (digits.length > 1) { // here we check an array for the first case;

            for (int i = digits.length - 1; i != -1; i--) { // loop checks elements of array by decrease;
                if (digits[0] == 9 && i == 0) { // if the last element from our check is 9 we have to expand the array by one(A new element will be "1");
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result; // once we solve this exception we can easily return the result;
                }

                if (digits[i] == 9) // this condition will make "0" with every "9" (for example: 109 + 1 == 110, nine turned into zero);
                    digits[i] = 0;
                else { // in every other case we just have to increase the number;
                    digits[i]++;
                    break; // if we've just increased the number the loop must be finished earlier;
                }
            }
        } else { // here is the second case of array which contains two simple situations;
            if (digits[0] == 9) // exception when the number is 9 we just turn it into 10;
                return new int[]{1, 0};
            else // and if it is not 9, so we just increase it by one;
                digits[0]++;
        }
        return digits; // and returning result of this method
    }
}
