/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fidia280423;

/**
 *
 * @author HP
 */
public class studentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    private String nilai;
    
    private static int studentCount;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        
    }
    
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
        
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
        
    }
    public double getmathGrade(){
        return mathGrade;
    }
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
        
    }
    public double getenglishGrade(){
        return englishGrade;
    }
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
        
    }
    public double getscienceGrade(){
        return scienceGrade;
    }
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
        
    }
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3 ;
        return average;
    }
    public static int getstudentCount(){
        return studentCount;
    }
    public String getnilai(){
        if(average <0 || average >100) nilai = "error!!";
        else 
        {
        if(average >80) nilai = "A";
        else if (average >65) nilai = "B";
        else if(average >55) nilai = "C";
        else if(average >40) nilai = "D";
        else if(average > 0) nilai = "E";
        else nilai = "Error!";
        }
        return nilai;
    } 
}
