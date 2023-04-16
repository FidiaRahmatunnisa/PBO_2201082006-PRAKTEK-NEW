/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2201082006;


/**
 *
 * @author HP
 */
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
public class week {
    public static void main(String[] args){
        //BufferedReader hari = new BufferedReader(new InputStreamReader(System.in));
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        //String days[] = { “Mon”, “Tue”, “Wed”, “Thu”, “Fri”, “Sat”,“Sun”};
        int i = 0;
        while(i<hari.length){
            System.out.println(hari[i]);
            i++;
        }
            }
}
