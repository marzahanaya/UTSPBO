/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KursusMain;
import KursusService.KursusService;
import java.util.Scanner;
/**
 *
 * @author Asus
 */

public class MainKursus {
    public static void main(String[] args) {
        KursusService service = new KursusService();
        try (Scanner sc = new Scanner(System.in)) {
            int pilih;
            
            do {
                System.out.println("\n=== MENU KURSUS ONLINE ===");
                System.out.println("1. Tambah kursus");
                System.out.println("2. Lihat kursus");
                System.out.println("3. Ubah kursus");
                System.out.println("4. Hapus kursus");
                System.out.println("5. Cari kursus");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                
                String line = sc.nextLine().trim();
                if (line.isEmpty()) {
                    pilih = -1;
                } else {
                    try {
                        pilih = Integer.parseInt(line);
                    } catch (NumberFormatException e) {
                        pilih = -1;
                    }
                }
                
                switch (pilih) {
                    case 1 -> service.tambahKursus();
                    case 2 -> service.tampilkanKursus();
                    case 3 -> service.ubahKursus();
                    case 4 -> service.hapusKursus();
                    case 5 -> service.cariKursus();
                    case 0 -> System.out.println("Anda Keluar. Terima kasih sudah menggunakan program ini!.");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilih != 0);
        }
    }

}