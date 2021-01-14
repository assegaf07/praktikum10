import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class tulis{

    public static void main(String[] args) {

        Scanner nfile = new Scanner(System.in);
        System.out.println("Masukkan nama file yang ingin di isi: (ketikkan nama beserta format, ex: nama.txt)");
        String ini = nfile.nextLine();

        File cek = new File("file/"+ini);
        if(cek.exists()){
            System.out.println("FIle ada");
            Scanner masukkan = new Scanner(System.in);
            System.out.println("Masukkan yang ingin di tulis: ");
            String masuk = masukkan.nextLine();
                try{
                    FileWriter tul = new FileWriter("file/"+ini);
                    tul.write(masuk);
                    tul.close();
                    System.out.println("Berhasil di tulis");
                }catch (IOException e){
                    System.out.println("Gagal di tulis");
                }
        }else{
            System.out.println(" File tidak ada, silahkan buat file terlebiih dahulu");
        }
    }

}