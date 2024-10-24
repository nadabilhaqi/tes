package ArrayDuaDimensi21Oct;

public class BelajarFungsi {

    private static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.println("index ke-" + i + " adalah " + A[i]);
        }
    }

    public static void main(String[] args) {
        int[] A1 = new int[5];
        A1[0] = 1;
        A1[1] = 2;
        A1[2] = 3;
        A1[3] = 4;
        A1[4] = 5;

        // printArray(A1);
        System.out.println(FungsiLuasSegitiga.getLuasSegitiga(100f, 200f));
    }
}
