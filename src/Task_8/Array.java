package Task_8;

import java.util.Arrays;

public class Array implements IShow{

    protected int arr[];
    public Array (int arr[] ){
        this.arr = arr.clone();
    }

    public Array (int size){
        arr = new int[size];
    }

    public Array () {

    }

    public void push(int n){
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = n;

        this.arr = tmp;
    }

    public void pop(){
        int[] tmp = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 2; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;
    }
    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public void print(String info) {
        System.out.println(info);
        System.out.println(Arrays.toString(arr));
    }
}
