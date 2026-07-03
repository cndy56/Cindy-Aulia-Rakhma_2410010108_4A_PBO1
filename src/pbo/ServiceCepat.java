package pbo;
// CLASS + INHERITANCE
public class ServiceCepat extends Layanan {

    // ATRIBUT + ENCAPSULATION
    private int biayaTambahan;

    // CONSTRUCTOR
    public ServiceCepat(String namaLayanan, String jenisKerusakan, int biaya, int biayaTambahan) {
        super(namaLayanan, jenisKerusakan, biaya);
        this.biayaTambahan = biayaTambahan;
    }

    // ACCESSOR / GETTER
    public int getBiayaTambahan() {
        return biayaTambahan;
    }

    // MUTATOR / SETTER
    public void setBiayaTambahan(int biayaTambahan) {
        this.biayaTambahan = biayaTambahan;
    }

    // POLYMORPHISM / OVERRIDING METHOD
    @Override
    public int hitungTotal(int jumlahUnit) {
        return (getBiaya() + biayaTambahan) * jumlahUnit;
    }

    // POLYMORPHISM / OVERRIDING METHOD
    @Override
    public void tampilkanInfo() {
        System.out.println(
            "[Service Cepat] " + getNamaLayanan() +
            " | Kerusakan: " + getJenisKerusakan() +
            " | Biaya: Rp" + getBiaya() +
            " | Tambahan Cepat: Rp" + biayaTambahan
        );
    }
}
