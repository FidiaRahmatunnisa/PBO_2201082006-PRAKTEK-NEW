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
    private int golongan;
    public double gaji_pokok;
    private double tunjangan;
    private double total;
    private static int tambah;
//    private int banding;
    
    public gaji(){
        tambah++;
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
   public int getgolongan(){
       return golongan;
   }
   public void  setgolongan(int golongan){
       this.golongan = golongan;
   }
   
   // gajinya
   public double getgajinya(){
       return gaji_pokok;
   }
   public void setgajinya(double gajinya){
       this.gaji_pokok = gajinya;
   }
   
   //banding golongan
   public double banding(int golongan, double gajinya){  // bagaimana cara mengolah ini , sehingga tunjangan, total dsb dipanggil saja dari ini
       
       switch (golongan) {
            case 1:
                gajinya = 1000000;
//                System.out.print(gajinya);
                break;
            case 2:
                gajinya = 2000000;
//                System.out.print(gajinya);
                break;
            case 3:
                gajinya = 3000000;
//                System.out.print(gajinya);
                break;
            default:
                System.out.println("golongan invalid!");
                break;
        }
       System.out.print(gajinya);
       return  gaji_pokok;    // bagian ini nggk ngaruh
//       return tunjangan;  // ini juga nggk ngaruh
   }
   
   //untuk gaji pokok
//   public double getgajipokok(){
//       return gaji_pokok;
//   }
   
   // untuk tunjangan
   public double gettunjangan(){
//       tunjangan = 0.05*this.getgolongan();
//       return tunjangan;
        return tunjangan;
   }
   
   public void settunjagan(double tunjangan1, double gajinya){
            
//       this.tunjangan = tunjangan;
//       tunjangan = 0.05*this.getgolongan();
        this.tunjangan = tunjangan1 ;  // nggk ngaruh 
   }
   
   public double isitunjangan(int golongan,double tunjangan1,double gajinya){
       switch(golongan){
           
                case 1 :gajinya = 1000000; 
                        tunjangan1 = gajinya*0.05;
//                        System.out.println(tunjangan1);
                        break;
                case 2 : gajinya = 2000000; 
                        tunjangan1 = gajinya*0.05;
                        break;
                case 3 : gajinya = 3000000; 
                        tunjangan1 = gajinya*0.05;
                        break;
                default : System.out.print("tunjangan invalid!");
            }
       System.out.print(tunjangan1);
       
//       tunjangan1 = gajinya;
//       System.out.print(tunjangan1);
       return tunjangan;  //nggk ngaruh
   }
   
   // total
   public double akhirnya(int golongan,double gajinya, double tunjangan1,double totalnya){
//       totalnya = this.golongan;
         switch (golongan) {
            case 1:
                gajinya = 1000000;
                break;
            case 2:
                gajinya = 2000000;
                break;
            case 3:
                gajinya = 3000000;
                break;
            default:
                System.out.println("golongan invalid!");
                break;
        }
      tunjangan1 = gajinya*0.05;
      totalnya = gajinya + tunjangan1;
       System.out.print(totalnya);
       
       return total;
   }
   
   public void settotal(double totalnya){
       this.total = totalnya;
   }
   
   public double gettotal(){
//       this.total = this.gaji_pokok + this.tunjangan;
//       System.out.print(this.total);
       return total;
   }

   

}

