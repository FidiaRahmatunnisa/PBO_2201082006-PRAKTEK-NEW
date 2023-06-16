/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia260523;

/**
 *
 * @author HP
 */
public class students extends person {
    public students(){
        // cara 1
        super("Anna","Padang");
//        cara 2
//        super() maka yang diakses adalah constructor yg pertama
// cara lain:
//         super.name ="Anna";
//         super.address ="Padang";
//        System.out.println("inside Student : constructor");
    }
    
//    cara 3
//    @Override
//    public String getName(){ // ini disebut overiade
//          System.out.println("students :getName");
//          return name;
//      }
    
    
    //main method
    public static void main(String[] args){
        students anna = new students();
        System.out.println("Nama : "+anna.name); /* dipakai name karena hak akses name dari class 
                                                      person itu yang dipakai itu protected*/

//        System.out.println(" ");
    }

}
