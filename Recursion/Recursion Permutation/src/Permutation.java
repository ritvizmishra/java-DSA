public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
    }
    static void permutation(String strNew, String str){
        if(str.isEmpty()){
            System.out.print(strNew + " ");
            return;
        }
        char ch = str.charAt(0);

        for(int i = 0; i <= strNew.length(); i++){
            String first = strNew.substring(0, i);
            String second = strNew.substring(i, strNew.length());

            permutation(first + ch + second, str.substring(1));
        }
    }
}
