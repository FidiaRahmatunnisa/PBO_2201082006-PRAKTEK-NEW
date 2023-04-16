#hello.java
penjelasan mengenai package

package Fidia090323;

package adalah sebuah mekanisme untuk mengorganisir kelas-kelas yang
terkait bersama-sama dalam satu direktori atau "folder" di sistem file.
Hal ini memudahkan pengembang untuk mengatur dan mengelompokkan kelas-kelas
berdasarkan fungsionalitas atau tujuan tertentu, serta mencegah nama kelas 
yang sama dari berkonflik dengan kelas-kelas lainnya dalam proyek yang sama.
Nama package ini biasanya didefinisikan di awal file kelas dan mengindikasikan
letak di mana kelas tersebut terdapat dalam struktur direktori proyek.

public class Hello{} 

Dalam bahasa pemrograman Java, sebuah kelas (class) adalah sebuah template atau
blueprint untuk membuat objek (object) yang memiliki atribut (properties) dan metode
(methods) yang sama. Keyword "public" pada sebuah kelas menandakan bahwa kelas tersebut
dapat diakses dari luar kelas tersebut, artinya kelas tersebut dapat digunakan oleh
kelas-kelas lain dalam program.
Sehingga, deklarasi "public class hello {}" pada Java, mendefinisikan sebuah kelas
bernama "hello" dengan akses publik (public access) yang dapat diakses dari luar kelas
tersebut. Kelas ini mungkin memiliki atribut dan metode, namun jika tidak didefinisikan,
kelas tersebut akan menjadi kosong (empty class).
Dalam Java, setiap program harus memiliki sebuah kelas utama (main class) dengan metode
"main()" sebagai entry point untuk menjalankan program. Jika "hello" adalah kelas utama,
maka harus ada satu metode "main()" dalam kelas tersebut, seperti contoh berikut:

public class Hello {
    public static void main(String[] args){
        System.out.println("selamat datang");
    }
}
Dalam contoh ini, kelas "hello" memiliki metode "main()" yang mencetak "Selamat Datang"
pada konsol saat program dijalankan.

public static void main(String[] args){}

pada bahasa pemrograman Java merupakan method atau fungsi khusus yang memiliki peran 
sebagai entry point atau titik awal dalam menjalankan program Java. Method ini harus 
dideklarasikan dalam kelas utama (main class) dari program Java.
Berikut adalah penjelasan dari setiap bagian sintaks "public static void main(String[] args)":

-"public" merupakan access modifier (pengubah akses) yang menandakan bahwa method ini 
dapat diakses dari mana saja dalam program Java.
-"static" adalah keyword yang menandakan bahwa method ini dapat dipanggil tanpa harus 
membuat instance (objek) dari kelas utama.
-"void" menunjukkan bahwa method ini tidak mengembalikan nilai apapun.
-"main" adalah nama method utama yang dikenali oleh Java sebagai titik awal dalam 
menjalankan program.
-"String[] args" merupakan parameter yang diterima oleh method main. 
Parameter ini berupa array dari objek String yang dapat digunakan sebagai 
argumen dalam menjalankan program.
-"{}" merupakan blok kode yang berisi perintah-perintah atau logika yang akan dieksekusi
oleh program ketika method main dipanggil.
Secara umum, fungsi dari method main dalam Java adalah untuk memulai program dan 
mengontrol alur eksekusi program. Ketika program dijalankan, method main akan pertama 
kali dijalankan dan mengeksekusi baris kode di dalamnya. Kemudian, program akan berlanjut 
mengeksekusi baris kode pada method-method lain di dalam kelas utama atau kelas-kelas lain 
yang di-referensikan dari kelas utama tersebut.

System.out.println("selamat datang");

pada bahasa pemrograman Java  baris diatas merupakan sebuah perintah atau statement 
untuk mencetak sebuah teks atau string ke konsol output.Dalam hal ini, perintah 
"System.out.println()" akan mencetak teks "selamat datang" ke konsol output pada baris baru.
Fungsi "println" pada kelas "System.out" digunakan untuk mencetak teks atau nilai apapun ke 
konsol, sementara "System.out" merupakan sebuah objek yang merepresentasikan standar output pada program Java.
Jadi, program "System.out.println("selamat datang");" akan mencetak teks "selamat datang" 
ke konsol output 

#contohIncrement.java
 int i=10;
        int j=3;
        int k=0;
        
        k=j++ +i;
        
        System.out.println("i :"+i);
        System.out.println("j :"+j);
        System.out.println("k :"+k);

Program tersebut merupakan sebuah contoh operasi aritmatika dan penggunaan operator 
penugasan pada bahasa pemrograman Java. Berikut penjelasannya:
Variabel "i" dideklarasikan dengan nilai awal 10.
Variabel "j" dideklarasikan dengan nilai awal 3.
Variabel "k" dideklarasikan dengan nilai awal 0.
Pada baris keempat, terdapat sebuah operasi penjumlahan antara "j++" dan "i". "j++" 
menunjukkan bahwa nilai variabel "j" akan di-increment atau ditambahkan 1 setelah operasi 
tersebut dilakukan. Sedangkan "i" memiliki nilai tetap 10. Sehingga hasil operasi adalah 
"j" yang awalnya bernilai 3 ditambahkan dengan "i" yang bernilai 10, yaitu 13.
Setelah hasil operasi ditentukan, nilai dari hasil operasi yaitu 13 kemudian disimpan 
ke dalam variabel "k" menggunakan operator penugasan "=".
Pada baris selanjutnya, perintah "System.out.println()" digunakan untuk mencetak nilai 
variabel "i", "j", dan "k" ke konsol output dengan format tertentu.
Pada baris ke-7, akan tercetak nilai "i :10" pada konsol output.
Pada baris ke-8, akan tercetak nilai "j :4" pada konsol output. Nilai variabel "j" 
telah di-increment setelah operasi pada baris keempat.
Pada baris ke-9, akan tercetak nilai "k :13" pada konsol output. Nilai variabel "k" 
telah di-update dengan hasil operasi pada baris keempat.
Jadi, program tersebut akan mencetak nilai dari variabel "i", "j", dan "k" ke konsol output,
yaitu "i :10", "j :4", dan "k :13".

#kondisiOperator.java
String status ="";
        int grade=80;
        
        // mendapatkan status pelajar
        status=(grade>=60)?"passed":"fail";
        
        //print status
        System.out.println(status);

Program tersebut merupakan sebuah contoh penggunaan operator ternary pada 
bahasa pemrograman Java. Berikut penjelasannya:
Variabel "status" dideklarasikan dengan nilai awal string kosong.
Variabel "grade" dideklarasikan dengan nilai awal 80.
Pada baris ketiga, terdapat sebuah operasi menggunakan operator ternary "?:". 
Operator ternary memiliki tiga operand yaitu kondisi yang dievaluasi, 
hasil yang dikembalikan jika kondisi bernilai true, dan hasil yang dikembalikan 
jika kondisi bernilai false. Dalam hal ini, kondisi yang dievaluasi adalah "grade >= 60", 
yang artinya jika nilai "grade" lebih besar atau sama dengan 60, maka hasil yang 
dikembalikan adalah string "passed", dan jika tidak, maka hasil yang dikembalikan 
adalah string "fail".Setelah hasil operasi ditentukan, nilai dari hasil operasi 
yaitu "passed" kemudian disimpan ke dalam variabel "status" menggunakan operator 
penugasan "=".Pada baris selanjutnya, perintah "System.out.println()" digunakan untuk 
mencetak nilai variabel "status" ke konsol output.Pada baris ke-6, akan tercetak 
nilai "passed" pada konsol output. Hal ini terjadi karena nilai dari variabel "grade" 
yaitu 80 memenuhi kondisi pada operasi pada baris ketiga.Jadi, program tersebut akan 
mencetak nilai dari variabel "status" ke konsol output, yaitu "passed", karena 
nilai dari variabel "grade" yaitu 80 memenuhi kondisi pada operasi pada baris ketiga.

#latihan1.java
 int number=10;
        char letter='a';
        boolean result=true;
        String str="hello";
        
        System.out.println("number :"+number);
        System.out.println("letter :"+letter);
        System.out.println("result :"+result);
        System.out.println("str :"+str);

Program diatas merupakan program sederhana dengan diawali pendeklarasian tipe data masing-
masing variabel dan isi dari variabel tersebut sesuai dengan tipe datanya.lalu mencetaknya 
sebagai keluaran.

#latihan2.java
int n1=10;
        int n2=20;
        int n3=45;
        int r;
        
        r=(10+20+45)/3;
        
        System.out.println("number 1 = "+n1);
        System.out.println("number 2 = "+n2);
        System.out.println("number 3 = "+n3);
        System.out.println("average is = "+r);

sedangkan pada program ini, sama seperti sebelumnya denga perbedaannya, pada program ini 
dilakukan sebuah operasi aritmetika sebelum mencetaknya. operasi yang dilakukan sederhana 
yaitu dengan menambahkan angka lalu membaginya dengan bilangan yang langsung dibuat disana.

#latihan3.java
int n1=10;
        int n2=23;
        int n3=5;
        int nilai1,nilai2;
        
        nilai1=(n1>n2)?n1:n2;   
        nilai2=(nilai1>n3)?nilai1:n3;
        
        System.out.println("number 1 = "+n1);
        System.out.println("number 2 = "+n2);
        System.out.println("number 3 = "+n3);
        System.out.println("nilai terbesar = "+nilai2);

Pada program diatas , hal pertama yang dilakukan adalah deklarasi tipe data , yakni disini 
integer atau bilangan bulat, dengan value yang langsung dideklarasikan pula. lalu terdapat 
perintah ternary disini , dimana jika n1 lebih besar dari n2 maka akan dikeluarkan n1 sebagai
hasil untuk varibel nilai1,namun apabila n1 ternyata kecil dari n2 , maka n2 akan dicetak 
sebagai outputnya lalu jika nilai1 lebih besar dari n3 maka akan dikeluarkan nilai1 
sebagai outputnya, dan sebaliknya.


