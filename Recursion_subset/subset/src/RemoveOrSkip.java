public class RemoveOrSkip {



    public static void kunalsWay2(String original, String ans){

        if (original.isEmpty()){
            System.out.println("ans = "+ans);
            return;
        }

        char i = original.charAt(0);
        if (i == 'a'){
            kunalsWay2(original.substring(1), ans);
        }else {
            kunalsWay2(original.substring(1), ans+i);
        }
    }
    public static String kunalsWay(String word){

        if (word.isEmpty()){
            return "";
        }

        char i = word.charAt(0);
        if (i == 'a'){
            return kunalsWay(word.substring(1));
        }else {
            return i + kunalsWay(word.substring(1));
        }
    }
    public static String remove2(String word, int index){

        if (index > word.length()-1){
            return "";
        }
        String ans = "";
        if (word.charAt(index) != 'a'){
             ans = ans + word.charAt(index);
        }


        return ans + remove2(word, index+1);
    }
    public static String remove(String word,String newString, int index){

        char currentchar = word.charAt(index);

        if (index == word.length()-1){

            if(word.charAt(index) != 'a'){
                return   newString + currentchar;

            }else {
                return newString;
            }
        }


        if ( currentchar != 'a'){
            newString = newString + currentchar;
        }



        return remove(word, newString, index+1);
    }

    public static String skipApple(String word){

        if (word.isEmpty()){
            return "";
        }


        if (word.startsWith("apple")){
            return skipApple(word.substring(5));
        }else {
            return word.charAt(0) + skipApple(word.substring(1));
        }
    }
    public static void main(String[] args) {

        String name = "jayant";
        String ans = "";
        String apple = "helloapplegg";

//        System.out.println(remove(name, ans, 0));
//        System.out.println(remove2(name, 0));
//        System.out.println(kunalsWay(name));
//        System.out.println(skipApple(apple));
        String outcome = skipApple(apple);

        System.out.println("outcome = " + outcome);

//        kunalsWay2(name,"");


    }

}
