package pack;

import java.io.File;
import java.io.IOException;

public class Fll {
    public static void main(String[] args) {
        File f = new File("soniyo.txt");




        if (f.exists()){
            System.out.println("file already exist");
        }
        else {
            try {
                f.createNewFile();
                if (f.createNewFile()){
                    System.out.println("file created "+f.getName());
                }
            }
            catch (IOException e){
                System.out.println("handled");
            }
        }

    }
}
