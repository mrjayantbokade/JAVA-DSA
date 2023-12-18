public class Main {
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "");
    }

    public static void printSubsequences(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + " : " + getAsciiValue(ans));
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSubsequences(ros, ans);
        printSubsequences(ros, ans + ch);
    }

    public static int getAsciiValue(String str) {
        int asciiValue = 0;
        for (int i = 0; i < str.length(); i++) {
            asciiValue += (int) str.charAt(i);
        }
        return asciiValue;
    }
}
