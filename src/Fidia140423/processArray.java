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

public class processArray {
    public static void main(String[] args){
        int[] nilai;// deklarasi array
        int n,i,sum;
        double rata;
        int max,min,imin,imax;
        Random rand = new Random();
        
        Scanner in = new Scanner(System.in);
        System.out.print("masukan banyak data : ");
        n = in.nextInt(); // input ukuran array
        nilai = new int[n];//membuat array ukuran n
        //mengisi array
        for(i=0;i<n;i++){
            System.out.print("niali ke-"+(i+1)+"=");
            nilai[i]=rand.nextInt(100);
        }
        //proses isi array
        sum = nilai[0];
        max = nilai[0];
        imax = nilai[0];
        min = nilai[0];
        imin = nilai[0];
        
        //nilai max dan nilai min
        for(i=1;i<n;i++){
            sum = sum+ nilai[i];
            if(nilai[i]>max){
                max = nilai[i];
                imax = i;
            }
            if(nilai[i]<min){
                min= nilai[i];
                imin = i;
            }
        }
        // mencari rata-rata
        rata = (double)sum/n;
        //menampilkan isi array
        System.out.println("===daftar nilai===");
        for(i=0;i<n;i++){
            System.out.println("nilai ke-"+(i+1)+"="+nilai[i]);
        }
        // array satu dimensi
        //int[] bil = {4,5,6,7};
        System.out.println("jumlah nilai: "+sum);
        System.out.println("rata-rata nilai: "+rata);
        System.out.println("nilai terbesar adalah nilai ke-"+(imax+1));
        System.out.println("nilai tebesar : "+max);
        System.out.println("nilai terkecil adalah nilai ke-"+(imin+1));
        System.out.println("nilai terkecil : "+min);
    }
}
