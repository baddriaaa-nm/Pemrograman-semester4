public class Tugas1 {
    public static void main(String[]args) {

        //Data
        double makan = 20000;
        double transport = 10000;
        double belanja = 50000;

        // Hitung total
        double total = makan + transport + belanja;

        // Hitung persentase
        double pMakan = (makan / total) * 100;
        double pTransport = (transport / total) * 100;
        double pBelanja = (belanja / total) * 100;

        // Output
        System.out.println("=== DATA PENGELUARAN ===");
        System.out.println("Makan: " + makan);
        System.out.println("Transport: " + transport);
        System.out.println("Belanja: " + belanja);

        System.out.println("\nTotal: " + total);

        System.out.println("\n=== PERSENTASE ===");
        System.out.println("Makan: " + pMakan + "%");
        System.out.println("Transport: " + pTransport + "%");
        System.out.println("Belanja: " + pBelanja + "%");
    }
}

