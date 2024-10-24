
import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL ATAU GENAP");
        System.out.println("Masukkan suatu bilangan: ");
        int bil = input.nextInt();

        if (bil == 0) {
            System.out.println("Bilangan Netral");
        } else {
            if (bil % 2 == 1) {
                System.out.println("Bilangan Ganjil");
            } else {
                System.out.println("Bilangan Genap");
            }
        }
    }
}
