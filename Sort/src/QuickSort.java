/**
 * @ClassName QuickSort
 * @Desctiption 快速排序的三种实现方式  经典-三路-随机三路
 * @Author NingLang
 * @Date 2019/6/23 14:53
 * @Version 1.0
 **/
public class QuickSort {
    public static void  main(String[]args){
        int []arr = {4,1,3,2,5,6,9,8,7,0};
//        quickSort(arr,0,arr.length-1);
        quickSort2(arr,0,arr.length-1);
        for (int a:arr ) {
            System.out.print(a+"\t");
        }
    }

    //原始的快排，每次分区的结果是一半小于等于基准值，一半大于基准值
    public static void quickSort(int [] arr ,int left ,int right){
        if(left<right){
            int mid = partition(arr,left,right);
            quickSort(arr, left, mid-1);
            quickSort(arr, mid+1, right);
        }
    }

    public static int partition(int [] arr,int L,int R){
        int less = L - 1;
        int more = R;
        while (L < more){
            if(arr[L] <= arr[R]){
                swap(arr,++less,L++);
            }else {
                swap(arr,--more,L);
            }
        }
        swap(arr,more,R);

        return more;
    }

    //快排升级版
    //原始的快排，每次分区的结果是一半小于等于基准值，一半大于基准值
    public static void quickSort2(int [] arr ,int left ,int right){
        if(left<right){
            //终极快排之随机快排
//            swap(arr,left+(int)Math.random()*(right-left+1),right);
            int[] mid = partition2(arr,left,right);
            quickSort(arr, left, mid[0]-1);
            quickSort(arr, mid[1]+1, right);
        }
    }

    public static int[] partition2(int [] arr,int L,int R){
        int less = L - 1;
        int more = R;
        while (L < more){
            if(arr[L] < arr[R]){
                swap(arr,++less,L++);
            }else if(arr[L] > arr[R]) {
                swap(arr,--more,L);
            }else {
                L++;
            }
        }
        swap(arr,more,R);

        return new int[]{less+1,more};
    }

    public static void swap(int []arr,int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
