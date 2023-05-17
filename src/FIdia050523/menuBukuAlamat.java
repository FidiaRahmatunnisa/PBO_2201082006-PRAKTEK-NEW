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
                    case 2 : 
                              
                    case 4 : bukuAlamat[] list = data.getAll();
                             for(int i=0;i<list.length;i++){
//                                System.out.println("buku alamat ke---> "+(i+1));
                                System.out.println("nama            :"+list[i].getNama());
                                System.out.println("alamat          :"+list[i].getAlamat());
                                System.out.println("nomor telepon   :"+list[i].getNomor());
                                System.out.println("email           : "+list[i].getEmail());
                               break;
                               
                        
        }
                }
            }
        }
        catch(Exception ex){
            
        }
    }
}
