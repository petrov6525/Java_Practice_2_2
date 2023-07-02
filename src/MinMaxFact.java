public class MinMaxFact {

    public static int getMax(int ...nums){
        int max = nums[0];

        if(nums.length != 4){
            return -1;
        }

        for (int n: nums) {
            if (n > max){
                max = n;
            }
        }

        return max;
    }

    public static int getMin(int ...nums){
        int min = nums[0];

        if(nums.length != 4){
            return -1;
        }

        for (int n: nums) {
            if (n < min){
                min = n;
            }
        }

        return min;
    }

    public static long getFact(long n){
        long fact = 1;

        if(n == 0){
            return 0;
        }

        for(long i = 1; i <= n; i++){
            fact *= i;
        }

        return fact;
    }
}
