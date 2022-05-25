package daeHwan;

import daeHyun.BubbleSort;
import jongHyeon.MedianOfThreeQuickSort;
import jongHyeon.RecursiveQuickSort;
import main.RandomArrayCreator;
import main.Student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception{
        Integer[] arr = RandomArrayCreator.intArr(10);
        RecursiveMergeSort.sort(arr);

        System.out.print("after : " + Arrays.toString(arr));

        /*Integer[] arr1 = RandomArrayCreator.intArr(1000000);
        Integer[] arr2 = arr1.clone();
        Integer[] arr3 = arr1.clone();
        Integer[] arr4 = arr1.clone();


        long time1 = System.currentTimeMillis();
        Thread.sleep(300);
        RecursiveMergeSort.sort(arr1);
        long time1end = System.currentTimeMillis();

        long t1 = time1end - time1 - 300;


        long time2 = System.currentTimeMillis();
        Thread.sleep(300);
        MedianOfThreeQuickSort.sort(arr2);
        long time2end = System.currentTimeMillis();

        long t2 = time2end - time2 - 300;


        long time3 = System.currentTimeMillis();
        Thread.sleep(300);
        Arrays.sort(arr3);
        long time3end = System.currentTimeMillis();

        long t3 = time3end - time3 - 300;


        long time4 = System.currentTimeMillis();
        Thread.sleep(300);
        RecursiveQuickSort.sort(arr4);
        long time4end = System.currentTimeMillis();

        long t4 = time4end - time4 - 300;

        System.out.println(t1 + " : " + t2 + " : " + t3 + " : " + t4);*/
    }
/*
    public static void nonSleep(int size) throws Exception {
        Integer[] arr1 = RandomArrayCreator.intArr(size);
        Integer[] arr2 = arr1.clone();

        long time1 = System.currentTimeMillis();
        HeapSort.sort(arr1);
        long time1end = System.currentTimeMillis();

        long t1 = time1end - time1;

        long time2 = System.currentTimeMillis();
        HeapSort.sort(arr2);
        long time2end = System.currentTimeMillis();

        long t2 = time2end - time2;

        System.out.println(t1 + " : " + t2);
    }

    public static void sleep(int size) throws Exception {
        Integer[] arr1 = RandomArrayCreator.intArr(size);
        Integer[] arr2 = arr1.clone();

        long time1 = System.currentTimeMillis();
        Thread.sleep(3000);
        HeapSort.sort(arr1);
        long time1end = System.currentTimeMillis();

        long t1 = time1end - time1 - 3000;

        long time2 = System.currentTimeMillis();
        Thread.sleep(3000);
        HeapSort.sort(arr2);
        long time2end = System.currentTimeMillis();

        long t2 = time2end - time2 - 3000;

        System.out.println(t1 + " : " + t2);
    }
 */
}