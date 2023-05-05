/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class pinBank {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        Scanner isi2 = new Scanner(System.in);
        Scanner isi3 = new Scanner(System.in);
        
        System.out.println("Selamat datang di Bank SAiO "
                + "\nSilahkan masukan nama dan pin anda untuk registrasi");
        System.out.print("masukan nama anda : ");
        String nama = isi.nextLine();
        System.out.print("masukan pin(*kombinasi 6 angka) : ");
        int angka = isi.nextInt();
        
        //tampilkan hasil
        System.out.println("Selamat akun anda tlah terdaftar!!!");
        System.out.println("nama nasabah : "+nama);
        System.out.println("pin anda : ****** ");
        
        // masuk akun
        int i = 0;
        int angkaMasuk2;
        System.out.println("silakan masukkan nama dan pin anda!");
        System.out.print("masukan nama anda : ");
        String namaMasuk = isi2.nextLine();
        System.out.print("masukan pin anda : ");
        int angkaMasuk = isi.nextInt(); 
        
        if(namaMasuk == nama && angkaMasuk == angka)
            System.out.println("anda berhasil masuk \n"
                    + "Sekarang anda berada pada halaman utama bank SAiO");
        else
        {
            System.out.println("nama atau pin yang anda masukan salah!! "
                    + "\n Silahkan periksa kembali");
            do{
            System.out.print("masukan nama anda : ");
            String namaMasuk2 = isi3.nextLine();
            System.out.print("masukan pin anda : ");
            angkaMasuk2 = isi.nextInt();
            }while(angkaMasuk2!=angka);
            
            //berhasil
            System.out.println("nama dan pin yang anda masukan telah benar \n"
                    + "anda berhasil masuk!");
        }
    }
}
