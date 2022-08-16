package chart3.lesson1.homework.task1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"jsad", "qweq", "ere", "cvnbm"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(swap(array, 2, 3)));

        Integer[] arrayInt = new Integer[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(swap(arrayInt, 2, 3)));

        Byte[] arrayByte = new Byte[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayByte));
        System.out.println(Arrays.toString(swap(arrayByte, 2, 3)));
    }

    public static <T> T[] swap(T[] array, int firstIndex, int secondIndex){
        T buffer = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = buffer;
        return array;
    }
}
