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
