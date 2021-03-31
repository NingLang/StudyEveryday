public class InverseParisInArray {
    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length == 1){
            return 0;
        }
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] nums, int left, int right){
        if (left == right){
            return 0;
        }
        int mid = (left + right)/2;
        return mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right) + merge(nums, left, mid, right);

    }

    public static int merge(int[] nums, int left, int mid, int right){
        int [] help = new int [right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        int result = 0;
        while (p1 <= mid && p2 <= right){
            result = nums[p1]>nums[p2]?result+1+mid-p1:result;
            help[i++] = nums[p1]<=nums[p2]?nums[p1++]:nums[p2++];
        }
        while (p1 <= mid){
            help[i++] = nums[p1++];
        }
        while(p2 <= right){
            help[i++] = nums[p2++];
        }
        for(i= 0;i < help.length; i++){
            nums[i+left]=help[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {7,5,6,4};
        System.out.println(reversePairs(arr));
    }
}
