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
import java.util.Random;
public class flipcoin_b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka anda : ");
        int angka = input.nextInt();
        
        Random rand = new Random();
        int random = rand.nextInt(100);
        
        System.out.println("angka lotre anda : "+angka);
        System.out.println("lotre pemenang : "+random);
        if(angka==random) System.out.println("selamat anda menang!!");
        else System.out.println("anda tidak beruntung!!");
    }
}
