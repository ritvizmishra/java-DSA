public class Count {
    public static void main(String[] args) {
        System.out.println(permutationCount("", "abcd"));
    }
    static int permutationCount(String strNew, String str) {
        if (str.isEmpty()) {
            return 1;
        }
        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i <= strNew.length(); i++) {
            String first = strNew.substring(0, i);
            String second = strNew.substring(i, strNew.length());

            count = count + permutationCount(first + ch + second, str.substring(1));
        }
        return count;
    }
}
