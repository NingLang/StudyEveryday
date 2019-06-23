/**
 * @ClassName MergeSort
 * @Desctiption 归并排序
 * @Author NingLang
 * @Date 2019/6/23 15:49
 * @Version 1.0
 **/
public class MergeSort {
    public static void  main(String[]args){
        int []arr = {4,1,3,2,5,6,9,8,7,0};

        mergeSort(arr,0,arr.length-1);

        for (int a:arr ) {
            System.out.print(a+"\t");
        }
    }
    public static void mergeSort(int[]arr,int left ,int right){
        if (left<right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr,mid,left,right);
        }
    }
    public static void merge(int []arr,int mid, int left, int right){
        int [] help = new int [right-left+1];
        int i = 0;
        int p1 = left;
        int p2 = mid +1;
        while (p1<=mid&&p2<=right){
            help[i++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=mid){
            help[i++] = arr[p1++];
        }
        while (p2<=right){
            help[i++] = arr[p2++];
        }
        for(i=0;i<help.length;i++){
            arr[left+i] = help[i];
        }
    }
}
