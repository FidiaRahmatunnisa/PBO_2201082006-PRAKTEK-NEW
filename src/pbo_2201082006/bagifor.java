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
public class bagifor {
    public static void main(String[] args){
        System.out.println("Perpangkatan 2 naik");
        for(int i=1;i<7;i++){
            int b = (int) Math.pow(2,i);
            System.out.println("nilai :"+b);
        }
        System.out.println("Perpangkatan 2 turun");
        for(int i=6;i>=1;i--){
            int c = (int) Math.pow(2,i);
            System.out.println("nilai : "+c) ;
        }
        System.out.println("naik 6 angka");
        for(int i=0;i<=5;i++){
            System.out.println("nilai :"+i);
        }
        System.out.println("turun 6 angka");
        for(int i=5;i>=0;i--){
            System.out.println("nilai : "+i);
        }
    }
}
