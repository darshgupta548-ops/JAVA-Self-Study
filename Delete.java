public class Delete{
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] nums2 = new int[nums.length - 1];
        int pos = 2;

        for (int i = 0; i < pos; i++){
            nums2[i] = nums[i];
        }
        
        for (int i = pos; i<nums2.length; i++){
            nums2[i] = nums[i+1];
        }

        for(int i : nums2){
            System.out.println(i);
        }
    }
}