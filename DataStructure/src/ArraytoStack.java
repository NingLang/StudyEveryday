/**
 * @ClassName ArraytoStack
 * @Desctiption 用数组实现栈数据结构
 * @Author NingLang
 * @Date 2019/6/23 16:43
 * @Version 1.0
 **/
public class ArraytoStack {
    private Integer [] arr;
    private Integer index;

    public ArraytoStack(int initSize){
        if (initSize<0){
            throw new IllegalArgumentException("The init size is less than 0！");
        }
        arr = new Integer[initSize];
        index = 0;
    }

    public Integer peek(){
        if (index == 0){
            return null;
        }
        return arr[index-1];
    }

    public void push(int obj){
        if (index==arr.length){
            throw new ArrayIndexOutOfBoundsException("The Stack is full！");
        }
        arr[index++] = obj;
    }

    public Integer pop(){
        if(index == 0){
            throw new ArrayIndexOutOfBoundsException("The Stack is empty!");
        }
        return arr[--index];
    }
}
