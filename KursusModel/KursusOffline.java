package KursusModel;

public class KursusOffline extends ModelKursus {
    private String lokasi;
    private int kapasitas;

    public KursusOffline(String id, String nama, String pengajar, int durasi, String lokasi, int kapasitas) {
        super(id, nama, pengajar, durasi);
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
    }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public int getKapasitas() { return kapasitas; }
    public void setKapasitas(int kapasitas) { this.kapasitas = kapasitas; }

    @Override
    public String getTipe() {
        return "Offline (lokasi: " + lokasi + ", kapasitas: " + kapasitas + ")";
    }
}
