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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException{
        
       // input dengan objek 'isi'
       BufferedReader isi = new BufferedReader(new InputStreamReader(System.in));
      
      int pil = 0;
      
       //kelas sebelah
       gaji gajian = new gaji();
      
       //ingin perulangan
       String pi;
       String pi1 = "ya";
       String pila;
       String pila1 = "ya";
       
      // memakai while untuk perulangan input
      while(pil == gajian.getgolongan()){
       
     do{
          
       //masukan nip
       System.out.print("masukan nip anda :");
       gajian.setnip(isi.readLine());
       
       //masukan nama
       System.out.print("masukan nama anda :");
       gajian.setnama(isi.readLine());
       
       //masukan golongan
       System.out.print("masukan golongan anda :");
       gajian.setgolongan(Integer.parseInt(isi.readLine()));
       
      
       if(gajian.getgolongan()== 1 || gajian.getgolongan() == 2 || gajian.getgolongan()== 3){
            do{
       System.out.println("=== Menu Gaji ===");
       System.out.println("1. Gaji Pokok");
       System.out.println("2. Tunjangan");
       System.out.println("3. Total");
       System.out.println("4. Tampilan Data");
       System.out.print("masukan pilihan :");
       pil = Integer.parseInt(isi.readLine());
       switch(pil){
           case 1 : 
                 System.out.print(" gaji anda sebesar : ");  gajian.banding(gajian.getgolongan(), gajian.getgajinya());
//                 gajian.banding();;
                 break;
           case 2 : 
//               double tunjangan = 0;
//               tunjangan = 0.05*gajian.banding(pil)
                System.out.print("tunjangan anda sebesar :"); 
//                gajian.banding(gajian.getgolongan(), gajian.getgajinya()*0.05);
                gajian.isitunjangan(gajian.getgolongan(),gajian.gettunjangan(), gajian.getgajinya());
//               isi.gettunjangan();
               break;
           case 3 : 
               System.out.print("total gaji anda sebesar :");   gajian.akhirnya(gajian.getgolongan(), gajian.getgajinya(), gajian.gettunjangan(),gajian.gettotal());
//               baru.gettotal();
               break;
           case 4 :
               System.out.println("nip     :"+gajian.getnip());
               System.out.println("nama   :"+gajian.getnama());
               System.out.println("golongan :"+gajian.getgolongan());
               System.out.print("gaji pokok :"); gajian.banding(gajian.getgolongan(), gajian.getgajinya());
               System.out.print("\ntunjangan :");gajian.isitunjangan(gajian.getgolongan(), gajian.getgajinya(), gajian.gettunjangan());
               System.out.print("\ntotal gaji :");gajian.akhirnya(gajian.getgolongan(),gajian.getgajinya(),gajian.gettunjangan(), gajian.gettotal());
               break;
//           case 5 :
//               
//                    break;
           default : System.out.println("nomor yang anda masukan salah!");
                        break;
       }
    System.out.println("\n\n apakah anda ingin mengulang Menu Gaji???\n (ketik 'ya' | abaikan 'enter')");
       pi = isi.readLine();
       }while(pi.equals(pi1));
       
    }else{
    System.out.println("golongan invalid!!!!!");
        }
       
      System.out.println("\n apakah anda ingin mengulang pengisian ?? \n (ketik ya |berhenti 'enter')");
        pila =isi.readLine();
      }while(pila.equals(pila1));
      }
    }
}

