package KursusModel;

public class KursusOnline extends ModelKursus implements Evaluasi {
    private String platform;

    public KursusOnline(String id, String nama, String pengajar, int durasi, String platform) {
        super(id, nama, pengajar, durasi);
        this.platform = platform;
    }

    public String getPlatform() { 
        return platform; 
    }

    public void setPlatform(String platform) { 
        this.platform = platform; 
    }

    @Override
    public String getTipe() {
        return "Online (" + platform + ")";
    }

    // Implementasi dari interface Evaluasi
    @Override
    public void beriNilai(int nilai) {
        System.out.println("Siswa diberi nilai: " + nilai + 
                           " untuk kursus online " + getNamaKursus());
    }

    @Override
    public void laporkanHasil() {
        System.out.println("Laporan hasil kursus online " + 
                           getNamaKursus() + " selesai.");
    }
}
