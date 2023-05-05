/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.lang.Math;
public class math2 {
    public static void main(String[] args){
        double res1 = Math.abs(-1.23);
        System.out.println("nilai absis : "+res1);
        
        double res2 = Math.pow(3,2);
        System.out.println("nilai dar 3 pangkat 2 : "+res2);
        
        double res3 = Math.sqrt(121.0)- Math.sqrt(256.0);
        System.out.println("hasil dari akar 121 - akar 256 ; "+res3);
        
        double res4 = Math.abs(Math.max(-3, -5));
        System.out.println("nilai absis dari nilai minimal : "+res4);
    }
}
