package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr= new int[3][2];
        int[][] arr2D={
                {1,2,4,6},  //0th index
                {4,54,2},   //1stindex
                {12,54,1,5} //2nd index
        };
        System.out.print(arr2D[0].length);
        for(int row=0;row<arr.length;row++){
            for(int i=0;i<arr[row].length;i++){
                arr[row][i]=input.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int i=0;i<arr[row].length;i++){
                System.out.print(arr[row][i] +" ");
            }
            System.out.println(" ");
        }



    }
}
