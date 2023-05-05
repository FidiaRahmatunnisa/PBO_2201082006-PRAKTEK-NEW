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
public class suhu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan suhu(Fahrenheit) : ");
        double suhu = input.nextDouble();
        
        double convert = 5*(suhu-32)/9;
        System.out.println("suhu dalam celcius : "+convert);
    }
}
