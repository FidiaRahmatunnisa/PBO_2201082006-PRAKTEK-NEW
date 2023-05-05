/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_2201082006;



/**
 *
 * @author LAB-MM
 */
import java.util.Scanner;
public class PBO_2201082006 {

    public static void main(String[] args){
    Scanner isi = new Scanner(System.in);
    System.out.print("masukan angka :");
    int value = isi.nextInt();
//   int value = 75;
   int blockSize = 10;
   int blockNumber = (value - 1) / blockSize + 1;

   switch (blockNumber) {
            case 1:
                // kode yang dijalankan jika nilai value berada dalam rentang 1-10
                System.out.println("Nilai berada dalam rentang 1-10.");
                break;
            case 2:
                // kode yang dijalankan jika nilai value berada dalam rentang 11-20
                System.out.println("Nilai berada dalam rentang 11-20.");
                break;
            // dan seterusnya hingga case 10
            case 10:
                // kode yang dijalankan jika nilai value berada dalam rentang 91-100
                System.out.println("Nilai berada dalam rentang 91-100.");
                break;
            default:
                // kode yang dijalankan jika nilai value tidak berada dalam rentang 1-100
                System.out.println("Nilai tidak berada dalam rentang 1-100.");
                break;
        }
       //case (if (angka>=380 || angka<=450)) : System.out.println("");
   }
    
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        //String kata = "fidia"+8;
        //System.out.println("hasil : "+kata);
        //public static void main(String[] args, Object moe){
        //Scanner in = new Scanner(System.in);
        //String nama = in.nextLine();
        //if(nama.equals(moe)) System.out.println("you are king of rock and roll");
        //else System.out.println("you are not king!");
    }
//    }
    

