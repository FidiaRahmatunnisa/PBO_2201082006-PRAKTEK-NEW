/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.util.*;
public class nilaiTerbesarb {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah angka:");
        int jumlah = input.nextInt();
        int[] angka = new int[jumlah];
        System.out.print("masukan angka:");
        for(int i=0; i<jumlah; i++){
            angka[i] = input.nextInt();
        }
        Arrays.sort(angka);
        for(int index:angka){
            System.out.println(index);
        }
    }
}
