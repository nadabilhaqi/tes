package LoopLagi7Oct;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int[] matriks1 = {2,4,6,8,10};
        int[] matriks2 = {5,6,8,9,10};
        int[] hasil = new int[matriks1.length];

        for (int i = 0; i < matriks1.length; i++) {
            hasil[i] = matriks1[i] + matriks2[i];
            System.out.print(hasil[i] + " ");
        }
    }
}
