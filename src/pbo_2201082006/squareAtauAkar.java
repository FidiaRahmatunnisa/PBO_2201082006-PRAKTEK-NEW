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
import java.lang.Math;
public class squareAtauAkar {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        System.out.print("masukan angka (akar dari) : ");
        int angka = isi.nextInt();
        if(angka>=0)
            System.out.println("akar dari "+angka+" : "+Math.sqrt(angka));
        else{
            System.out.println("invalid number!!");
            System.out.print("masukan angka : ");
            angka = isi.nextInt();
            System.out.println("akar dari "+angka+" : "+Math.sqrt(angka));
        }
        }
    }

