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
public class compare {
    public static void main(String[] args, Object moe){
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        if(nama.equals(moe)) System.out.println("you are king of rock and roll");
        else System.out.println("you are not king!");
    }
}
