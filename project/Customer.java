/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Salsabila
 */
    //Inheritance: Mewarisi sifat-sifat dari class DataDiri
public class Customer extends DataDiri{
    public Customer(String nama, String alamat, int TotalJam) {
        super(nama, alamat, TotalJam);
    }

    // Polimorfisme: implementasi deskripsi khusus untuk customer
    @Override
    public void NotaPenitip() {
        System.out.println("=====Data Penitipan Barang=====");
        System.out.println("Nama : "+ nama);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Total Jam : "+ TotalJam + " Jam");
    }
}
