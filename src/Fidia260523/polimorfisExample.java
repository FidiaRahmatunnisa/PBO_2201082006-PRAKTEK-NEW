/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia260523;
/**
 *
 * @author HP
 */
public class polimorfisExample {
    public static void main(String[] args){
        person ref ;
        students studentObject = new students();
        employee employeeObject = new employee();
        
        studentObject.setName("anna");
        employeeObject.setName("Budi");
        employeeObject.setAddress("Padang");
        
        ref = studentObject; /* hal ini mengarahkannya ke student yang terletak di getName
                                                     student sehingga tercetak student getName*/
        System.out.println("Nama : "+ref.getName());
        
        ref = employeeObject; // hal seperti ini yang bernama polimorfisme
        System.out.println("Nama : "+ref.getName()); 
        printInformation(employeeObject);
        }
    
    public static void printInformation(person ref){
        if(ref instanceof students){
            System.out.println("Nama Student : "+ref.getName());
            System.out.println("Alamat Student : "+ref.getAddress());
        } else if(ref instanceof employee){
        System.out.println("Nama Employee : "+ref.getName());
        System.out.println("Alamat Employee : "+ref.getAddress());
    }
    }
}