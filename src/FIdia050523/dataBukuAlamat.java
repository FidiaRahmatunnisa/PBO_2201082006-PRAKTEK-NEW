/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FIdia050523;

/**
 *
 * @author HP
 */
public class dataBukuAlamat {
    private final bukuAlamat[] data = new bukuAlamat[100];  // padahal bukuAlamat kelas,tapi bisa jadi array saat dipanggil kekelas lain
    private int index;
    
    public void update(int index, bukuAlamat buku){ // update data  --- set, pakai void
        data[index] = buku;
    }
    
    public void insert(bukuAlamat buku){ // masukan data   --set, pakai void
        data[index] = buku;
        index++;
    }
    
    public bukuAlamat[] getAll(){ // tampilkan data
        bukuAlamat[] temp = new bukuAlamat[index]; // temp -- tempat tampung data yang kini sedang kosong
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return temp;
    }
    
    public void delete(int index1){  // hapus data
        if(data[index1] != null){
//          data[index] = null;    // tidak bisa
//        System.out.println("data tidak ada ");  // tidak bisa
        data[index1].setNama("");
        data[index1].setAlamat("");
        data[index1].setNomor("");
        data[index1].setEmail("");
        }else{
            System.out.println("data invalid1");
        }
    }
    public static void main(String[] args){
        dataBukuAlamat data = new dataBukuAlamat();
        bukuAlamat temp = new bukuAlamat();
        temp.setNama("ali");
        temp.setAlamat("pasar");
        temp.setNomor("0812345678");
        temp.setEmail("daging99@gamil.com");
        data.insert(temp);
        
        bukuAlamat temp2 = new bukuAlamat();
        temp2.setNama("ani");
        temp2.setAlamat("padang");
        temp2.setNomor("0898765432");
        temp2.setEmail("rahamnilai765@gmail.com");
        data.insert(temp2);
        
//        tampil
        bukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("buku alamat ke---> "+(i+1));
            System.out.println("nama            :"+list[i].getNama());
            System.out.println("alamat          :"+list[i].getAlamat());
            System.out.println("nomor telepon   :"+list[i].getNomor());
            System.out.println("email         : "+list[i].getEmail());
        }
    }

//    bukuAlamat getDataByNama(String namaUpdate) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
