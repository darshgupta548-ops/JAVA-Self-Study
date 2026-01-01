public class Num_Counter{
    public static void main(String[] args) {
        int[] nums={1,1,0,1,0,0,2,5,3,1,0,1};
        int count_0 =0, count_1 = 0;

        for(int i: nums){
            if(i == 1){
                count_1++;
            }
            if(i == 0){
                count_0++;
            }
        }
        System.out.println(count_1);
        System.out.println(count_0);
    }
}