public class Extremes{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int smallest, largest;
        smallest = largest = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
            else{
                smallest = nums[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}