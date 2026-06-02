public class Pelanggan{
    int stokKopi;

    Pelanggan() {
        this.stokKopi = 5;
    }

    public void daftarMember(int umur) {
        if (umur <= 17) {
            throw new IllegalArgumentException("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP"); 
        }
    }

    public void pesanKopi(int jumlahPesanan) throws KopiHabisException{
        if (stokKopi < jumlahPesanan) {
            throw new KopiHabisException("Stok tidak mencukupi");
        }
        else {
            stokKopi -= jumlahPesanan;
            System.out.println("Stok sudah dikurangi!");
        }
    }
}
