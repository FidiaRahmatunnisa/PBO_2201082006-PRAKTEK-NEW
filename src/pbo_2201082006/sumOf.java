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
public class sumOf {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        int angka,i = 0;
        int total =0;
        do{
            System.out.print("masukan angka : ");
            angka = isi.nextInt();
            i++;
            total = total+angka;
        }while(i<10);
        System.out.println("sum of "+i+" = "+total);
    }
}
