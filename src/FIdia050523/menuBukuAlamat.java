/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIdia050523;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class menuBukuAlamat {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        dataBukuAlamat data = new dataBukuAlamat();
        int pil=0;
        try{
            while(pil!=5){
                System.out.println("1. input data");
                System.out.println("2. hapus data");
                System.out.println("3. update data");
                System.out.println("4. tampilkan data");
                System.out.print("pilihan anda : ");
                pil = Integer.parseInt(dataIn.readLine());
                switch(pil){
                    case 1 : bukuAlamat temp = new bukuAlamat();
                              System.out.print("nama               :");
                              temp.setNama(dataIn.readLine());
                              System.out.print("alamat             :");
                              temp.setAlamat(dataIn.readLine());
                              System.out.print("nomor Telepon      :");
                              temp.setNomor(dataIn.readLine());
                              System.out.print("email              :");
                              temp.setEmail(dataIn.readLine());
                              data.insert(temp);
                              break;
//                    case 2 :  System.out.println("nama               :");
//                              System.out.println("alamat             :");
//                              System.out.println("nomor Telepon      :");
//                              System.out.println("email              :");
//                              break;
//                    case 3 :  
                        //System.out.print("Masukkan nama untuk mencari data yang akan diupdate: ");
//                        String namaUpdate = dataIn.readLine();
    
                        // Mencari data berdasarkan nama
//                            bukuAlamat dataToUpdate = data.getDataByNama(namaUpdate);
//    
//                    //if (dataToUpdate != null) {
//                        System.out.println("Data ditemukan. Silakan masukkan data baru untuk update.");
//                        System.out.print("Nama baru           : ");
//                        String newNama = dataIn.readLine();
//                        System.out.print("Alamat baru         : ");
//                        String newAlamat = dataIn.readLine();
//                        System.out.print("Nomor Telepon baru  : ");
//                        String newNomor = dataIn.readLine();
//                        System.out.print("Email baru          : ");
//                        String newEmail = dataIn.readLine();
//        
//                        // Update data
//                        dataToUpdate.setNama(newNama);
//                        dataToUpdate.setAlamat(newAlamat);
//                        dataToUpdate.setNomor(newNomor);
//                        dataToUpdate.setEmail(newEmail);
        
                        //System.out.println("Data berhasil diupdate.");
//                    } else {    
//                        System.out.println("Data tidak ditemukan.");
//                    }
//                        break;        
           
                    case 4 : bukuAlamat[] list = data.getAll();
                            int i = 0;
                            for (bukuAlamat list1 : list) {
                              System.out.println("buku alamat ke---> "+(i+1));
                              System.out.println("nama            :" + list1.getNama());
                              System.out.println("alamat          :" + list1.getAlamat());
                              System.out.println("nomor telepon   :" + list1.getNomor());
                               System.out.println("email           : " + list1.getEmail());
                            break;
                    }
                    default : System.out.println("Nomor yang anda masukan tidak sesuai");

                }
            }
        }
        catch(IOException | NumberFormatException ex){
            
        }
    }
}
