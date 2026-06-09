public class KeretaApi {
    private String kodeKereta;
    private String namaKereta;
    private String rutePerjalanan;
    private int sisaKursi;

    KeretaApi(String kodeKereta, String namaKereta, String rute, int sisaKursi) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.rutePerjalanan = rute;
        this.sisaKursi = sisaKursi;
    }

    public String getKodeKereta() {
        return kodeKereta;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getRutePerjalanan() {
        return rutePerjalanan;
    }

    public int getSisaKursi() {
        return sisaKursi;
    }

    // public void setKodeKereta(String kodeKereta) {
    //     this.kodeKereta = kodeKereta;
    // }

    // public void setNamaKereta(String namaKereta) {
    //     this.namaKereta = namaKereta;
    // }

    // public void setRutePerjalanan(String rutePerjalanan) {
    //     this.rutePerjalanan = rutePerjalanan;
    // }

    public void setSisaKursi(int sisaKursi) {
        this.sisaKursi -= sisaKursi;
    }
}
