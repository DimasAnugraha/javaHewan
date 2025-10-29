public class Hewan {
    private String nama;
    private int umur;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Method yang akan dioverride di subclass
    public String getMakanan() {
        return "Tidak diketahui";
    }
}