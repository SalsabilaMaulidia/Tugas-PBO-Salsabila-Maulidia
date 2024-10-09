/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Salsabila
 */
abstract class DataDiri {
    // Enkapsulasi: properti nama, alamat dan total jam 
    public String nama;
    public String alamat;
    public int TotalJam = 0;

    // Konstruktor untuk menginisialisasi nama, alamat dan total jam
    public DataDiri(String nama, String alamat, int TotalJam) {
        this.nama = nama;
        this.alamat = alamat;
        this.TotalJam = TotalJam;
    }
    // Abstraksi: method NotaPenitip harus diimplementasikan oleh kelas customer
    public abstract void NotaPenitip();
}

