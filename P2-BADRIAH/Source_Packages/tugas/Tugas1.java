package Source_Packages.tugas;
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Menghitung Luas Segitiga ===");
        System.out.print("Masukkan alas:");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi:");
        double tinggi = input.nextDouble();
        double luas = 0.5*alas*tinggi;

        System.out.println("Luas segitiga adalah:"+ luas);
        System.out.println("Program Selesai");
}
}