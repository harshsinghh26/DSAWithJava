public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 12, 13, 16, 19, 20};
        int target = 19;
        int search = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(search);
    }
    static int binarySearch(int[] arr, int target, int s, int e){

        if (s > e){
            return  -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }
        if (arr[m] < target){
            return binarySearch(arr, target, m + 1, e);
        }
        return binarySearch(arr, target, s, m-1);
    }
}
