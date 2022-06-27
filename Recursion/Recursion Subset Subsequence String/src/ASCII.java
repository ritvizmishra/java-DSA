import java.util.ArrayList;

public class ASCII {
//    ASCII value along with chars
    public static void main(String[] args) {
//        subseqAscii("", "abc");
        character("", "abc");
        System.out.println();
        System.out.println(Character("", "abc"));
    }
//    static void subseqAscii(String p, String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        subseqAscii(p + ch, up.substring(1));
//        subseqAscii(p, up.substring(1));
//        subseqAscii(p + (ch+0), up.substring(1));
//    }
    static void character(String strNew, String str){
        if(str.isEmpty()){
            System.out.print(strNew + " ");
            return;
        }

        char ch = str.charAt(0);

        character(strNew + ch, str.substring(1));
        character(strNew, str.substring(1));
        character(strNew + (ch + 0), str.substring(1));

    }

//    In ArrayList

    static ArrayList<String> Character (String strNew, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(strNew);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> one = Character(strNew + ch, str.substring(1));
        ArrayList<String> two = Character(strNew, str.substring(1));
        ArrayList<String> three = Character(strNew + (ch + 0), str.substring(1));

        one.addAll(two);
        one.addAll(three);

        return one;
    }
}
