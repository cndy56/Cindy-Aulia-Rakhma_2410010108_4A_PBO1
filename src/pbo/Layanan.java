package pbo;
// CLASS
public class Layanan {

    // ATRIBUT + ENCAPSULATION
    private String namaLayanan;
    private String jenisKerusakan;
    private int biaya;

    // CONSTRUCTOR
    public Layanan(String namaLayanan, String jenisKerusakan, int biaya) {
        this.namaLayanan = namaLayanan;
        this.jenisKerusakan = jenisKerusakan;
        this.biaya = biaya;
    }

    // ACCESSOR / GETTER
    public String getNamaLayanan() {
        return namaLayanan;
    }

    // ACCESSOR / GETTER
    public String getJenisKerusakan() {
        return jenisKerusakan;
    }

    // ACCESSOR / GETTER
    public int getBiaya() {
        return biaya;
    }

    // MUTATOR / SETTER
    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    // MUTATOR / SETTER
    public void setJenisKerusakan(String jenisKerusakan) {
        this.jenisKerusakan = jenisKerusakan;
    }

    // MUTATOR / SETTER
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    // METHOD
    public int hitungTotal(int jumlahUnit) {
        return biaya * jumlahUnit;
    }

    // METHOD UNTUK POLYMORPHISM
    public void tampilkanInfo() {
        System.out.println(
            namaLayanan +
            " | Kerusakan: " + jenisKerusakan +
            " | Biaya: Rp" + biaya
        );
    }
}