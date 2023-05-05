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
public class hipotenusa {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("  Program Segitiga \n (dalam satuan cm) \n");
        System.out.print("masukan nilai sisi tegak : ");
        int a = in.nextInt();
        System.out.print("masukan nilai sisi rebah : ");
        int b = in.nextInt();
        
        double  c;
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("nilai sisi miringny adalah : "+c);
        
    }
}
