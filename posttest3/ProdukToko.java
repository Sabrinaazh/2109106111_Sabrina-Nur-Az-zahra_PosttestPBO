package posttest3;

public class ProdukToko {
    private String jenis;
    private String warna;
    private int harga;

    public ProdukToko(String jenis, String warna, int harga) {
        this.jenis = jenis;
        this.warna = warna;
        this.harga = harga;
    }

    public String getjenis() {
        return jenis;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

    public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public int getharga() {
        return harga;
    }


    public void setharga(int harga) {
        this.harga = harga;
    }
    
    public void tambah(){
        System.out.println("------------------------------------------------");
        System.out.println("|       Produk toko Berhasil Ditambahkan!       |");
        System.out.println("------------------------------------------------");        
    }
    
    public void edit(){
        System.out.println("------------------------------------------------");
        System.out.println("|          Produk toko Berhasil Diubah!        |");
        System.out.println("------------------------------------------------");   
    }
    
    public void hapus(){
        System.out.println("------------------------------------------------");
        System.out.println("|         Produk toko Berhasil Dihapus!         |");
        System.out.println("------------------------------------------------");   
    }
}
