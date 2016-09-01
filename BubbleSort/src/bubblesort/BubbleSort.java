/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, c, d, swap;
        Scanner in2 = new Scanner(System.in);
        Random in = new Random();
        System.out.println("Ingrese el numero de elementos:");
        n = in2.nextInt();

        int array[] = new int[n];

        System.out.println("Entrada " + n + " elementos");

        for (c = 0; c < n; c++) 
          array[c] = in.nextInt(10);

        for (c = 0; c < ( n - 1 ); c++) {
          for (d = 0; d < n - c - 1; d++) {
            if (array[d] > array[d+1]) /* For descending order use < */
            {
              swap       = array[d];
              array[d]   = array[d+1];
              array[d+1] = swap;
            }
          }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < n; c++) 
          System.out.println(array[c]);
        }
    
    
}
