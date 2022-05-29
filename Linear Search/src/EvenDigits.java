public class EvenDigits {
      static int digit(int num){
          if (num < 0) {
              num = num*-1;
          }
          if(num == 0){
              return 1;
          }
          int count = 0;
          while(num > 0){
              count++;
              num  = num/10;
          }
          return count;
  }
  static boolean even(int num){
     int n = digit(num);
     return n % 2 == 0;
  }
  static int findNum(int arr[]){
      int count = 0;
      for(int num : arr){
          if(even(num)){
              count++;
          }
      }
      return count;
  }

    public static void main(String[] args) {
        int[] arr = {12, 34, 34432, 3, 234, 3232};
        System.out.print("Number of elements with even digits: ");
        System.out.println(findNum(arr));
    }
}
