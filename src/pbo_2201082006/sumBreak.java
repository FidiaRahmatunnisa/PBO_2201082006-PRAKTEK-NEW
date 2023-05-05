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
public class sumBreak {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        int angka, total =0;
        for(int i=0;i<10;i++){
            System.out.print("masukan angka : ");
            angka = isi.nextInt();
            if(angka == 0){
                System.out.println("invalid number: "+angka+" !!");
                break;
            }
            else{
                total = total + angka;
            }
           
        }
        System.out.println("total angka : "+total);
    }
}
