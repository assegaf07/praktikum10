import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {

    public static void main(String[] args) {
        Scanner nfile = new Scanner(System.in);
        System.out.println("Masukkan nama file yang ingin di baca: (ketikkan nama beserta format, ex: nama.txt)");
        String ini = nfile.nextLine();
        
        try{
            File baca = new File("file/"+ini);
            Scanner readfile = new Scanner(baca);

            while(readfile.hasNextLine()){
                System.out.println(readfile.nextLine());
            }
        }catch (FileNotFoundException a){
            System.out.println("FIle tidak ada");
        }
        
    }
}
