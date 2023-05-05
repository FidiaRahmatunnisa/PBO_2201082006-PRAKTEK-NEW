/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.util.Random;
import java.util.Scanner;
public class flipcoin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("masukan angka anda : ");
        int angka = in.nextInt();
        
        Random rand = new Random();
        int random = rand.nextInt(20);
        
        System.out.println("angka lotre anda : "+angka);
        System.out.println("lotre pemenang : "+random);
    }
}
