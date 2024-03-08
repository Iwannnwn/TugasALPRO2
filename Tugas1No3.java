// SOAL NOMOR 3
package tugas1;

import java.util.Scanner;
public class Tugas1No3 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        // Input pengguna untuk i
        System.out.print("Masukkan i : ");
        int i = input.nextInt();
        
        // Memanggil Method jumlahan deret
        System.out.println("m(i) = " + 4*Deret(i));
    }
    
    // Method untuk menghitung deret ke-n
    public static double Deret(int i){
        double jumlah = 0;
        for (int n = 1; n <= i; n++){
            double suku = Math.pow(-1, n + 1) / (2.0 * n - 1);
            jumlah += suku;
        }
        return jumlah;
    }   
}
