/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia260523;

/**
 *
 * @author HP
 */
public class person {
  protected String name; /*hak akses ini berpengaruh pada pemanggilan di main metod, 
                              karena dengan ini kita bisa melakukan pemanggilan langsung tanpa memakai accesor*/
  protected String address; /* hak akses protected berpengaruh saat */

public person(){
    System.out.println("inside Person : constructore");
    name = "";
    address = "";   // saat konstruktor dua diisi maka  konstruktor ini tidak dipakai lagi
}

public person(String name, String address){
    this.name = name;
    this.address = address;
}

public String getName(){ //accesor
    System.out.println("person :getName");
    return name;
}

public String getAddress(){ //accesor
    return address;
}

public void setName(String name){//mutator
    this.name = name;
}

public void setAddress(String address){//mutator
    this.address = address;
}

    
}//akhir class
