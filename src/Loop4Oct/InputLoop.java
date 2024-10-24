package Loop4Oct;
import java.util.*;

public class InputLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa jumlah angka yang ingin anda masukkan: ");
        int n = input.nextInt();
        int nilaiN[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            nilaiN[i] = input.nextInt();
        }
        System.out.println();

        System.out.print("Angka yang dimasukkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiN[i] + " ");
        }
        System.out.println("\n");

        /* (Nilai Max menggunakan loop)
        int max = nilaiN[0];
        for (int i = 0; i < n; i++) {
            if (nilaiN[i] > max) {
                max = nilaiN[i];
            }
        }
        System.out.println("Nilai max: " + max);
        */

//        (Nilai max menggunakan sort array)
        Arrays.sort(nilaiN);
        System.out.println("Nilai max: " + nilaiN[n-1]);
    }
}
