package com.kole;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] returnedArray = getIntegers(5);
        printIntegers(returnedArray);
        //System.out.println(calcAverage(returnedArray));
        System.out.println("***************");
        Arrays.sort(returnedArray);

        printIntegers(returnedArray);
    }

    public static int[] getIntegers (int number){
        System.out.println("Enter " + number + " integers: \r");
        int[] tempArray = new int[number];
        for (int i = 0; i<tempArray.length;i++){
            tempArray[i] = scanner.nextInt();
        }
        return tempArray;
    }

    public static void printIntegers(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.println("Position " + (i+1) + " in array is " + array[i]);
        }
    }

    public static double calcAverage(int [] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        } return (double) sum / (double) array.length;
    }


}
