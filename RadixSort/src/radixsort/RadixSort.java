/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class RadixSort {

    /**
     * @param args the command line arguments
     */
   
        public static void sort(int[] a)
        {
            int i, m = a[0], exp = 1, n = a.length;
            int[] b = new int[1000000];
            for (i = 1; i < n; i++)
                if (a[i] > m)
                    m = a[i];

            while (m / exp > 0)
            {
                int[] bucket = new int[10];
                for (i = 0; i < n; i++)
                    bucket[(a[i] / exp) % 10]++;

                for (i = 1; i < 10; i++)
                    bucket[i] += bucket[i - 1];

                for (i = n - 1; i >= 0; i--)
                    b[--bucket[(a[i] / exp) % 10]] = a[i];

                for (i = 0; i < n; i++)
                    a[i] = b[i];

                exp *= 10;        

            }

        }    
    
    public static void main(String[] args) {
        // TODO code application logic here
       /* int []a1={4,1,3,2,16,9,10,14,8,7};
        radixsort(a1);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i] + " ");
        }*/
        Scanner r2 = new Scanner( System.in );   
        Random r = new Random();
        System.out.println("Radix Sort Test\n");

        int n, i;

        /** Accept number of elements **/
        System.out.println("Enter number of integer elements");
        n = r2.nextInt();

        /** Create integer array on n elements **/
        int arr[] = new int[ n ];

        /** Accept elements **/
        System.out.println("\nEnter "+ n +" integer elements");

        for (i = 0; i < n; i++)
            arr[i] = r.nextInt(10000);

        /** Call method sort **/

        sort(arr);

        /** Print sorted Array **/

        System.out.println("\nElements after sorting ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        
        System.out.println();                     
    }
    
}
