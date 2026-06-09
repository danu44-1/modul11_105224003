import java.util.ArrayList;

public class PusatKontrol {
    private ArrayList<KeretaApi> daftarK = new ArrayList<>();

    PusatKontrol() {
        daftarK.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarK.add(new KeretaApi("K02","Parahyangan", "JKT - BDG", 15));
    }
    
    public ArrayList<KeretaApi> getDaftarK() {
        return daftarK;
    }

    public void pemesanan(String kodeKereta, String nik, String namaP, int jumlahTiket) throws DataPenumpangTidakValidException, RuteTidakDitemukanException, TiketHabisException{
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("Data penumpang " + nik + " Tidak Valid!" );
        }

        for (char c : nik.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new DataPenumpangTidakValidException("Data penumpang " + nik + " Tidak Valid!");
            }
        }

        KeretaApi valid = null;
        for (KeretaApi k : daftarK) {
            if (k.getKodeKereta().contentEquals(kodeKereta)) {
                valid = k;
                break;
            }
        }

        if (valid == null) {
            throw new RuteTidakDitemukanException("Kode kereta '" + kodeKereta + "' tidak ditemukan dalam sistem.");
        }
        
        if (jumlahTiket > valid.getSisaKursi()) {
            throw new TiketHabisException(valid.getNamaKereta(), valid.getSisaKursi());
        }

        valid.setSisaKursi(jumlahTiket);
        System.out.println("\nRESERVASI BERHASIL DISIMPAN!");
        System.out.println("Penumpang   : " + namaP);
        System.out.println("NIK      : " + nik);
        System.out.println("Kereta      : " + valid.getNamaKereta() + " (" + valid.getRutePerjalanan() + ")");
        System.out.println("Jumlah Tiket: " + jumlahTiket + " kursi");
    }
}
