import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MergeSort {
    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(null, 0)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                List<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i], list);
            }
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum == target){
                if(nums[i] == nums[j]){
                    return new int[]{map.get(nums[i]).get(0),map.get(nums[i]).get(1)};
                }
                return new int[]{map.get(nums[i]).get(0),map.get(nums[j]).get(0)};
            } else if(sum < target){
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}