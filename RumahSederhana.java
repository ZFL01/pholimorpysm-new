public class RumahSederhana extends Rumah {
    private double luasTanah;
    private double hargaPerMeter;

    public RumahSederhana(double luasTanah, double hargaPerMeter) {
        this.luasTanah = luasTanah;
        this.hargaPerMeter = hargaPerMeter;
    }

    @Override
    public void deskripsi() {
        System.out.println("Rumah Sederhana dengan luas tanah " + luasTanah + " meter persegi.");
    }

    @Override
    public double hitungHarga() {
        return luasTanah * hargaPerMeter;
    }
}
