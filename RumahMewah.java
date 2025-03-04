public class RumahMewah extends Rumah {
    private int jumlahLantai;
    private double luasTanah;
    private double hargaPerMeter;

    public RumahMewah(int jumlahLantai, double luasTanah, double hargaPerMeter) {
        this.jumlahLantai = jumlahLantai;
        this.luasTanah = luasTanah;
        this.hargaPerMeter = hargaPerMeter;
    }

    @Override
    public void deskripsi() {
        System.out.println("Rumah Mewah dengan " + jumlahLantai + " lantai, luas tanah " 
                           + luasTanah + " meter persegi.");
    }

    @Override
    public double hitungHarga() {
        return luasTanah * hargaPerMeter * 1.5;
    }
}
