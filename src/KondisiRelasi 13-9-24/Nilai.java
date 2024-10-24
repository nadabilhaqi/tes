
import java.util.*;

public class Nilai {

    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 60) {
            System.out.println("Nilai B");
        } else {
            System.out.println("Nilai C");
        }
    }
}
