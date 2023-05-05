/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class perkalian7 {
    public static void main(String[]  args){
        Scanner isi = new Scanner(System.in);
        System.out.print("masukan angka : ");
        int angka = isi.nextInt();
        for(int i=1;i<=angka;i++){
            System.out.println("7 x "+i+" = "+7*i);
        }
    }
}
