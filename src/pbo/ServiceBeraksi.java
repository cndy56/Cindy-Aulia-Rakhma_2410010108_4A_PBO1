package pbo;
import java.util.Scanner;
import java.util.InputMismatchException;

// CLASS
public class ServiceBeraksi {
    public static void main(String[] args) {

        // IO SEDERHANA
        Scanner input = new Scanner(System.in);

        // ARRAY + OBJECT + POLYMORPHISM
        Layanan[] daftarLayanan = {
            new Layanan("Ganti LCD", "Layar Pecah", 450000),
            new Layanan("Ganti Baterai", "Baterai Boros", 250000),
            new Layanan("Perbaikan Speaker", "Suara Tidak Keluar", 150000),
            new ServiceCepat("Install Ulang", "Sistem Error", 100000, 50000),
            new ServiceCepat("Lupa Pola", "HP Terkunci", 120000, 50000)
        };

        // ARRAY
        Layanan[] pesanan = new Layanan[20];
        int[] jumlahUnit = new int[20];
        String[] keluhan = new String[20];

        int jumlahPesanan = 0;
        boolean lanjut = true;

        System.out.println("=== SISTEM SERVICE HP ===");

        // IO SEDERHANA
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        System.out.print("Masukkan merk HP: ");
        String merkHp = input.nextLine();

        // PERULANGAN
        while (lanjut && jumlahPesanan < pesanan.length) {

            // ERROR HANDLING
            try {
                System.out.println("\n=== DAFTAR LAYANAN ===");

                // PERULANGAN
                for (int i = 0; i < daftarLayanan.length; i++) {
                    System.out.print((i + 1) + ". ");

                    // POLYMORPHISM
                    daftarLayanan[i].tampilkanInfo();
                }

                // IO SEDERHANA
                System.out.print("Pilih layanan: ");
                int pilihan = input.nextInt();
                input.nextLine();

                // SELEKSI
                if (pilihan < 1 || pilihan > daftarLayanan.length) {
                    System.out.println("Pilihan tidak tersedia.");
                    continue;
                }

                // IO SEDERHANA
                System.out.print("Masukkan jumlah unit HP: ");
                int unit = input.nextInt();
                input.nextLine();

                // SELEKSI
                if (unit <= 0) {
                    System.out.println("Jumlah unit harus lebih dari 0.");
                    continue;
                }

                // IO SEDERHANA
                System.out.print("Masukkan keluhan pelanggan: ");
                String isiKeluhan = input.nextLine();

                // OBJECT
                pesanan[jumlahPesanan] = daftarLayanan[pilihan - 1];
                jumlahUnit[jumlahPesanan] = unit;
                keluhan[jumlahPesanan] = isiKeluhan;

                jumlahPesanan++;

                System.out.println("Pesanan berhasil ditambahkan.");

                // IO SEDERHANA
                System.out.print("Tambah pesanan lagi? (y/n): ");
                char jawab = input.next().charAt(0);
                input.nextLine();

                // SELEKSI
                if (jawab == 'n' || jawab == 'N') {
                    lanjut = false;
                }

            } catch (InputMismatchException e) {
                // ERROR HANDLING
                System.out.println("Input harus berupa angka.");
                input.nextLine();
            }
        }

        int totalBayar = 0;

        System.out.println("\n=== STRUK SERVICE HP ===");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Merk HP        : " + merkHp);

        System.out.println("\nDaftar Pesanan:");

        // PERULANGAN
        for (int i = 0; i < jumlahPesanan; i++) {
            int subtotal = pesanan[i].hitungTotal(jumlahUnit[i]);

            System.out.println("--------------------------------");
            System.out.println("Layanan      : " + pesanan[i].getNamaLayanan());
            System.out.println("Keluhan      : " + keluhan[i]);
            System.out.println("Jumlah Unit  : " + jumlahUnit[i]);
            System.out.println("Subtotal     : Rp" + subtotal);

            totalBayar += subtotal;
        }

        System.out.println("--------------------------------");
        System.out.println("Total Bayar: Rp" + totalBayar);
        System.out.println("Terima kasih telah menggunakan jasa service kami.");
    }
}
