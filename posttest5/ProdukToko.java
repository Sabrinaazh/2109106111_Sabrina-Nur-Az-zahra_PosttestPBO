package posttest5;

public abstract class ProdukToko {
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
    
    //Overloading
    public void toko(String jenis, int harga){
        System.out.println("\n------------------------------------------------");
        System.out.println("Data produk dengan jenis jilbab " + jenis);
        System.out.println("Harga Rp." + harga + " warna " + warna + " pcs Berhasil Ditambahkan");
        System.out.println("------------------------------------------------");
    }
    
    //Overloading
    public void toko(String jenis){
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("  | Data produk dengan jenis jilbab " + jenis + " telah diubah |");
        System.out.println("-----------------------------------------------------------");
    }
    
    //Abstract Method
    public abstract void DataToko();
}
