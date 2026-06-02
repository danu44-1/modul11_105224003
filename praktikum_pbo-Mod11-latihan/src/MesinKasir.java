public class MesinKasir {
    public void metodeBayar(int totalBelanja, int uangDiberikan) throws UangKurangException{
        if (uangDiberikan < totalBelanja) {
           // throw new UangKurangException("Uang tidak cukup!");
           System.out.println("uang tidak cukup");
        }
        else {
            System.out.println("Uang Cukup");
        }
    }

    public void cetakStruk(boolean statusPrinter) throws Exception{
        if (statusPrinter == false) {
            throw new Exception("Printer error: Kertas struk habis!");
        }
    }
}
