package easy;

import java.util.Arrays;

public class Task66_PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3}))); // Output: [1,2,4]
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1}))); // Output: [4,3,2,2]
        System.out.println(Arrays.toString(plusOne(new int[]{8,9,9,9})));       // Output: [1,0]
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] == 9){
                if (i == 0){
                    digits = Arrays.copyOf(digits, digits.length + 1);
                    digits[i] = 1;
                } else {
                    digits[i] = 0;
                }
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        return digits;
    }
}
