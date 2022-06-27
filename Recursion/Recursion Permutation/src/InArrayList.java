import java.util.ArrayList;

public class InArrayList {
    public static void main(String[] args) {
        System.out.println(permutation("", "abcd"));
    }
    static ArrayList<String> permutation(String strNew, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(strNew);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= strNew.length(); i++){
            String first = strNew.substring(0, i);
            String second = strNew.substring(i, strNew.length());


            ans.addAll(permutation(first + ch + second, str.substring(1)));
        }
        return ans;
    }
}
