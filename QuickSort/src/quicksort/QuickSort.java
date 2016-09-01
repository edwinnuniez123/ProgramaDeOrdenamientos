/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Edwin
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
		
                Scanner r2 = new Scanner( System.in );  
                Random r = new Random();
                int n;
                System.out.println("Ingrese el numero de elementos:");
                n = r2.nextInt();
                int[] x = new int[n];
                System.out.println("\nEntrada "+ n +" elementos");
                 for (int i = 0; i < n; i++)
                   x[i] = r.nextInt(100);
		System.out.println(Arrays.toString(x));
 
               
                  
		int low = 0;
		int high = x.length - 1;
                 for (int i = 0; i < n; i++)
                    quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
                
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
    
}
