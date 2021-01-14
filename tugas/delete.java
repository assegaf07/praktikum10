import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner nfile = new Scanner(System.in);
        System.out.println("Masukkan nama file yang ingin di baca: (ketikkan nama beserta format, ex: nama.txt)");
        String ini = nfile.nextLine();

        File del = new File("file/"+ini);
        
        if(del.exists()){
            del.delete();
            System.out.println("File "+ini+" telah dihapus");
        }else{
            System.out.println("File tidak ditemukan");
        }
    }    
}
