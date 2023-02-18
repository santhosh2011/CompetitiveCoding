/***
 * Author - Santhosh Thota
 *
 * Link - https://www.interviewbit.com/old/problems/minimum-lights-to-activate/
 *
 *Question - There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.
 *
 * All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].
 *
 * Initially all lights are off.
 *
 * Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.
 */

import java.util.*;

public class MinimumLightstoActivate {
    public int solve(int[] A, int B) {
        try {
            return this.solveFromIndex(0, A, B, new HashMap<>());
        } catch (Exception e) {
            return -1;
        }
    }

    public int solveFromIndex(int index, int[] A, int B, Map<Integer, Integer> resultMap) throws Exception {
        if (index >= A.length) {
            return 0;
        }
        if (resultMap.get(index) != null) {
            return resultMap.get(index);
        }
        for (int i = B - 1; i > -B; i--) {
            if (index + i >= A.length || index+i <0) {
                continue;
            }
            if (A[index + i] == 1 ) {
                try {
                    int count = 1 + this.solveFromIndex(index + i + B, A, B, resultMap);
                    resultMap.put(index, count);
                    return count;
                } catch (Exception ignored) {
                }
            }
        }
        throw new Exception("Cannot find solution");

    }

    public static void main(String[] args) {
        System.out.println(new MinimumLightstoActivate().solve(new int[]{1, 1, 0, 0, 1, 1}, 1));
    }
}
