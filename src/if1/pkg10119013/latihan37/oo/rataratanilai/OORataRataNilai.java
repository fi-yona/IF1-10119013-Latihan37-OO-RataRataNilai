/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan37.oo.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Fiona Avila
 */


public class OORataRataNilai {
    
    static Scanner scan = new Scanner(System.in);
    
    public static int banyakMahasiswa;
    public static int nilai[];
    public static int totalNilai = 0;
    
    public static void main(String[] args) {
        
        System.out.println("===========================================");
        System.out.print("Masukkan banyak mahasiswa\t: ");
        banyakMahasiswa = scan.nextInt();
        System.out.println("------------------------------");
        nilai = new int[banyakMahasiswa];
        for(int i=0;i<banyakMahasiswa;i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + "\t\t: ");
            nilai[i] = scan.nextInt();
            totalNilai += nilai[i];
        }
        System.out.println("------------------------------");
        System.out.println("Maka, rata-rata nilai mahasiswa adalah " + cariRataRata(totalNilai,banyakMahasiswa));
        System.out.println("===========================================");
    }
    
     public static double cariRataRata(int totalNilai, int banyakMahasiswa){
        double rataRata = totalNilai/banyakMahasiswa;
        return rataRata;
    }
}
