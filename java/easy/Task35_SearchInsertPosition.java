package easy;

public class Task35_SearchInsertPosition {

    public static void main(String[] args) {
        //System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5)); // 2
       // System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[] {1, 3}, 4)); // 4
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length;
        int middle = (start + end) / 2;
        while (start <= end){
            if (nums[middle] < target)
                start = middle + 1;
            else {
                index = middle;
                end = middle - 1;
            }
            middle = (start + end) / 2;
        }
        return index;
    }
}
