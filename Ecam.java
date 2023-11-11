package pack;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ecam {
    public static void main(String[] args) throws Exception {

        File f = new File("hell.txt");


        if (f.exists()){
            System.out.println("file already exist");
        }
        else {
            f.createNewFile();
            if (f.createNewFile()){
                System.out.println("file created");
            }
        }

    }


}
