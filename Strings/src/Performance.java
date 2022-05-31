public class Performance {
    public static void main(String[] args) {
//        {SLOWER}
        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);

//        StringBuilder Class {FASTER}
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            string.append(ch);
        }
        System.out.println(string);
    }
}
