import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] nums = {3,1,5,4,2};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void cyclicSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int temp = nums[0];
            nums[0] = nums[temp-1];
            nums[temp-1] = temp;        
        }
    }
}
