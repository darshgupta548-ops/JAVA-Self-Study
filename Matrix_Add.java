public class Matrix_Add{
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nums3 = new int[3][3];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums3[i][j] = nums[i][j] + nums2[i][j];
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                System.out.print(nums3[i][j]+" ");
            }
            System.out.println();
        }
    }
}