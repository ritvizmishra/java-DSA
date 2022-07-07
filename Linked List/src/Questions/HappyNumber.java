package Questions;

public class HappyNumber {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            fast = squareSum(squareSum(fast));
            slow = squareSum(slow);
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }

    public int squareSum(int n){
        int sum = 0;
        int temp = n;
        while(n > 0){
            temp = n % 10;
            sum += (int)Math.pow(temp, 2);
            n /= 10;
        }
        return sum;
    }

}
