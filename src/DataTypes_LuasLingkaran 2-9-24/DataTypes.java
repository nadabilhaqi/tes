public class DataTypes {
    public static void main(String[] args) {

        System.out.print("\"a\"");
        System.out.print('\n');

        System.out.println('b');

        int invicibleUnderscore = 22_222_222;
        System.out.println(invicibleUnderscore);

        System.out.println(2E2); // 2 x 10^2
        System.out.println(2E1); // 2 x 10^1
        System.out.println(3E1); // 3 x 10^1
        System.out.println(3E2); // 3 x 10^2

        int i = 10;
        long l = i;
        byte b = (byte) i;
        System.out.println(i + " " + l + " " + b);

        final String NAME = "Daffa";
        System.out.println(NAME);

        
    }
}