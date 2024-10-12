/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package traveloka.management;

/**
 *
 * @author ASUS
 */
public interface FlightCRUD {
    void tambahPenerbangan(Penerbangan penerbangan);
    void tampilkanSemuaPenerbangan();
    void perbaruiPenerbangan(String kodePenerbangan, String tujuan, double hargaTiket);
    void hapusPenerbangan(String kodePenerbangan);
}
