/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traveloka.management;

/**
 *
 * @author ASUS
 */
public class InternationalFlight extends Penerbangan {
    private String destinationCity;

    public InternationalFlight(String kodePenerbangan, String tujuan, double hargaTiket, String destinationCity) {
        super(kodePenerbangan, tujuan, hargaTiket);
        this.destinationCity = destinationCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}

