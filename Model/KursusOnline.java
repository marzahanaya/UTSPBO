/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class KursusOnline {
    private String namaKursus;
    private Siswa siswa;

    public KursusOnline(String namaKursus, Siswa siswa) {
        this.namaKursus = namaKursus;
        this.siswa = siswa;
    }

    public String getNama() {
        return namaKursus;
    }

    public void setNama(String namaKursus) {
        this.namaKursus = namaKursus;
    }

    public Siswa getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa siswa) {
        this.siswa = siswa;
    }
}