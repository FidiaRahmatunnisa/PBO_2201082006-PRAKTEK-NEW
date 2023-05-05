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
public class fare {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        
        System.out.println("  ==Tarif Masuk===  ");
        System.out.print("masukan umur anda : ");
        int umur = isi.nextInt();
        
        if(umur<=0) System.out.println("kesalahan input!");
        else
        {
        if(umur<=11) System.out.println("tarif anda :$3");
        else if (umur>11 && umur<65) System.out.println("Tarif anda :$5");
        else System.out.println("Tarif anda :$3");
        }
    }
}
