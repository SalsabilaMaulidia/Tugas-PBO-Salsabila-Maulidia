/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Salsabila
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Customer
        Customer penitip = new Customer("Salsabila", "Musa Enda", 48);

        // Menggunakan polimorfisme untuk menampilkan deskripsi NotaPenitip
        penitip.NotaPenitip();
    }
}
