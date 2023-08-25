import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {3,1,5,4,2};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums){
        for(int i=nums.length-1; i>=0; i--){
            int val = Integer.MIN_VALUE;
            int valIndex = -1;
            for(int j=0; j<=i; j++){
                if(nums[j] > val){
                    val = nums[j];
                    valIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = val;
            nums[valIndex] =temp;
        }
    }
}
