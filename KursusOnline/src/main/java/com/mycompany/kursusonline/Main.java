/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kursusonline;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> kursus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM CRUD KURSUS ONLINE ===");
            System.out.println("1. Tambah Kursus (Create)");
            System.out.println("2. Lihat Kursus (Read)");
            System.out.println("3. Ubah Kursus (Update)");
            System.out.println("4. Hapus Kursus (Delete)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1 -> { // CREATE
                    System.out.print("Masukkan nama kursus: ");
                    String nama = sc.nextLine();
                    kursus.add(nama);
                    System.out.println("Kursus berhasil ditambahkan.");
                }

                case 2 -> { // READ
                    if (kursus.isEmpty()) {
                        System.out.println("Belum ada kursus.");
                    } else {
                        System.out.println("\nDaftar Kursus:");
                        for (int i = 0; i < kursus.size(); i++) {
                            System.out.println((i + 1) + ". " + kursus.get(i));
                        }
                    }
                }

                case 3 -> { // UPDATE
                    if (kursus.isEmpty()) {
                        System.out.println("Belum ada kursus.");
                    } else {
                        System.out.println("\nDaftar Kursus:");
                        for (int i = 0; i < kursus.size(); i++) {
                            System.out.println((i + 1) + ". " + kursus.get(i));
                        }
                        System.out.print("Pilih nomor kursus yang ingin diubah: ");
                        int idx = sc.nextInt();
                        sc.nextLine();
                        if (idx > 0 && idx <= kursus.size()) {
                            System.out.print("Masukkan nama kursus baru: ");
                            String baru = sc.nextLine();
                            kursus.set(idx - 1, baru);
                            System.out.println("Kursus berhasil diubah.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }

                case 4 -> { // DELETE
                    if (kursus.isEmpty()) {
                        System.out.println("Belum ada kursus.");
                    } else {
                        System.out.println("\nDaftar Kursus:");
                        for (int i = 0; i < kursus.size(); i++) {
                            System.out.println((i + 1) + ". " + kursus.get(i));
                        }
                        System.out.print("Pilih nomor kursus yang ingin dihapus: ");
                        int idx = sc.nextInt();
                        sc.nextLine();
                        if (idx > 0 && idx <= kursus.size()) {
                            kursus.remove(idx - 1);
                            System.out.println("Kursus berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tidak valid.");
                        }
                    }
                }

                case 0 -> System.out.println("Keluar dari program. Terima kasih!");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

