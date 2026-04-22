import java.util.Scanner;

public class Latihan1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Kehadiran: ");
        double kehadiran = input.nextDouble();
        System.out.print("Input Realisasi: ");
        double realisasi = input.nextDouble();
        System.out.print("Input Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Input Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Input Nilai UAS: ");
        double uas = input.nextDouble();

        input.close();

        double b_kehadiran = kehadiran/realisasi*10;
        double b_tugas = tugas*20/100;
        double b_uts = uts*30/100;
        double b_uas = uas*40/100;

        double total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("\n=== HASIL ===");
        System.out.println("Kehadiran: "+kehadiran+" dari Realisasi: "+realisasi);
        System.out.println("Nilai Tugas: "+tugas);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: "+ uas);
        
        System.out.println("Total Nilai Akhir: "+total);
        
    }
}
