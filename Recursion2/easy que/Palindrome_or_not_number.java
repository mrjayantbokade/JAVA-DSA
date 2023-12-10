public class Palindrome_or_not_number {
    //to check whether the number is palindrome or no
    //you just have to check if number is equal to the
    //reverse of itself

    public static boolean checkPalindrome(int num){
        if (num == Rev(0, num)){
            return true;
        }
        return false;
    }
    public static int Rev(int rev, int num){
        if (num == 0){
            return rev;
        }
        int rem = num % 10;
        rev  = rev * 10 + rem;

        return Rev(rev, num/10);

    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome(1234));
        System.out.println(checkPalindrome(1234321));
        System.out.println(checkPalindrome(0000));
        System.out.println(checkPalindrome(1111));
    }
}
