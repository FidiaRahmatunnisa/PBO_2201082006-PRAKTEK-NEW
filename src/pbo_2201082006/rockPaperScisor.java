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
public class rockPaperScisor {
   public static void main(String[] args){
       Random ran = new Random(20L);
       System.out.println("random 1 : "+ran.nextInt(100));
       System.out.println("random 2 : "+ran.nextInt(100));
       System.out.println("random 3 : "+ran.nextInt(100));
       
       System.out.println("change the seed about sequence");
       ran.setSeed(5L);
       System.out.println("random 4 : "+ran.nextInt(100));
       System.out.println("random 5 : "+ran.nextInt(100));
       System.out.println("random 6 :"+ran.nextInt(100));
       
       System.out.println("change the seed about sequence");
       ran.setSeed(20L);
       System.out.println("random 7 : "+ran.nextInt(100));
       System.out.println("random 8 :"+ran.nextInt(100));
       System.out.println("random 9 : "+ran.nextInt(100));
   }
}
