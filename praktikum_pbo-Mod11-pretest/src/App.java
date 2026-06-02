import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan Angka pembilang : ");
            int angkaA = in.nextInt();

            System.out.print("Masukkan Angka Penyebut : ");
            int angkaB = in.nextInt();

            int hasil = angkaA / angkaB;
            System.out.println("Hasil pembagian : " + hasil);
        }
        catch(ArithmeticException e) {
            System.out.println("Angka tidak terduga!");
        }
        catch(InputMismatchException e) {
            System.out.println("Input salah! coba lagi dengan angka");
        }
        finally {
            in.close();
            System.out.println("Proses kalkulasi selesai dan memori telah dibersihkan!");
        }
    }
}
