import java.lang.reflect.Array;

public class LinearSearchInString {

    public static void main(String[] args) {


        String name = "Jayant";
        char target = 'a';

        for (int index = 0; index < name.length(); index++) {

            if (name.charAt(index) == target){
                System.out.println(index);
                return;
            }

        }


    }
}
