/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

/**
 *
 * @author Asus
 */

import Model.KursusOnline;
import Model.Siswa;
import java.util.ArrayList;
import java.util.Scanner;

public class posttestpbo {
    public static void main(String[] args) {
        ArrayList<KursusOnline> daftarKursus = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n=== MENU KURSUS ONLINE ===");
                System.out.println("1. Tambah Kursus");
                System.out.println("2. Lihat Kursus");
                System.out.println("3. Ubah Kursus");
                System.out.println("4. Hapus Kursus");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilihan = input.nextInt();
                input.nextLine(); // buang newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama kursus: ");
                        String namaKursus = input.nextLine();
                        
                        System.out.print("Masukkan nama siswa: ");
                        String namaSiswa = input.nextLine();
                        
                        Siswa siswa = new Siswa(namaSiswa);
                        daftarKursus.add(new KursusOnline(namaKursus, siswa));
                        System.out.println("Kursus berhasil ditambahkan.");
                    }
                    
                    case 2 -> {
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus.");
                        } else {
                            System.out.println("Daftar Kursus:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                KursusOnline k = daftarKursus.get(i);
                                System.out.println((i + 1) + ". " + k.getNama() + " (Siswa: " + k.getSiswa().getNama() + ")");
                            }
                        }
                    }
                    
                    case 3 -> {
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus.");
                        } else {
                            System.out.println("Pilih nomor kursus yang ingin diubah:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                KursusOnline k = daftarKursus.get(i);
                                System.out.println((i + 1) + ". " + k.getNama() + " (Siswa: " + k.getSiswa().getNama() + ")");
                            }
                            System.out.print("Nomor: ");
                            int index = input.nextInt();
                            input.nextLine();
                            
                            if (index > 0 && index <= daftarKursus.size()) {
                                System.out.print("Masukkan nama kursus baru: ");
                                String namaBaru = input.nextLine();
                                
                                System.out.print("Masukkan nama siswa baru: ");
                                String namaSiswaBaru = input.nextLine();
                                
                                KursusOnline kursus = daftarKursus.get(index - 1);
                                kursus.setNama(namaBaru);
                                kursus.getSiswa().setNama(namaSiswaBaru);
                                
                                System.out.println("Data berhasil diubah.");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                    
                    case 4 -> {
                        if (daftarKursus.isEmpty()) {
                            System.out.println("Belum ada kursus.");
                        } else {
                            System.out.println("Pilih nomor kursus yang ingin dihapus:");
                            for (int i = 0; i < daftarKursus.size(); i++) {
                                KursusOnline k = daftarKursus.get(i);
                                System.out.println((i + 1) + ". " + k.getNama() + " (Siswa: " + k.getSiswa().getNama() + ")");
                            }
                            System.out.print("Nomor: ");
                            int index = input.nextInt();
                            input.nextLine();
                            
                            if (index > 0 && index <= daftarKursus.size()) {
                                daftarKursus.remove(index - 1);
                                System.out.println("Kursus berhasil dihapus.");
                            } else {
                                System.out.println("Nomor tidak valid.");
                            }
                        }
                    }
                    
                    case 0 -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Pilihan tidak valid.");
                }
                
            } while (pilihan != 0);
        }
    }
}