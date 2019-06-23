/**
 * @ClassName HeapSort
 * @Desctiption 堆排序的实现
 * @Author NingLang
 * @Date 2019/6/23 15:18
 * @Version 1.0
 **/
public class HeapSort {
    public static void  main(String[]args){
        int []arr = {4,1,3,2,5,6,9,8,7,0};
        heapSort(arr);
        for (int a:arr ) {
            System.out.print(a+"\t");
        }
    }
    //构建大根堆
    public static void heapInsert(int []arr,int index){
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index=(index-1)/2;
        }
    }
    //当堆中元素大小变化时候，重新构建大根堆
    public static void heapify(int []arr,int index,int heapsize){
        int left = index*2+1;
        while (left<heapsize){
            int largest = left+1<heapsize&&arr[left+1]>arr[left]?left+1:left;
            largest = arr[largest] > arr[index] ? largest:index;
            if(largest==index){
                break;
            }
            swap(arr,index,largest);
            index = largest;
            left = index*2-1;
        }
    }
    public static void heapSort(int [] arr){
        if(arr==null || arr.length<2){
            return;
        }
        for (int i = 0;i<arr.length;i++){
            heapInsert(arr,i);
        }
        int heapsize = arr.length;
        swap(arr,0,--heapsize);
        while (heapsize>0){
            heapify(arr,0,heapsize);
            swap(arr,0,--heapsize);
        }

    }
    public static void swap(int []arr,int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
