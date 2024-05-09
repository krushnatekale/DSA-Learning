package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingDriver {
    public static void main(String[] args) {

        //performed linear search on integer array
        int[] arr = {12,2,3,4,23,4,55,6};
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter integer Key : ");
        int key = new Scanner(System.in).nextInt();
        result(LinearSearch.search(arr,key));

        //Performed linear Search on char array
        char[] arrChar = {'e','r','y','i','e'};
        System.out.println(Arrays.toString(arrChar));
        System.out.print("Enter char Key : ");
        char keyChar = new Scanner(System.in).next().charAt(0);
        result(LinearSearch.search(arrChar,keyChar));

    }

    public static void result(int result){
        if(result != -1){
            System.out.println("Element is at Location " + result);
        }else {
            System.out.println("Element Not Present");
        }
    }
}
