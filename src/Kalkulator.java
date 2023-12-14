import java.util.Scanner;

public class Kalkulator {

    public static void desc() {
        System.out.println("======================================================");
        System.out.println("======================================================");
        System.out.println("Program Kalkulator Sedeerhana");
        System.out.println("+ : Melakukan Opeasi Penambahan");
        System.out.println("- : Melakukan Opeasi Pengurangan");
        System.out.println("* : Melakukan Opeasi Perkalian");
        System.out.println("/ : Melakukan Opeasi Pembagian");
        System.out.println("======================================================");
        System.out.println("======================================================");
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

    public static void operasi(int bil1, int bil2, char op) {
        double hasil = 0;

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
                    hasil = (double) bil1 / bil2;
                } else {
                    System.out.println("Error, Anda Memasukkan angka 0!");
                }
        }

        if ( bil2 != 0 ) {
            System.out.println("Hasilnya adalah " + hasil);
        }
    }

    public static int mainLagi(Scanner sc) {
        System.out.println("======================================================");
        System.out.println("Apakah anada ingin menncoba lagi (0/1) ? ");
        System.out.println("0 : Tidak");
        System.out.println("1 : Ya");
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

            operasi(inputBil1, inputBil2, inputOp);

            int inputMainLagi = mainLagi(sc);

            if (inputMainLagi == 0) {
                validasi = false;
            }
        }

        sc.close();
    }
}
