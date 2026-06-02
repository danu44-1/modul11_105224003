public class Main {
    public static void main(String[] args) throws Exception {
        AkunBank rekening1 = new AkunBank("105", 10000);
        AkunBank rekening2 = new AkunBank("003", 10000);

        try {
            rekening1.tarikTunai(30000);

            rekening1.transfer(rekening2, 15000000);
        }
        catch(SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
            System.out.println("Kekurangannya : " + e.getSaldo());
        }
        catch(BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Sesi transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis");
        }
    }
}
