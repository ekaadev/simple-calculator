import java.util.Scanner;

public class Kalkulator {
    public static int bil1(Scanner sc) {
        System.out.print("Masukkan bilangan pertama = ");

        return sc.nextInt();
    }

    public static int bil2(Scanner sc) {
        System.out.print("Masukkan bilangan kedua = ");

        return sc.nextInt();
    }

    public static char operator(Scanner sc) {
        System.out.print("Masukkan operator = ");

        return sc.next().charAt(0);
    }

    public static int operasi(int bil1, int bil2, char op) {
        int hasil = 0;

        switch(op) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                if (bil2 != 0) {
                    hasil = bil1 / bil2;
                } else {
                    System.out.println("Error");
                }
            default:
                System.out.println("Error");
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputBil1 = bil1(sc);
        int inputBil2 = bil2(sc);
        char inputOp = operator(sc);

        int finalKalkulasi = operasi(inputBil1, inputBil2, inputOp);

        System.out.println(finalKalkulasi);
        sc.close();
    }
}
