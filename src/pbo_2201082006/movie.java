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
public class movie {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        System.out.println(" -------------");
        System.out.println("|  Tiket Film |\n -------------\n "
                + "ex: harga:$12-$20 \n    rate 5-10 \n ============");
        System.out.print("harga tiket : $");
         int tiket = isi.nextInt();
        System.out.print("moving rate : ");
         int rate = isi.nextInt();
         
         if(tiket>=12 || rate==5) 
             System.out.println("i'm interested in watching the movie");
         else System.out.println("i'm not interested in wathcing the movie");
    }
}
