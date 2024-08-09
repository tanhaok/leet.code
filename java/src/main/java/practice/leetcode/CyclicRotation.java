package practice.leetcode;

import java.util.Arrays;

public class CyclicRotation {

    public static class Solution {
        public static int[] solution(int[] A, int K) {
            if (K <= 1) {
                return A;
            }
            int size = A.length;
            int[] result = new int[size];

            for(int i=0; i<size; i++) {
               int idx =  i + K;
               if (idx >= size) {
                   idx %= size;
               }
               result[idx] = A[i];
            }

            return result;
        }
    }

    public static void main(String[] args){
        int[] case1 = {1,2,3,4};
        System.out.println(Arrays.toString(Solution.solution(case1, 4)));

        int[] case2  = {1};
        System.out.println(Arrays.toString(Solution.solution(case2, 10)));
    }
}
