public class Reverse {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] cnums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            cnums[i] = nums[4 - i]; 
        }

        for (int x : cnums) {
            System.out.print(x + ", ");
        }
    }
}