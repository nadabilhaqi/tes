package Switch30Sept;
import java.util.*;

public class SmallestProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 3 angka:");
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int[] intArray = {i, j, k};

        Arrays.sort(intArray);

        System.out.println();
        System.out.println("Angka terkecil adalah " + intArray[0]);

    }
}
