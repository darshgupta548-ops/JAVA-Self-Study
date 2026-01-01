public class Matrix_Multiply{
    public static void main(String[] args) {
        
        int[][] nums = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] nums2 = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] nums3 = new int[nums[0].length][nums.length];

        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                for(int k=0; k<nums[i].length; k++){
                    nums3[i][j] += nums[i][k]*nums2[k][j];
                }
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