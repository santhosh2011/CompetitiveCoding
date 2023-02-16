/***
Author: Santhosh Thota

Link : https://www.interviewbit.com/problems/pick-from-both-sides/

Question: 

Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.

 */

public class PickFromBothSides {
    public int solve(int[] A, int B) {
        int sum = 0;
        for(int i=0;i<B&&i<A.length;i++){
            sum+=A[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i=B-1,j=A.length-1;i>=0 &&j>0;i--,j--){
            sum -= A[i];
            sum += A[j];
            max = sum>max? sum: max;
        }
        return max;
    }

    public static void main(String[] args){
            System.out.println((new PickFromBothSides()).solve(new int[]{1,2,3,4,5,6,7,8,9,10},4));
    }
}
