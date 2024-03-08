package kuisasci;

import java.util.Scanner;
public class KuisAsci {
    public static void main(String[] args) {
        //  Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        // Input Batas Atas dan Batas Bawah Integrasi
        System.out.print("Masukkan a = ");
        int a = input.nextInt();
        System.out.print("Masukkan b = ");
        int b = input.nextInt();
        int n = 9;
        
        // Menyimpan Nilai f(x) dalam Array y
        double [] y = {0,0.5687,0.7909,0.5743,0.135,-0.1852,-0.1802,0.0811,0.2917,0.3031};
        //double [] y = {0,8,6,8,3,7,5,6,8,4};
        
        // Mencari Delta X
        double deltax = (b-a)/n;
        
        // Memanggil Method Untuk Menghitung Nilai Integral Metode Trapezoidal dan Simpson
        System.out.println("Hasil Integral = " + Trapezoidal(deltax, y));
        System.out.println("Hasil Integral = " + Simpson(deltax, y));   
    }
    
    // Method Metode Trapezoidal
    public static double Trapezoidal(double n, double [] arr){
        double a = arr[0];
        double b = arr[arr.length-1];
        double hasil = 0;
        for(int i = 1; i <= arr.length-2; i++){
           hasil += arr[i];
        }
        return n/2*(a + b + 2*hasil);
    } 
    
   // Method Metode Simpson 
   public static double Simpson(double n, double [] arr){
       double a = arr[0];
       double b = arr[arr.length-1];
       double hasil1 = 0;
       double hasil2 = 0;
       // Perulangan Untuk x Ganjil
       for(int i = 1; i <= arr.length-2; i=i+2){
           hasil1 += arr[i];
       }
       // Perulangan Untuk x Genap
       for(int i = 2; i <= arr.length-2; i=i+2){
           hasil2 += arr[i];
       }
    return n/3*(a + b + 4*hasil1 + 2*hasil2);
   }
}
