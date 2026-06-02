public class SaldoTidakMencukupiException extends Exception{
    private double saldo;
    public SaldoTidakMencukupiException(double nominal, String pesan) {
        super(pesan);
    }

    public double getSaldo() {
        return saldo;
    }
}
