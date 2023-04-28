/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia280423;

/**
 *
 * @author HP
 */
public class studentRecordExample {
    public static void main(String[] args){
        studentRecord annaRecord = new studentRecord();
        annaRecord.setName("anna");
        annaRecord.setaddress("Padang");
        annaRecord.setage(23);
        annaRecord.setmathGrade(80);
        annaRecord.setenglishGrade(70);
        annaRecord.setscienceGrade(80);
        
        //tampilkan 
        System.out.println("Nama              :"+annaRecord.getName());
        System.out.println("Alamat            :"+annaRecord.getaddress());
        System.out.println("Umur              :"+annaRecord.getage());
        System.out.println("Matematika        :"+annaRecord.getmathGrade());
        System.out.println("B.inggris         :"+annaRecord.getenglishGrade());
        System.out.println("Ilmu pengetahuan  :"+annaRecord.getscienceGrade());
        System.out.println("Rata - Rata Nilai :"+annaRecord.getaverage());
        System.out.println("Prediket Nilai    :"+annaRecord.getnilai());
        
    }
}
