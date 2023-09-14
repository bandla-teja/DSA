import java.util.Arrays;
class MergeSort {
    public static void main(String[] args){
        System.out.println(Arrays.toString(mergeSort(new int[]{5,3,2,1,4})));
    }
    
    private static int[] mergeSort(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
        }

        while(j < right.length){
            mix[k] = right[j];
            j++;
        }

        return mix;
    }
}