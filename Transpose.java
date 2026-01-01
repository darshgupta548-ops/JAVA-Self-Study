public class Transpose{
    public static void main(String[] args) {
            int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] nums2 = new int[nums[0].length][nums.length];  

            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums[i].length; j++){
                    nums2[i][j] = nums[j][i];
                }
            }

            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums[i].length; j++){
                System.out.print(nums2[i][j]+" ");
                }
            System.out.println();
            }
    }
}