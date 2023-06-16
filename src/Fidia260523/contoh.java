/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia260523;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contoh extends studentRecord {
   public static void main(String[] args) throws IOException  {
       
         studentRecord data2 = new studentRecord("===Data Mahasiswa===");
         studentRecord data = new studentRecord("ucup", "padang");
         studentRecord data3 = new studentRecord(80,90,78);
         
         //menampilkan judul menggunakan constructor 1 parameter
         System.out.println(data2.name+"\n");
//         System.out.println("==============");
         
         // menampilkan data dari constructor 2 parameter kelas studnetRecord
         System.out.println("Nama   :"+data.name);
         System.out.println("Alamat :"+data.address+"\n");
         System.out.println("==========================");
         
         // menampilkan nilai dengan constructor
         System.out.println("Nilai matematika : "+data3.mathGrade);
         System.out.println("Nilai Science    : "+data3.scienceGrade);
         System.out.println("Nilai English : "+data3.englishGrade+"\n");
         System.out.println("=========================================");
         
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
        System.out.println("==================================");
        
        // pakai input type
        studentRecord isi = new studentRecord();
        BufferedReader tem = new BufferedReader(new InputStreamReader(System.in));
        
        
        // data output
        System.out.println("==== Data Input Anda ====");
        // masukan data
        //nama
        System.out.println("masukan nama anda??");
        isi.setName(tem.readLine());
//        String nam = tem.readLine();
        //alamat
        System.out.println("masukan alamat anda??");
        isi.setaddress(tem.readLine());
//        String alam = tem.readLine();
        //umur
        System.out.println("masukan umur anda??");
        isi.setage(Integer.parseInt(tem.readLine()));
//        int umu = Integer.parseInt(tem.readLine());
        // mathGrade
        System.out.println("masukan nilai matematika anda?? ");
        isi.setmathGrade(Double.parseDouble(tem.readLine()));
        //scieceGrade
        System.out.println("masukan nilai science anda?? ");
        isi.setscienceGrade(Double.parseDouble(tem.readLine()));
        //englishGrade
        System.out.println("masukan nilai english anda?? ");
        isi.setenglishGrade(Double.parseDouble(tem.readLine()));
        
        
        // tampil data
        System.out.println("==== Tampilan Data Anda====");
        System.out.println("- Nama :"+isi.getName());
        System.out.println("- Alamat :"+isi.getaddress());
        System.out.println("- Umur : "+isi.getage());
        System.out.println("- Nilai Math : "+isi.getmathGrade());
        System.out.println("- Nilai Science : "+isi.getscienceGrade());
        System.out.println("- Nilai Eglish : "+isi.getenglishGrade());
        System.out.println("Rata-rata : "+isi.getaverage());
        System.out.println("Prediket Nilai : "+isi.getnilai());
        
   }
}
