import java.util.Scanner;

public class Kalkulator {

    public static void desc() {
        System.out.println("============================================================================================");
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("============================================================================================");
        System.out.println("Anda dapat menggunakan tanda di bawah ini untuk melakukan berbagai macam operasi matematika");
        System.out.println("'+' : Melakukan Opeasi Penjumlahan");
        System.out.println("'-' : Melakukan Opeasi Pengurangan");
        System.out.println("'*' : Melakukan Opeasi Perkalian");
        System.out.println("'/' : Melakukan Opeasi Pembagian");
        System.out.println("============================================================================================");
    }
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

    public static void kalkulasi(int bil1, int bil2, char op) {
        double finalDiv;
        int finalNotDiv;

        if (op == '+') {
            finalNotDiv = bil1 + bil2;
            System.out.println("Hasil penjumlahan dari 2 bilangan tersebut = " + finalNotDiv);
        } else if (op == '-') {
            finalNotDiv = bil1 - bil2;
            System.out.println("Hasil pengurangan dari 2 bilangan tersebut = " + finalNotDiv);
        } else if (op == '*') {
            finalNotDiv = bil1 * bil2;
            System.out.println("Hasil perkalian dari 2 bilangan tersebut = " + finalNotDiv);
        } else if (op == '/') {
            if (bil2 == 0) {
                System.out.println("Error, anda memasukkan angka 0!");
            } else {
                finalDiv = (double) bil1 / bil2;
                System.out.printf("Hasil pembagian dari 2 bilangan tersebut = %.2f\n", finalDiv);
            }
        }
    }

    public static int mainLagi(Scanner sc) {
        System.out.println("============================================================================================");
        System.out.println("Apakah anda ingin menncoba lagi (0/1) ? ");
        System.out.println("0 : Tidak");
        System.out.println("1 : Ya");
        System.out.println("============================================================================================");
        System.out.print("Pilihanmu = ");

        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validasi = true;

        while (validasi) {
            desc();

            int inputBil1 = bil1(sc);
            int inputBil2 = bil2(sc);
            char inputOp = operator(sc);

            kalkulasi(inputBil1, inputBil2, inputOp);

            int inputMainLagi = mainLagi(sc);

            if (inputMainLagi == 0) {
                validasi = false;
            }
        }

        sc.close();
    }
}
