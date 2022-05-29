public class SmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if(target >= letters[end]){
            return letters[start];
        }

        while(start <= end){
            int mid = start + ((end - start)/ 2);
            if (letters[mid] > target) {
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start];
    }

    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(letters, target));
    }
}

