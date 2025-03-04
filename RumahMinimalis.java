public class RumahMinimalis extends Rumah {
    private double luasBangunan;
    private double hargaPerMeter;

    public RumahMinimalis(double luasBangunan, double hargaPerMeter) {
        this.luasBangunan = luasBangunan;
        this.hargaPerMeter = hargaPerMeter;
    }

    @Override
    public void deskripsi() {
        System.out.println("Rumah Minimalis dengan luas bangunan " + luasBangunan + " meter persegi.");
    }

    @Override
    public double hitungHarga() {
        return luasBangunan * hargaPerMeter;
    }
}
