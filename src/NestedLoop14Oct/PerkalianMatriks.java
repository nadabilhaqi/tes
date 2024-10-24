package NestedLoop14Oct;

import java.util.*;

public class PerkalianMatriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input panjang matriks 1
        System.out.print("Masukkan panjang array pertama: ");
        int[] a = new int[input.nextInt()];

        // input value matriks 1
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan nilai untuk index ke-" + i + ": ");
            a[i] = input.nextInt();
        }
        System.out.println();

        // input panjang matriks 2
        System.out.print("Masukkan panjang array kedua: ");
        int[] b = new int[input.nextInt()];

        // input value matriks 2
        for (int i = 0; i < b.length; i++) {
            System.out.print("Masukkan nilai untuk index ke-" + i + ": ");
            b[i] = input.nextInt();
        }
        System.out.println();

        // deklarasi dan inisialisasi variabel hasil
        int hasil = 0;

        // deklarasi dan inisialisasi variabel array hasil
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            hasil = 0;
            for (int j = 0; j < b.length; j++) {
                System.out.println(a[i] + " x " + b[j] + " = " + a[i] * b[j]);
                hasil += a[i] * b[j];
                if (j == (b.length - 1)) {
                    System.out.println("--------- +");
                }
            }
            c[i] = hasil;
            System.out.println(hasil);
            System.out.println();
        }

        // print array hasil
        System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
