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
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));  // input
        dataBukuAlamat data = new dataBukuAlamat();    // template pola insert, update, delete, tampil
        int pil=0;
        try{
            while(pil!=5){
               
                bukuAlamat temp = new bukuAlamat();   // template asal
                
                System.out.println("1. input data");
                System.out.println("2. hapus data");
                System.out.println("3. update data");
                System.out.println("4. tampilkan data");
                System.out.print("pilihan anda : ");
                pil = Integer.parseInt(dataIn.readLine());
                
                 int i = 0;
                switch(pil){
                    case 1 : 
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
                    case 2 :  System.out.println("masukan data keberapa yang ingin anda hapus??  ");
                              i = Integer.parseInt(dataIn.readLine());
                              data.delete(i);
                              break;
                    case 3 :  
                   
                        //System.out.print("Masukkan nama untuk mencari data yang akan diupdate: ");
//                        String namaUpdate = dataIn.readLine();
    
                        // Mencari data berdasarkan nama
//                            bukuAlamat dataToUpdate = data.getDataByNama(namaUpdate);
//    
//                    //if (dataToUpdate != null) {
//                        System.out.println("Data ditemukan. Silakan masukkan data baru untuk update.");
                        System.out.println("masukan data keberapa yang ingin di update ??");
                        i = Integer.parseInt(dataIn.readLine());
                        
                        System.out.print("Nama baru           : ");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat baru         : ");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("Nomor Telepon baru  : ");
                        temp.setNomor(dataIn.readLine());
                        System.out.print("Email baru          : ");
                        temp.setEmail(dataIn.readLine());
                        
                        data.update(i, temp);
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
                        break;        
           
                    case 4 : bukuAlamat[] list = data.getAll();
                            for (i=0;i<list.length;i++) {
                                if(list[i] != null){
                              System.out.println("buku alamat ke---> "+(i));
                              System.out.println("nama            :" + list[i].getNama());
                              System.out.println("alamat          :" + list[i].getAlamat());
                              System.out.println("nomor telepon   :" + list[i].getNomor());
                              System.out.println("email           : " + list[i].getEmail());
                              System.out.println("=========================================") ;
                            }else{
                                    System.out.println("data kosong tidak ada!");
                                }
                    }
                              break;
                    default : System.out.println("Nomor yang anda masukan tidak sesuai");

                }
            }
        }
        catch(IOException | NumberFormatException ex){
            
        }
    }
}
