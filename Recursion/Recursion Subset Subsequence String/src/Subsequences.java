public class Subsequences {
//    in subsequence there are two choices - either take the char or ignore it. and whenever it becomes empty return it 
    public static void main(String[] args) {
        character("", "abc");
    }
    static void character(String strNew, String str){
        if(str.isEmpty()){
            System.out.print(strNew + " ");
            return;
        }
        char ch = str.charAt(0);
        
        character(strNew + ch, str.substring(1));
        character(strNew, str.substring(1));
    }
}
