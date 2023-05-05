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
public class dadu {
    public static void main(String[] args){
        Random ran = new Random();
        int random = ran.nextInt(6)+1;
        System.out.println("nilai keluar pada dadu 1 : "+random);
        
        int random2 = ran.nextInt(6)+1;
        System.out.println("nilai keluar pada dadu 2 : "+random2);
        
        int hasil;
        hasil = random+random2;
        System.out.println("jumlah nilai  kedua dadu : "+hasil);
    }
}
