/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia260523;

/**
 *
 * @author HP
 */
public class contoh extends studentRecord {
   public static void main(String[] args)  {
         studentRecord data2 = new studentRecord("===Data Mahasiswa===");
         studentRecord data = new studentRecord("ucup", "padang");
         studentRecord data3 = new studentRecord(80,90,78);
         
         //menampilkan judul menggunakan constructor 1 parameter
         System.out.println(data2.name+"\n");
         
         // menampilkan data dari constructor 2 parameter kelas studnetRecord
         System.out.println("Nama   :"+data.name);
         System.out.println("Alamat :"+data.address+"\n");
         
         // menampilkan nilai dengan constructor
         System.out.println("Nilai matematika : "+data3.mathGrade);
         System.out.println("Nilai Science    : "+data3.scienceGrade);
         System.out.println("Nilai English : "+data3.englishGrade+"\n");
         
        //menggunakan method name, dengan objek data
        data.setName("Abay Ramadhan");
        // panggil
        System.out.println("Nama : "+data.getName());
        //menggunakan method age
        data.setage(19);
        //panggil
        System.out.println("Umur : "+data.getage());
        // menggunakan method address
        data.setaddress("Pariaman");
        //panggil
        System.out.println("Alamat : "+data.getaddress()+"\n");
        
         
   }
}
