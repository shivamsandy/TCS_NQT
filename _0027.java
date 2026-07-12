public class _0027 {
    public static void main(String[] args) {
        String s = "i    love    java ";

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = s.split("\\s+");
            System.out.println(words.length);
        }
    }

}
