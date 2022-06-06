package com.ritviz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = {2,1,3,4,6,-3,-2,-4,-1};
        int[] num = {2,1,4,3,6,3,2,4,1};
        int[] brr = {2,2,3,2,7,8,7,8,7,8};

        oddEven(n);
        System.out.println("Number by itself: "+sumOfArrNum(arr));
        System.out.println("Unique: "+findUnique(num));
        System.out.println(numBit(n, 3));
        System.out.println(magicNum(3));
        System.out.println(digitInBase(10));
        System.out.println(pascalTriangle(7));
        System.out.println(exponent(3,6));
        System.out.println(setBits(11));
        System.out.println(XOR(6));
        System.out.println(xorAll(2,10));
    }
    static void oddEven(int n){
        if((n & 1) == 1){   // and n with 1 gives n itself, 1 = odd; 0 = even.
            System.out.println("ODD");
        }
        else{
            System.out.println("EVEN");
        }
    }
    static int sumOfArrNum(int[] arr){ // number that is by itself would be returned.
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    static int findUnique(int[] arr){  // XOR each number of array
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
    static int numBit(int n, int i){
        if(i < n){
            if((i & (1 << (i-1))) == 1){
                return 1;
            }
            return 0;
        }
       return -1;
    }
    static int magicNum(int n){
        int sum = 0;
        int base = 5;
        while((n) > 0){
            int last = n & 1; //last bit
            n = n >> 1; //for each bit
            sum += last * base; //sum
            base = base * 5; //increment base
        }
        return sum;
    }
    static int digitInBase(int n){
        int count = 0;
        while(n>0){
            n = n >> 1;
            count++;
        }
        return count;
    }
    static int pascalTriangle(int n){
         return (int)Math.pow(2,n-1);
    }
    static int exponent(int a, int b){
        return (int)Math.pow(a,b);
    }
    static int setBits(int n){
        int count = 0;
        while(n > 0){
            n = n >> 1;
            if((n & 1) == 1){
                count++;
            }
        }
        return count;
    }
    static int XOR(int a){
        int count = 0;
        int xor = 0;
        while(count <= a){
            xor ^= count;
            count++;
        }
        return xor;
    }
    static int xorAll(int a, int b) {
        int count = a;
        int xor = 0;
        while (count <= b) {
            xor ^= count;
            count++;
        }
        return xor;
    }
}
