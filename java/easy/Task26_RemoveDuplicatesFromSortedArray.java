package easy;

import java.util.Arrays;

public class Task26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Task26_RemoveDuplicatesFromSortedArray task = new Task26_RemoveDuplicatesFromSortedArray();
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(task.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                n = nums[i];
                k++;
            } else if (nums[i] != n) {
                n = nums[i];
                nums[k] = n;
                k++;
            }
        }
        return k;
    }
}
