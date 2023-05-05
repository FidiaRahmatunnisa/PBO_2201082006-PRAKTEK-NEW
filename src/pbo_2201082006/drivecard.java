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
public class drivecard {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Persyaratan Mengemudi!");
        System.out.print("masukan umur anda : ");
        int umur = in.nextInt();
        
        if(umur>=18) System.out.println("anda diumur yang legal untuk membawa kendaraan!");
        else System.out.println("anda dilarang membawa kendaraan karena masih dibawah umur!");
    }
}
