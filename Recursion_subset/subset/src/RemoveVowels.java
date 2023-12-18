public class RemoveVowels {
    public static String kunalsWay(String word){

        if (word.isEmpty()){
            return "";
        }

        char i = word.charAt(0);
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
            return kunalsWay(word.substring(1));
        }else {
            return i + kunalsWay(word.substring(1));
        }
    }

    public static void main(String[] args){
    String name = "aeiouff";
     System.out.println(kunalsWay(name));

    }
}
