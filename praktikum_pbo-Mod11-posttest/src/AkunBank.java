public class AkunBank {
    private String nomorRek;
    private double saldo, totalTFHariIni;

    AkunBank(String nomorRek, double saldo) {
        this.nomorRek = nomorRek;
        this.saldo = saldo;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (saldo < nominal) {
            // System.out.println("Saldo tidak cukup");
            throw new SaldoTidakMencukupiException(saldo, "Saldo Kurang mas!!");
        }
    }

    public void transfer(AkunBank tujuan, double nominal) throws BatasTransferHarianException, SaldoTidakMencukupiException {
        if (saldo < nominal) {
            throw new SaldoTidakMencukupiException(saldo, "Saldo Kurang mas!!");
        }
        else if (nominal > 10000000) {
            throw new BatasTransferHarianException("Melebihi Limit mas!");
        }
        else {
            totalTFHariIni += nominal;
            saldo -= nominal;
        }
    }

    public String getNomorRek() {
        return nomorRek;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotalTFHariIni() {
        return totalTFHariIni;
    }

    public void setNomorRek(String nomorRek) {
        this.nomorRek = nomorRek;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTotalTFHariIni(double totalTFHariIni) {
        this.totalTFHariIni = totalTFHariIni;
    }
}
