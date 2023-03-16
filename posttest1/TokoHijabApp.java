import java.util.Scanner;
import java.util.ArrayList;

class Hijab {
    String jenis;
    String warna;
    int harga;

    public Hijab(String jenis, String warna, int harga){
        this.jenis = jenis;
        this.warna = warna;
        this.harga = harga;
    }

    public String getJenis(){
        return jenis;
    }

    public String getWarna(){
        return warna;
    }

    public int getHarga(){
        return harga;
    }
}

public class TokoHijabApp {
    static ArrayList<Hijab> ListHijab;
    static Scanner input;
    static boolean isEditing = false;

    static void showMenu(){
        System.out.println("=== TOKO HIJAB ===");
        System.out.println("[1] Lihat List Hijab");
        System.out.println("[2] Tambah List Hijab");
        System.out.println("[3] Edit List Hijab");
        System.out.println("[4] Hapus List Hijab");
        System.out.println("[0] Keluar");
        System.out.println("----------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        if (selectedMenu.equals("1")){
            showList();
        } else if (selectedMenu.equals("2")){
            addList();
        } else if (selectedMenu.equals("3")){
            editList();
        } else if(selectedMenu.equals("4")){
            deleteList();
        } else if(selectedMenu.equals("0")){
            System.out.println("GoodBye :)");
            System.exit(0);
        } else {
            System.out.println("Kamu salah pilih Menu!");
            backToMenu();
        }
    }

    static void backToMenu(){
        System.out.println("");
        System.out.print("Tekan enter untuk kembali..");
        input.nextLine();
    }

    static void showList(){
        if(ListHijab.size()>0){
            System.out.println("----------------------");
            System.out.println("hijab Yang Tersedia:");
            int nomor = 1;
            for(Hijab hijab:ListHijab){
                System.out.println("["+nomor+"] \t"+hijab.getJenis());
                System.out.println("\tWarna Hijab: "+hijab.getWarna());
                System.out.println("\tHarga Hijab: "+hijab.getHarga());
                nomor++;
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if(!isEditing){
            backToMenu();
        }
    }

    static void addList(){
        System.out.print("Masukkan jenis hijab yang ingin anda inputkan: ");
        String jenis = input.nextLine();
        
        System.out.print("Masukkan warna hijab: ");
        String warna = input.nextLine();
        
        System.out.print("Masukkan harga hijab: ");
        int harga = Integer.parseInt(input.nextLine());
        
        ListHijab.add(new Hijab(jenis, warna, harga));

        showList();
    }

    static void editList(){
        isEditing = true;
        showList();

        System.out.println("----------------------");
        System.out.print("Pilih nomor yang ingin diubah> ");
        int index = Integer.parseInt(input.nextLine());

        if (index > ListHijab.size()){
            System.out.println("Nomor yang anda pilih tidak ada!");
            editList();
        } else {
            index -= 1;
            System.out.print("Masukkan jenis hijab yang ingin anda inputkan: ");
            String jenis = input.nextLine();
            
            System.out.print("Masukkan warna hijab: ");
            String warna = input.nextLine();
            
            System.out.print("Masukkan harga hijab: ");
            int harga = Integer.parseInt(input.nextLine());
            
            Hijab data = new Hijab(jenis, warna, harga);
            ListHijab.set(index, data);

            isEditing = false;
            showList();
        }
    }

    static void deleteList(){
        isEditing = true;
        showList();

        System.out.println("----------------------");
        System.out.print("Pilih nomor yang ingin dihapus> ");
        int index = Integer.parseInt(input.nextLine());

        if (index > ListHijab.size()){
            System.out.println("Nomor yang anda pilih tidak ada!");
            editList();
        } else {
            index -= 1;

            if (index < 0 || index >= ListHijab.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                ListHijab.remove(index);
                System.out.println("Data berhasil dihapus!");
            }
            isEditing = false;
            showList();
        }
    }

    public static void main(String[] args){
        ListHijab = new ArrayList<>();
        input  = new Scanner(System.in);
        while (true){
            showMenu();
        }
    }
}
