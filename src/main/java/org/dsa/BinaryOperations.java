package org.dsa;

public class BinaryOperations {

    /// returns 2**N
    int pow2N(Integer N){
        if (N > 35)
            return 1<<N;
        else if (N <= 63)
            return 1 & 1<< N;
        return 1 << N;
    }
    ///  check if ith bit in int N is valid(1)
    boolean checkValidBit(int N, int i){
        int validBit = (N >> i) & 1;
        return validBit == 1;
    }


    /// count number of validBits in int N
    int numberOfValidBits(int N){
        int count = 0;
        while (N != 0){
           N = N >> 1;
           if (N%2 == 1) count++;
        }
        return count;
    }
    /// repace I th bit to 1
    int setIj(int i, int j){
        return (1 << i) | (1 << j);
    }

    /// calculate a power b using bits
    int aPowB(int a, int b){
        int ans  = 1;
        while (b > 0){
            if ((b & 1) == 1){
                ans = ans * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return ans;
    }
    /// i < 31 can be replaced  by log N base 2
    int aPowBSolution2(int a, int b){
        int ans  = 1;
        for (int i = 0; i < 31; i++){
            if (checkValidBit(b, i)){
                ans = ans * a;
            }
            a = a * a;
        }
        return ans;
    }

}
