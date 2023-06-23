/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FidiaModul23623;

/**
 *
 * @author HP
 */
// sepertinya abstract kelas tidak terlalu dibutuhkan
public class persegi extends shape implements relasi {
    private float panjang;
    private float lebar;
    private double luas;
    private double keliling;
    
    persegi(){
        
    }
    persegi(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double luas(){
        return panjang*lebar;
    }
    public double keliling(){
        return (2*panjang)+(2*lebar);
    }
    
    // abstract
   

    @Override
    public boolean isGreater(Object a, Object b) {
        double luas_a = ((persegi) a).luas();
        double luas_b = ((persegi) b).luas();
        return luas_a>luas_b;
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double luas_a = ((persegi) a).luas();
        double luas_b = ((persegi) b).luas();
        return luas_a<luas_b;
    }

    @Override
    public boolean isEqual(Object a, Object b) {
       double luas_a = ((persegi) a).luas();
       double luas_b = ((persegi) b).luas();
       return luas_a == luas_b;
    }
    
    public static void main(String[] args){
        persegi data1 = new persegi(7,4);
        persegi data2 = new persegi(6,8);
        relasi ban = new persegi();
        System.out.println("Luas persegi 1 : "+data1.luas());
        System.out.println("Luas Persegi 2 : "+data2.luas());
        System.out.println("persegi 1 > persegi 2 : "+ban.isGreater(data1, data2));
        System.out.println("persegi 1 < persegi 2 : "+ban.isLess(data1, data2));
        System.out.println("persegi 1 == persegi 2 : "+ban.isEqual(data1, data2));
    }
}
