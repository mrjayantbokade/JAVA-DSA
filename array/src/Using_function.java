import java.util.Arrays;

public class Using_function {
    public static void main(String[] args) {
        int prev[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(prev));
        after(prev);
        System.out.println(Arrays.toString(prev));


    }

    static void after(int num[]){
        num[0] = 22;
    }
}
