// Danu Dimas Putra 105224003
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int[] harga = new int[3];

        try { // Soal 1
            for (int i = 0; i < 4; i++) {
                System.out.print("Masukkan Harga untuk menu " + (i + 1) + " : ");
                harga[i] = in.nextInt();
            }
        }
        catch(InputMismatchException e) {
            System.out.println( "Error: Input harga harus berupa angka!");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println( "Error: Kapasitas memori harga sudah penuh!");
        }
        
        try { // Soal 2
            Pelanggan p = new Pelanggan();
            p.daftarMember(15);
        } 
        catch(IllegalArgumentException e) {
            System.out.println("Maaf umur anda kurang memenuhi!");
        }

        Pelanggan p = new Pelanggan();
        try { // Soal 3
            p.pesanKopi(10);
        }
        catch(KopiHabisException e) {
            System.out.println("Stok Kopi : " + p.stokKopi);
        }

        MesinKasir m = new MesinKasir();
        try { // soal 4
            m.metodeBayar(50000, 30000);
        }
        catch(KopiHabisException pesan) {
            System.out.println("Error");
        }

        try { // soal 5
            m.cetakStruk(false);
        }
        catch(Exception e) {
            System.out.println("");
        }
        finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup.");
        }
    }
}
