package chart3.lesson1.homework.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"jsad", "qweq", "ere", "cvnbm"};
        System.out.println(array.getClass());
        System.out.println(asArrayList(array).getClass());
        Integer[] arrayInt = new Integer[]{1, 2, 3, 4};
        System.out.println(arrayInt.getClass());
        System.out.println(asArrayList(arrayInt).getClass());
        Byte[] arrayByte = new Byte[]{1, 2, 3, 4};
        System.out.println(arrayByte.getClass());
        System.out.println(asArrayList(arrayByte).getClass());
    }

    static <T> ArrayList<T> asArrayList(T[] array){
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T item : array){
            arrayList.add(item);
        }
        return arrayList;
    }
}
