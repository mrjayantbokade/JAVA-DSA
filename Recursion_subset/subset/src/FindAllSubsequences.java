public class FindAllSubsequences {

    public static void subseq(String unprocessed, String processed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        subseq(unprocessed.substring(1),  processed+unprocessed.charAt(0));

        subseq(unprocessed.substring(1), processed);

    }

    public static void main(String[] args) {
        subseq("abc", "");
    }
}
