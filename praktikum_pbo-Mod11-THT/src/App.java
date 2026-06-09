import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PusatKontrol kontrol = new PusatKontrol();
        int pilih = 0;

        System.out.println("-----JAVA EXPRESS!------");

        do {
            System.out.println("\n--- MENU UTAMA JAVA EXPRESS ---");
            System.out.println("1. Lihat Jadwal & Sisa Kursi");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            
            try {
                pilih = in.nextInt();
                // in.nextInt();
            } 
            catch (InputMismatchException e) {
                System.out.println("ERROR, Input harus berupa angka pilihan menu! Silakan coba lagi.");
                in.nextLine();
                continue;
            }

            switch (pilih) {
                case 1:
                    for (KeretaApi k : kontrol.getDaftarK()) {
                        System.out.println("\nKODE\t|" + "NAMA KERETA\t|" + "RUTE    \t|" + "SISA KURSI\t|");
                        System.out.println(k.getKodeKereta() + "\t " + k.getNamaKereta() + "\t " + k.getRutePerjalanan() + "\t " + k.getSisaKursi());
                    }
                    break;

                case 2:
                    System.out.println("\n--- FORM RESERVASI TIKET ---");
                    System.out.print("Masukkan Kode Kereta: ");
                    in.nextLine();
                    String kode = in.nextLine();
                    

                    System.out.print("Masukkan NIK        : ");
                    String nik = in.nextLine();

                    System.out.print("Masukkan Nama       : ");
                    String nama = in.nextLine();
                    
                    int jumlahTiket = 0;
                    System.out.print("Jumlah Tiket        : ");
                    
                    try {
                        jumlahTiket = in.nextInt();
                        in.nextLine(); 
                    } 
                    catch (InputMismatchException e) {
                        System.out.println("\nERROR, Jumlah tiket harus diisi dengan angka angka bulat!");
                        in.nextLine();
                        break; 
                    }

                   
                    try {
                        kontrol.pemesanan(kode, nik, nama, jumlahTiket);
                    } 
                    catch (DataPenumpangTidakValidException e) {
                        System.out.println("\nVALIDASI GAGAL, " + e.getMessage());
                    } 
                    catch (RuteTidakDitemukanException e) {
                        System.out.println("\nRUTE ERROR, " + e.getMessage());
                    } 
                    catch (TiketHabisException e) {
                        System.out.println("\nKUOTA PENUH, " + e.getMessage());
                    }
                    break;
            
                case 3:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! coba lagi");
                    break;
            }

            
        } while (pilih != 3);
        
        try {
            System.out.println("Menutup JAVA EXPRESS!");
        } 
        finally {
            System.out.println("Sayonara!");
            in.close();
        }
    }
}
