/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class menu_gaji {
    public static void main(String[] args) throws IOException{
        
        //kelas sebelah
       gaji baru = new gaji();   
       
       // input
       BufferedReader isi = new BufferedReader(new InputStreamReader(System.in));
       
       //masukan nip
       System.out.print("masukan nip anda :");
       baru.setnip(isi.readLine());
       
       //masukan nama
       System.out.print("masukan nama anda :");
       baru.setnama(isi.readLine());
       
       //masukan golongan
       System.out.print("masukan golongan anda :");
       baru.setgolongan(isi.readLine());
      
       int pil = 0;
        while(pil < 5){
       System.out.println("=== Menu Gaji ===");
       System.out.println("1. Gaji Pokok");
       System.out.println("2. Tunjangan");
       System.out.println("3. Total");
       System.out.println("4. Tampilan Data");
       System.out.println("masukan pilihan :");
       pil = isi.read();
       switch(pil){
           case 1 : 
                 System.out.println(" gaji anda sebesar : "+baru.banding());
//                 baru.banding();
                 break;
           case 2 : 
               System.out.println("tunjangan anda sebesar :"+baru.gettunjangan());
               baru.gettunjangan();
               break;
           case 3 : 
               System.out.println("total gaji anda sebesar :"+baru.gettotal());
               baru.gettotal();
               break;
           case 4 :
               System.out.println("nip     :"+baru.getnip());
               System.out.println("nama   :"+baru.getnama());
               System.out.println("golongan :"+baru.getgolongan());
               System.out.println("gaji pokok :"+baru.banding());
               System.out.println("tunjangan :"+baru.gettunjangan());
               System.out.println("total gaji :"+baru.gettotal());
               break;
           default : System.out.println("nomor yang anda masukan salah!");
       }
    
    }
  }
   
    
}
