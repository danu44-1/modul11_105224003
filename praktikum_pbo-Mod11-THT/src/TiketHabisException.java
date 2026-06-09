public class TiketHabisException extends Exception{
    private String namaKereta;
    private int sisaKursi;

    public TiketHabisException(String namaKereta, int sisaKursi) {
        super("Gagal memesan! Sisa kursi pada " + namaKereta + " hanya tinggal " + sisaKursi + " kursi.");
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public int getSisaKursi() {
        return sisaKursi;
    }
}
