package posttest5;

public final class Hijab extends ProdukToko {
    private String bahan;
    
     public final String namaProduk = "Hijab";
    
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
    
    @Override
    public void tambah(){
        System.out.println("\n------------------------------------------------");
        System.out.println("|  Produk " + this.namaProduk + " Berhasil Ditambahkan    |");
        System.out.println("------------------------------------------------");         
    }
    
    @Override
    public void edit(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.namaProduk + " Berhasil Diubah      |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void hapus(){
        System.out.println("\n-------------------------------------------------");
        System.out.println("|     Produk " + this.namaProduk + " Berhasil Dihapus     |");
        System.out.println("-------------------------------------------------");    
    }
    
    @Override
    public void DataToko(){
       System.out.println("Jenis Produk                    : " + getjenis());
       System.out.println("Warna                           : " + getwarna());
       System.out.println("Harga Produk                    : " + getharga());
       System.out.println("Bahan                           : " + bahan);
    }
    
}