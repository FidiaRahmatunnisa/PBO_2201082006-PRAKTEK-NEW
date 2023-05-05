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
import java.io.IOException;
import javax.swing.JOptionPane;
        
public class tryAndCath {

    private static boolean errMsg;
    
    public static void main(String[] args){
        int a = 100, res;
        try{
            Scanner isi = new Scanner(System.in);
            System.out.print("masukan nilai dari b : ");
            int b = isi.nextInt();
            System.out.print("masukan nilai dari c : ");
            int c = isi.nextInt();
            res = 10 /(b-c);
            System.out.println("the result : "+res);
            
        }
        catch(Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }
        System.out.println("after cacth block");
    }
}
