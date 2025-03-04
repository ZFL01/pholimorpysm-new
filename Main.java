import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    public static void main(String[] args) {
        Rumah[] daftarRumah = {
            new RumahMewah(2, 250.0, 10000000),
            new RumahSederhana(120.0, 5000000),
            new RumahMinimalis(80.0, 7000000)
        };

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');   
        symbols.setDecimalSeparator(',');     
        DecimalFormat formatter = new DecimalFormat("Rp #,##0", symbols);

        for (Rumah rumah : daftarRumah) {
            rumah.deskripsi();
            System.out.println("Harga: " + formatter.format(rumah.hitungHarga()));
            System.out.println("-------------------------");
        }
    }
}
