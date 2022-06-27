import java.util.ArrayList;

public class strArrayList {
    public static void main(String[] args) {
        System.out.println(character("", "abc"));
    }
    static ArrayList<String> character(String strNew, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(strNew);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> left = character(strNew + ch, str.substring(1));
        ArrayList<String> right = character(strNew, str.substring(1));

        left.addAll(right); // add all in left into the right
        return left;
    }
}
