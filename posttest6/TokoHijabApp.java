package posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TokoHijabApp {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Hijab> hijab = new ArrayList<>();

   public static void main(String[] args) throws IOException{       
        
        while (true) {
            System.out.println("=== TOKO HIJAB ===");
            System.out.println("[1] Lihat List Hijab");
            System.out.println("[2] Tambah List Hijab");
            System.out.println("[3] Edit List Hijab");
            System.out.println("[4] Hapus List Hijab");
            System.out.println("[0] Keluar");
            System.out.println("----------------------");
            
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    tampilProduk();
                    break;
                case 2:
                    tambahProduk();
                    break;
                case 3:
                    ubahProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 0:   
                    keluar();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada!");
            }
        }
    }    
     
    static final void keluar(){
        System.out.println("\n=======================================");            
        System.out.println("|     TERIMA KASIH DATANG KEMBALI     |");
        System.out.println("======================================="); 
    } 
    
     public static void tambahProduk() throws IOException {

            System.out.println("-Masukan Data Jilbab-");            
            System.out.print("Masukkan Jenis Jilbab                   : ");
            String jenis = input.readLine();
        
            System.out.print("Masukkan warna                          : ");
            String warna = input.readLine();
        
            System.out.print("Masukkan Harga Jilbab                   : ");
            int harga = Integer.parseInt(input.readLine());
            
            System.out.print("Masukkan Bahan Jilbab                   : ");
            String bahan = input.readLine();
                  
            Hijab hjb = new Hijab(jenis, warna, harga, bahan);
            hijab.add(hjb);
            hjb.toko(jenis, harga);
            hjb.tambah();
            
    }
     
    public static void tampilProduk() throws IOException{

            System.out.println("-Data Jilbab-");  
            if (hijab.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < hijab.size();i++){
                System.out.println("\nProduk Ke-" + (i+1));
                hijab.get(i).DataToko();
                Hijab.ketentuan();
                    }
                }
                System.out.println("\n-------------------------------------------------");

    }     

    static void ubahProduk()throws IOException {
        
            if (hijab.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                
                 for(int i = 0; i < hijab.size();i++){
                    int nomor = i+1;
                    System.out.println("Hijab dengan nomor " + nomor);
                    
                    hijab.get(i).DataToko();
                    }
                 
                System.out.print("Masukkan nomor jilbab yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if (index <= hijab.size() || index > 0) {
                    
                    System.out.println("\n-Masukkan data jilbab yang baru-");
                    
                    System.out.print("Masukkan Jenis Jilbab              : ");                  
                    String jenis = input.readLine();
                    hijab.get(index-1).setjenis(jenis);
                    
                    System.out.print("Masukkan Warna                     : ");
                    String warna = input.readLine();
                    hijab.get(index-1).setwarna(warna);
                    
                    System.out.print("Masukkan Harga Produk              : ");
                    int harga = Integer.parseInt (input.readLine());
                    hijab.get(index-1).setharga(harga);
                    
                    System.out.print("Masukkan Bahan Jilbab              : ");
                    String bahan = input.readLine();
                    hijab.get(index-1).setBahan(bahan);                    
                    
                    hijab.get(index-1).toko(jenis);
                    hijab.get(index-1).edit();
                }else{
                    System.out.println("indeks tidak ditemukan");
                }
            }
    }
    
    static void hapusProduk() throws IOException{

            if (hijab.isEmpty()) {
                System.out.println("Belum ada produk yang tersimpan!");
            } else {
                
                for(int i = 0; i < hijab.size();i++){
                    int nomor = i + 1;

                    System.out.println("Hijab dengan nomor " + nomor);
                    
                    hijab.get(i).DataToko();
                }
                
                System.out.print("Masukkan nomor jilbab yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= hijab.size() || index > 0) 
                {
                    hijab.remove(index-1).hapus();
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        
    }
    
}