/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.lang.Math;
import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        Scanner inBadan = new Scanner(System.in);
        System.out.print("masukan berat badan anda : ");
        double berat = inBadan.nextDouble();
        
        Scanner inTinggi = new Scanner(System.in);
        System.out.print("masukan tinggi badan anda : ");
        double tinggi = inTinggi.nextDouble();
        
        double bmi=0;
        bmi =Math.round((berat/(Math.pow(tinggi,2)))*703);
        System.out.println("body mass index anda : "+bmi);
    }
}
