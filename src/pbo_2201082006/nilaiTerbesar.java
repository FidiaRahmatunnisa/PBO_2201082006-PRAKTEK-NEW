/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class nilaiTerbesar {
    public static void main(String[] args) throws IOException{
        BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("masukan banyak angka:");
        int banyak_angka = Integer.parseInt(nilai.readLine());
        System.out.println("banyak angka:"+banyak_angka);
        for(int i=0;i<banyak_angka;i++){
            System.out.print("angka : ");
            int angka = Integer.parseInt(nilai.readLine());
            System.out.println(angka);
        }
    }
    
}
