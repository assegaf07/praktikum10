import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class create {

    // String inp(){
    //     Scanner nama = new Scanner();
    //     String iden = nama.nextInt(System.in)
    //     return iden;
    // }

    public static void main(String[] args) {
        
        Scanner nama = new Scanner(System.in);
        System.out.println("Masukkan nama file: ");
        String iden = nama.nextLine();

        try{
            File buatf = new File("file/"+iden+".txt");
            if(buatf.createNewFile()){
                System.out.println("File dibuat: "+iden+".txt");
            }else{
                System.out.println("FIle sudah ada");
            }
        }catch (IOException a){
            System.out.println("Error, file tidak dibuat.");
        }
    }
}