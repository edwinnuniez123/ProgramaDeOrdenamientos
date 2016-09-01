/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class InsertSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner r2 = new Scanner( System.in );  
         Random r = new Random();
        int n,i;
        System.out.println("Ingrese el numero de elementos:");
          n = r2.nextInt();
        
        int input[]= new int[n];
         System.out.println("\nEntrada "+ n +" elementos");
         
         for (i = 0; i < n; i++)
            input[i] = r.nextInt(1000);
        insertionSort(input);

    }
    
     private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.print("\n");
    }
 
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }

    
}
