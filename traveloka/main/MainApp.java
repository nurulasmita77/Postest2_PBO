package traveloka.main;

import traveloka.management.Penerbangan;
import traveloka.management.DomesticFlight;
import traveloka.management.InternationalFlight;
import traveloka.management.TravelokaManagement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelokaManagement management = new TravelokaManagement();
        
        // Menu untuk perulangan pada program
        boolean running = true;
        while (running) {
            System.out.println("\n===== Sistem Manajemen Traveloka =====");
            System.out.println("1. Tambah Penerbangan");
            System.out.println("2. Tampilkan Semua Penerbangan");
            System.out.println("3. Perbarui Penerbangan");
            System.out.println("4. Hapus Penerbangan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid, harap masukkan angka.");
                scanner.nextLine(); // untuk newline yang tersisa
                continue; // untuk mengulangi perulangan
            }

            scanner.nextLine(); // untuk newline

            switch (pilihan) {
                case 1:
                    tambahPenerbangan(scanner, management);
                    break;

                case 2:
                    management.tampilkanSemuaPenerbangan();
                    break;

                case 3:
                    perbaruiPenerbangan(scanner, management);
                    break;

                case 4:
                    hapusPenerbangan(scanner, management);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem manajemen Traveloka.");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
    private static void tambahPenerbangan(Scanner scanner, TravelokaManagement management) {
        System.out.println("Pilih jenis penerbangan:");
        System.out.println("1. Penerbangan Domestik");
        System.out.println("2. Penerbangan Internasional");
        System.out.print("Pilih menu: ");

        int jenisPenerbangan = scanner.nextInt();
        scanner.nextLine(); // untuk newline

        try {
            System.out.print("Masukkan kode penerbangan: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan tujuan: ");
            String tujuan = scanner.nextLine();
            System.out.print("Masukkan harga tiket: ");
            double harga = scanner.nextDouble();
            scanner.nextLine(); // untuk newline

            Penerbangan penerbanganBaru;
            if (jenisPenerbangan == 1) {
                System.out.print("Masukkan kode bandara: ");
                String airportCode = scanner.nextLine();
                penerbanganBaru = new DomesticFlight(kode, tujuan, harga, airportCode);
            } else if (jenisPenerbangan == 2) {
                System.out.print("Masukkan Kota tujuan: ");
                String destinationCity = scanner.nextLine();
                penerbanganBaru = new InternationalFlight(kode, tujuan, harga, destinationCity);
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }

            management.tambahPenerbangan(penerbanganBaru);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid untuk harga tiket, harap masukkan angka.");
            scanner.nextLine(); // untuk input apabila ada yang salah
        }
    }

    private static void perbaruiPenerbangan(Scanner scanner, TravelokaManagement management) {
        try {
            System.out.print("Masukkan kode penerbangan yang ingin diperbarui: ");
            String kodeUpdate = scanner.nextLine();
            System.out.print("Masukkan tujuan baru: ");
            String tujuanBaru = scanner.nextLine();
            System.out.print("Masukkan harga baru: ");
            double hargaBaru = scanner.nextDouble();
            scanner.nextLine(); // untuk newline

            management.perbaruiPenerbangan(kodeUpdate, tujuanBaru, hargaBaru);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid untuk harga tiket, harap masukkan angka.");
            scanner.nextLine(); // untuk input apabila yang salah
        }
    }

    private static void hapusPenerbangan(Scanner scanner, TravelokaManagement management) {
        System.out.print("Masukkan kode penerbangan yang ingin dihapus: ");
        String kodeHapus = scanner.nextLine();
        management.hapusPenerbangan(kodeHapus);
    }
}