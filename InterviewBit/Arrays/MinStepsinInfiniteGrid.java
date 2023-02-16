/***
Author: Santhosh Thota

Link: https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

Question : 

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x-1, y-1), 
    (x-1, y)  , 
    (x-1, y+1), 
    (x  , y-1),
    (x  , y+1), 
    (x+1, y-1), 
    (x+1, y)  , 
    (x+1, y+1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.

INPUT FORMAT:
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.


 */


import java.util.*;

public class MinStepsinInfiniteGrid {
    public int coverPoints(int[] A, int[] B) {
        int sum = 0;
        for(int i=1;i<A.length;i++){
            sum += Math.max(Math.abs(A[i]-A[i-1]),Math.abs(B[i]-B[i-1]));
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println((new MinStepsinInfiniteGrid()).coverPoints(new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}));
    }
}
