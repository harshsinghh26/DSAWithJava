import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4};
//        bubbleSort(nums);
//        selectionSort(nums);
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j -1, j);
                }else{
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int lastInedx = arr.length - i - 1;
            int maxIndex = maxIndex(arr, 0, lastInedx);
            swap(arr, maxIndex, lastInedx);
        }
    }

    static int maxIndex(int[] nums, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}