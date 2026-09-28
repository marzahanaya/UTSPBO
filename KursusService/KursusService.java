package KursusService;

import KursusModel.ModelKursus;
import KursusModel.KursusOnline;
import KursusModel.KursusOffline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class KursusService {
    private final ArrayList<ModelKursus> daftarKursus = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    // CREATE (default input lewat console)
    public void tambahKursus() {
        System.out.print("Masukkan ID kursus: ");
        String id = scanner.nextLine().trim();
        System.out.print("Nama kursus: ");
        String nama = scanner.nextLine().trim();
        System.out.print("Nama pengajar: ");
        String pengajar = scanner.nextLine().trim();
        System.out.print("Durasi (jam): ");
        String d = scanner.nextLine().trim();

        if (id.isEmpty() || nama.isEmpty() || pengajar.isEmpty() || d.isEmpty()) {
            System.out.println("Input tidak boleh kosong.");
            return;
        }

        int durasi;
        try {
            durasi = Integer.parseInt(d);
            if (durasi <= 0) {
                System.out.println("Durasi harus lebih dari 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Durasi harus berupa angka.");
            return;
        }

        for (ModelKursus k : daftarKursus) {
            if (k.getIdKursus().equals(id)) {
                System.out.println("ID kursus sudah ada.");
                return;
            }
        }

        daftarKursus.add(new ModelKursus(id, nama, pengajar, durasi));
        System.out.println("Kursus berhasil ditambahkan.");
    }

    // === OVERLOADING ===
    // Tambah kursus secara langsung dengan objek
    public void tambahKursus(ModelKursus kursus) {
        daftarKursus.add(kursus);
        System.out.println("Kursus berhasil ditambahkan lewat overloading (objek).");
    }

    // Tambah kursus online langsung lewat parameter
    public void tambahKursus(String id, String nama, String pengajar, int durasi, String platform) {
        ModelKursus kursus = new KursusOnline(id, nama, pengajar, durasi, platform);
        daftarKursus.add(kursus);
        System.out.println("Kursus Online berhasil ditambahkan lewat overloading (parameter).");
    }

    // Tambah kursus offline langsung lewat parameter
    public void tambahKursus(String id, String nama, String pengajar, int durasi, String lokasi, int kapasitas) {
        ModelKursus kursus = new KursusOffline(id, nama, pengajar, durasi, lokasi, kapasitas);
        daftarKursus.add(kursus);
        System.out.println("Kursus Offline berhasil ditambahkan lewat overloading (parameter).");
    }

    // READ
    public void tampilkanKursus() {
        if (daftarKursus.isEmpty()) {
            System.out.println("Belum ada kursus.");
            return;
        }
        System.out.println("=== Daftar Kursus ===");
        for (ModelKursus k : daftarKursus) {
            // Polymorphism (Overriding getTipe)
            System.out.println(k.getIdKursus() + " - " + k.getNamaKursus() +
                               " | " + k.getPengajar() +
                               " | " + k.getDurasi() + " jam" +
                               " | Tipe: " + k.getTipe());
        }
    }

    // UPDATE
    public void ubahKursus() {
        System.out.print("Masukkan ID kursus yang ingin diubah: ");
        String id = scanner.nextLine().trim();

        for (ModelKursus k : daftarKursus) {
            if (k.getIdKursus().equals(id)) {
                System.out.print("Nama kursus baru (kosong = tidak diubah): ");
                String nama = scanner.nextLine().trim();
                if (!nama.isEmpty()) k.setNamaKursus(nama);

                System.out.print("Pengajar baru (kosong = tidak diubah): ");
                String pengajar = scanner.nextLine().trim();
                if (!pengajar.isEmpty()) k.setPengajar(pengajar);

                System.out.print("Durasi baru (kosong = tidak diubah): ");
                String d = scanner.nextLine().trim();
                if (!d.isEmpty()) {
                    try {
                        int durasi = Integer.parseInt(d);
                        if (durasi > 0) k.setDurasi(durasi);
                    } catch (NumberFormatException e) {
                        System.out.println("Input durasi bukan angka, tidak diubah.");
                    }
                }

                System.out.println("Data kursus berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Kursus dengan ID tersebut tidak ditemukan.");
    }

    // DELETE
    public void hapusKursus() {
        System.out.print("Masukkan ID kursus yang ingin dihapus: ");
        String id = scanner.nextLine().trim();

        Iterator<ModelKursus> it = daftarKursus.iterator();
        while (it.hasNext()) {
            ModelKursus k = it.next();
            if (k.getIdKursus().equals(id)) {
                it.remove();
                System.out.println("Kursus berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kursus tidak ditemukan.");
    }

    // SEARCH
    public void cariKursus() {
        System.out.print("Masukkan kata kunci nama kursus/pengajar: ");
        String key = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        for (ModelKursus k : daftarKursus) {
            if (k.getNamaKursus().toLowerCase().contains(key) ||
                k.getPengajar().toLowerCase().contains(key)) {
                System.out.println(k);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada kursus yang cocok dengan pencarian.");
        }
    }
}
