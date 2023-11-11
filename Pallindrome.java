package pack;

public class Pallindrome {



    public static int checkPallindrome(String name){


        int size = name.length() -1;


        for (int i=0; i<= size; i++){
            if(name.charAt(i) == name.charAt(size)){
                size--;
            }else {
                return 0;
            }
        }

        return 1;



//        int start = 0;
//        int end = Str.length-1;
//        while (end >= start){
//            if(Str[start] == Str[end]){
//                start++;
//                end--;
//                continue;
//
//            }else {
//                return 0;
//            }
//        }
//        return 1;
    }
    public static void main(String[] args) {




//        char [] Str = { 'a', 'c','c', 'a'};
//        int ans = checkPallindrome(Str);

        String name = "abba";
        int ans = checkPallindrome(name);
        if (ans == 1){
            System.out.println("Pallindrome");

        }else {
            System.out.println("Not a Pallindrome");
        }
    }
}
