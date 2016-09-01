/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
     private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    
    public static void buildheap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxheap(a,i);
        }
    }
    
    public static void maxheap(int[] a, int i){ 
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }
        
        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxheap(a, largest);
        }
    }
    
    public static void exchange(int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t; 
        }
    
    public static void sort(int []a0){
        a=a0;
        buildheap(a);
        
        for(int i=n;i>0;i--){
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r2 = new Scanner(System.in);
        Random r = new Random();
        int n,i;
        System.out.println("Ingrese el numero de elementos:");
          n = r2.nextInt();
         
        int a1[]= new int[n];
        
         System.out.println("\nEntrada "+ n +"elementos");
         
         for (i = 0; i < n; i++)
            a1[i] = r.nextInt(1000000);
        sort(a1);
        for( i=0;i<a1.length;i++){
            System.out.println(a1[i] + " ");
        }
    }
    
}

