/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KursusModel;

/**
 *
 * @author Asus
 */
public abstract class Kursus {
    protected String judul;
    protected String instruktur;

    public Kursus(String judul, String instruktur) {
        this.judul = judul;
        this.instruktur = instruktur;
    }

    // abstract method → wajib diimplementasi
    public abstract void tampilkanInfo();

    public void mulaiKursus() {
        System.out.println("Kursus " + judul + " dimulai bersama instruktur " + instruktur);
    }
}