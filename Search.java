public class Search{
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5};
        int n=4;

        System.out.println("The Following is the index of number 4");

        for(int i=0; i<nums.length; i++){
            if(nums[i]==n){
                System.out.println(i);
                break;
            }
        }
    }
}