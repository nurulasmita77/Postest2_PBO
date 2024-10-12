/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traveloka.management;

/**
 *
 * @author ASUS
 */
public class DomesticFlight extends Penerbangan {
    private String airportCode;

    public DomesticFlight(String kodePenerbangan, String tujuan, double hargaTiket, String airportCode) {
        super(kodePenerbangan, tujuan, hargaTiket);
        this.airportCode = airportCode;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }
}