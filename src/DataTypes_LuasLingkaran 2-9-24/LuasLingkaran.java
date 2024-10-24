
import java.util.Scanner;

public class LuasLingkaran {

    public static void main(String[] args) {
        int radius;
        double hasilLuas, hasilKeliling;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan radius: ");
        radius = input.nextInt();

        hasilLuas = Math.PI * radius * radius;
        hasilKeliling = Math.PI * 2 * radius;

        if (radius < 0) {
            System.out.println("Radius kurang dari 0");
        } else {
            System.out.println("Luas: " + hasilLuas);
            System.out.println("Keliling: " + hasilKeliling);
        }
    }
}
