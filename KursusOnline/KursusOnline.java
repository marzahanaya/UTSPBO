/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kursusonline;

import java.util.ArrayList;
import java.util.Scanner;

public class KursusOnline {
    public static void main(String[] args) {
        ArrayList<String> daftarKursus = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n=== MENU MANAJEMEN KURSUS ONLINE ===");
                System.out.println("1. Tambah Kursus");
                System.out.println("2. Lihat Kursus");
                System.out.println("3. Edit Kursus");
                System.out.println("4. Hapus Kursus");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine(); // membersihkan enter
                
                switch (pilihan) {
                    case 1: // CREATE
                        System.out.print("Masukkan nama kursus baru: ");
                        String namaBaru = input.nextLine();
                        daftarKursus.add(namaBaru);
                        System.out.println("Kursus berhasil ditambahkan!");
                        break;
                        
                    case 2: // READ
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus yang tersedia.");
                        } else {
                            System.out.println("\nDaftar Kursus:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarKursus.get(i));
                            }
                        }
                        break;
                        
                    case 3: // UPDATE
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus yang bisa diubah.");
                        } else {
                            System.out.println("\nDaftar Kursus:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarKursus.get(i));
                            }
                            System.out.print("Masukkan nomor kursus yang ingin diedit: ");
                            int editIdx = input.nextInt();
                            input.nextLine();
                            if (editIdx > 0 && editIdx <= daftarKursus.size()) {
                                System.out.print("Masukkan nama kursus baru: ");
                                String kursusBaru = input.nextLine();
                                daftarKursus.set(editIdx - 1, kursusBaru);
                                System.out.println("Kursus berhasil diperbarui!");
                            } else {
                                System.out.println("Nomor kursus tidak valid.");
                            }
                        }
                        break;
                        
                    case 4: // DELETE
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus yang bisa dihapus.");
                        } else {
                            System.out.println("\nDaftar Kursus:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarKursus.get(i));
                            }
                            System.out.print("Masukkan nomor kursus yang ingin dihapus: ");
                            int hapusIdx = input.nextInt();
                            input.nextLine();
                            if (hapusIdx > 0 && hapusIdx <= daftarKursus.size()) {
                                daftarKursus.remove(hapusIdx - 1);
                                System.out.println("Kursus berhasil dihapus!");
                            } else {
                                System.out.println("Nomor kursus tidak valid.");
                            }
                        }
                        break;
                        
                    case 0:
                        System.out.println("Terima kasih, program selesai.");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak tersedia, coba lagi.");
                }
            } while (pilihan != 0);
        }
    }
}
