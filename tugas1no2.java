// SOAL NOMOR 2
package tugas1;

import java.util.Scanner;
public class tugas1no2 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        // Input Tahun dari pengguna
        System.out.print("Masukkan tahun pertama : ");
        int x = input.nextInt();
        System.out.print("Masukkan tahun kedua : ");
        int y = input.nextInt();
        
        // Jumlah hari
        int jumlahhari = 0;
        for (int i = x; i <= y; i++){
            int n = Kabisat(i)+Biasa(i);
            jumlahhari += n;
        }
        System.out.println("Jumlah Hari dari tahun " + x + " sampai tahun " + y + " adalah " + jumlahhari +" hari");
    }
    
    // Tahun Kabisat
    public static int Kabisat(int x){
        if (x % 4 == 0)
            return 366;
        else
            return 0;
    }
    
    // Tahun biasa
    public static int Biasa(int x){
        if (x % 4 != 0)
            return 365;
        else
            return 0;
    }
}
