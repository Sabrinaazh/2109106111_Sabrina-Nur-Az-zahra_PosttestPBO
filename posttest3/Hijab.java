package posttest3;

public class Hijab extends ProdukToko {
    private String bahan;
    
        public Hijab(String jenis, String warna, int harga, String bahan) {
        super(jenis, warna, harga);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
}