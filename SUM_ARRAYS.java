public class SUM_ARRAYS{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int sum = 0, average;

        for(int i: nums){
            sum+=i;
        }
        
        average = sum / nums.length;

        System.out.println(sum);
        System.out.println(average);

    }

}