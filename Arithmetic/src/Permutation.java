import java.util.Arrays;

/**
 * @ClassName Permutation
 * @Desctiption 全排列
 * @Author NingLang
 * @Date 2019/7/9 21:49
 * @Version 1.0
 **/
public class Permutation {

    public static int count = 1;
    public static int cc = 1;
    public static int bb = 1;

    public static void permutation(int[] array, int cursor, int end) {
        System.out.println("第"+ count++ +"次进入permutation方法");
        if (cursor == end) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = cursor; i <= end; i++) {
                swap(array, cursor, i);
                permutation(array, cursor + 1, end);
                swap2(array, cursor, i);
            }
        }
    }

    public static void swap(int[] arr, int from, int to) {
        System.out.println("第"+ cc++ +"次进入swap 交换"+arr[from]+"和"+arr[to]);
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
    public static void swap2(int[] arr, int from, int to) {
        System.out.println("第"+ bb++ +"次进入swap 换回"+arr[from]+"和"+arr[to]);
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    private static void core(int[] array) {
        int length = array.length;
        permutation(array, 0, length - 1);
    }


    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        core(ar);
    }

}
