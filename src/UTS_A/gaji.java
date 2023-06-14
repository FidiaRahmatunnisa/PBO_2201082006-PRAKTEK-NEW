/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A;

/**
 *
 * @author HP
 */
public class gaji {
    private String nip;
    private String nama;
    private String golongan;
    private double gaji_pokok;
    private double tunjangan;
    private double total;
    private static int gajitambah;
//    private int banding;
    
    public gaji(){
        gajitambah++;
    }
    
    //untuk nip
    public String getnip(){
        return nip;
    }
    public void setnip(String nip){
        this.nip = nip;
    }
   
    // untuk nama
   public String getnama(){
       return nama;
   }
   public void setnama(String nama){
       this.nama = nama;
   }
   
   //untuk golongan
   public String getgolongan(){
       return golongan;
   }
   public void  setgolongan(String golongan){
       this.golongan = golongan;
   }
   
   //banding golongan
   public double banding(String golongan){
       if(null==golongan)System.out.println("golongan invalid!");
       else switch (golongan) {
            case "3A":
                gaji_pokok = 1000000;
                System.out.println(" gaji anda sebesar : Rp.1.000.000");
                break;
            case "3B":
                gaji_pokok = 2000000;
                System.out.println("gaji anda sebesar : Rp.2.000.000");
                break;
            case "3C":
                gaji_pokok = 3000000;
                System.out.println("gaji anda sebesar : Rp.3.000.000");
                break;
            default:
                System.out.println("golongan invalid!");
                break;
        }
     
       return  gaji_pokok;
   }
   
   //untuk gaji pokok
//   public double getgajipokok(){
//       return gaji_pokok;
//   }
   
   // untuk tunjangan
   public double gettunjangan(){
       tunjangan = 0.05*gaji_pokok;
       return tunjangan;
   }
   
   public double gettotal(){
       total = gaji_pokok + tunjangan;
       return total;
   }

    String banding() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

