package ArrayDuaDimensi21Oct;

public class FungsiLuasSegitiga {

    public static float getLuasSegitiga(float alas, float tinggi) {
        System.out.println("Sedang memproses...");
        return alas * tinggi / 2f;
    }

    public static void main(String[] args) {
        float alasSegitiga = 10f;
        float tinggiSegitiga = 20f;
        float luasSegitiga = getLuasSegitiga(alasSegitiga, tinggiSegitiga);
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}
