package traveloka.management;

import java.util.List;
import java.util.ArrayList;

public final class TravelokaManagement implements FlightCRUD {
    // Properties
    private final ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();

    // Method untuk menambahkan penerbangan
    @Override
    public void tambahPenerbangan(Penerbangan penerbangan) {
        daftarPenerbangan.add(penerbangan);
        System.out.println("Penerbangan berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua penerbangan
    @Override
    public void tampilkanSemuaPenerbangan() {
        if (daftarPenerbangan.isEmpty()) {
            System.out.println("Tidak ada penerbangan.");
        } else {
            for (Penerbangan penerbangan : daftarPenerbangan) {
                penerbangan.tampilkanInfo();
            }
        }
    }

    // Method untuk menghapus penerbangan berdasarkan kode
    @Override
    public void hapusPenerbangan(String kodePenerbangan) {
        boolean ditemukan = false;
        for (Penerbangan penerbangan : daftarPenerbangan) {
            if (penerbangan.getKodePenerbangan().equals(kodePenerbangan)) {
                daftarPenerbangan.remove(penerbangan);
                System.out.println("Penerbangan berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Penerbangan tidak ditemukan.");
        }
    }

    // Method untuk memperbarui data penerbangan
    @Override
    public void perbaruiPenerbangan(String kodePenerbangan, String tujuanBaru, double hargaBaru) {
        boolean ditemukan = false;
        for (Penerbangan penerbangan : daftarPenerbangan) {
            if (penerbangan.getKodePenerbangan().equals(kodePenerbangan)) {
                penerbangan.setTujuan(tujuanBaru);
                penerbangan.setHargaTiket(hargaBaru);
                System.out.println("Penerbangan berhasil diperbarui.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Penerbangan tidak ditemukan.");
        }
    }
}
