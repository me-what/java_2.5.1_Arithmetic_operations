public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = a + b;  // 17
        int d = 4 + b;  // 11
        System.out.println(c);
        System.out.println(d + "\n");

        int a2 = 10;
        int b2 = 7;
        int c2 = a2 - b2;  // 3
        int d2 = 4 - a2;  // -6
        System.out.println(c2); // 3
        System.out.println(d2 + "\n"); // -6

        int a3 = 10;
        int b3 = 7;
        int c3 = a3 * b3;  // 70
        int d3 = b3 * 5;  // 35
        System.out.println(c3); // 70
        System.out.println(d3 + "\n"); // 35

        int a4 = 20;
        int b4 = 5;
        int c4 = a4 / b4;  // 4
        double d4 = 22.5 / 4.5;  // 5.0
        System.out.println(c4); // 4
        System.out.println(d4 + "\n"); // 5.0

        double k = 10 / 4;     // 2.0
        System.out.println(k + "\n"); // 2.0

        double k2 = 10.0 / 4;     // 2.5
        System.out.println(k2 + "\n");

        int a5 = 33;
        int b5 = 5;
        int c5 = a5 % b5;  // 3
        int d5 = 22 % 4; // 2 (22 - 4*5 = 2)
        System.out.println(c5); // 3
        System.out.println(d5 + "\n"); // 2 (22 - 4*5 = 2)

        int a6 = 8;
        int b6 = ++a6;
        System.out.println(a6);  // 9
        System.out.println(b6 + "\n");  // 9

        int a7 = 8;
        int b7 = a7++;
        System.out.println(a7);  // 9
        System.out.println(b7 + "\n");  // 8

        int a8 = 8;
        int b8 = --a8;
        System.out.println(a8);  // 7
        System.out.println(b8 + "\n");  // 7

        int a9 = 8;
        int b9 = a9--;
        System.out.println(a9);  // 7
        System.out.println(b9 + "\n");  // 8

        int a10 = 8;
        int b10 = 7;
        int c10 = a10 + 5 * ++b10;
        System.out.println(c10 + "\n");  // 48

        int a11 = 8;
        int b11 = 7;
        int c11 = (a11 + 5) * ++b11;
        System.out.println(c11 + "\n");  // 104

        int x = 10 / 5 * 2; // x = 4
        System.out.println(x + "\n"); // 4

        double d12 = 2.0 - 1.1;
        System.out.println(d12); // 0.8999999999999999

    }
}