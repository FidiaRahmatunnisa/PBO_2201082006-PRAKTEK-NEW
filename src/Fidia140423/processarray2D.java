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

public class processarray2D {
    public static void main(String[] args){
        int[][] a;
        int b,k,i,j;
        int jum;
        int max,imax,jmax;
        double rata;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("baris = ");
        b = in.nextInt();
        System.out.print("kolom = ");
        k = in.nextInt();
        a = new int[b][k];
        
        //mengisi array 2D
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                a[i][j] = rand.nextInt(10);
            }
        }
        
        //proses array 2d
        jum = 0;
        rata = 0;
        max = a[0][0];
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
               jum = jum + a[i][j];
               if(a[i][j]>max){
                   max = a[i][j];
                   imax = i;
                   jmax = j;
               }
            }
        }
        rata = (double) jum /(b*k);
        //menampilkan isi array 2D
        System.out.println("== isi array 2 dimensi ==");
        for(i=0;i<b;i++){
            for(j=0;j<k;j++){
                System.out.println(a[i][j]+"\t");
            }
        }
    }
}
