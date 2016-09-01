/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class SelectSort {

    /**
     * @param args the command line arguments
     */
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
      
        Scanner r2 = new Scanner( System.in ); 
        Random r = new Random();
        int n;
        System.out.println("Ingrese el numero de elementos:");
        n = r2.nextInt();
        int[] arr1= new int[ n ];
        
        System.out.println("\nEntrada "+ n +" elementos");

        for (int i = 0; i < n; i++)
            arr1[i] = r.nextInt(1000000);
        
        int[] arr2= doSelectionSort(arr1);
        
        for(int i:arr2){
            System.out.print(i);
            System.out.println(" ");
        }
    }
    
}
