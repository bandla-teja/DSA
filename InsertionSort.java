import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {3,1,5,4,2};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
