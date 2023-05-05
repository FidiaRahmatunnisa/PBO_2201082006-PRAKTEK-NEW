/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIdia050523;

/**
 *
 * @author HP
 */
public class bukuAlamatTampil {
    public static void main(String[] args){
        bukuAlamat isi = new bukuAlamat();
        isi.setNama("fidia");
        isi.setAlamat("sicincin");
        isi.setNomor("081275744751");
        isi.setEmail("fidiarahmatunnisa274@gmail.com");
        
        System.out.println("nama          : "+isi.getNama());
        System.out.println("alamat        : "+isi.getAlamat());
        System.out.println("nomor telepon : "+isi.getNomor());
        System.out.println("email         : "+isi.getEmail());
        
//        bukuAlamat isi2 = new bukuAlamat();
        
    }
}
