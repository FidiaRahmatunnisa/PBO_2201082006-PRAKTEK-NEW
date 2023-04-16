/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia140423;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Random;

public class bubblesort {
    public static void main(String[] args){
        
 int[] data;
 int n,i,j,temp;
 
 Scanner in = new Scanner(System.in);
 Random rand = new Random();
 
 System.out.print("banyak data : ");
 n = in.nextInt();
 data = new int[n];
 
 //mengisi array
 System.out.println("===isi array sebelum diurutkan===");
 for(i=0;i<n;i++){
     data[i] = rand.nextInt(100);
     //int enter = i%10;
     System.out.print(data[i]+"\t");
     //if(i!=0 && enter==0){
       //System.out.println();   
     }

//bubble sort
     for(i=0;i<n;i++){
         for(j=n-1;j>i;j--){
             if(data[j]<data[j-1]){// tukar 
                 temp = data[j];
                 data[j]= data[j-1];
                 data[j-1] = temp;
             }
         }
     }
     
     System.out.println("\n");
     System.out.println("== isi array setelah diurutkan ==");
     for(i=0;i<n;i++){
         System.out.print(data[i]+"\t");
     }
 }
        
}

