package praktikum5;

import java.util.Scanner;

public class NILAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jumlahmatkul;
        String nama;
        String nim;
        String jurusan;
        String namamatkul[] = new String[20];
        String nilaiHrf[] = new String[20];
        int tugas[] = new int[20];
        double nilaiA[] = new double[20];
        System.out.print(" Input Jumlah Mata Kuliah : ");
        jumlahmatkul = input.nextInt();
        System.out.println("============================");
        System.out.print("  Nama     : ");
        nama = input.next();
        System.out.print("  NIM      : ");
        nim = input.next();
        System.out.print("  Jurusan  : ");
        jurusan = input.next();
        System.out.println("============================");
        for (i = 1; i <= jumlahmatkul; i++) {
            System.out.print("\n Mata kuliah ke-" + i + " : ");
            namamatkul[i] = input.next();
            System.out.print(" Input Nilai: ");
            tugas[i] = input.nextInt();
            nilaiA[i] = ((tugas[i] * 1));
            if (nilaiA[i] >= 85)
                nilaiHrf[i] = "A";
            else if (nilaiA[i] >= 80)
                nilaiHrf[i] = "AB";
            else if (nilaiA[i] >= 70)
                nilaiHrf[i] = "B";
            else if (nilaiA[i] >= 65)
                nilaiHrf[i] = "BC";
            else if (nilaiA[i] >= 60)
                nilaiHrf[i] = "C";
            else if (nilaiA[i] >= 50)
                nilaiHrf[i] = "D";
            else
                nilaiHrf[i] = "E";
        }
        System.out.println("\n============================");
        System.out.println("\n\n Nama: " + nama + "            NIM: " + nim);
        System.out.println("============================");
        System.out.println(" MatKul  Nilai  Tingkat");
        System.out.println("============================");
        for (i = 1; i <= jumlahmatkul; i++) {
            System.out.println(" " + namamatkul[i] + "      " + nilaiA[i] + "      " + nilaiHrf[i]);
        }
    }
}
