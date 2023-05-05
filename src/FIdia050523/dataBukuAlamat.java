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
    private bukuAlamat[] data = new bukuAlamat[100];
    private int index;
    
    public void update(int index, bukuAlamat buku){
        data[index] = buku;
    }
    
    public void insert(bukuAlamat buku){
        data[index] = buku;
        index++;
    }
    
    public bukuAlamat[] getAll(){
        bukuAlamat[] temp = new bukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return data;
    }
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNomor("");
        data[index].setEmail("");
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
        
        //tampil
        bukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("buku alamat ke---> "+(i+1));
            System.out.println("nama            :"+list[i].getNama());
            System.out.println("alamat          :"+list[i].getAlamat());
            System.out.println("nomor telepon   :"+list[i].getNomor());
            System.out.println("email         : "+list[i].getEmail());
                    
        }
    }
}