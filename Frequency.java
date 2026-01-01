public class Frequency {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        int count_0 = 0, count_1 = 0, count_2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count_0++;
            if (nums[i] == 1) count_1++;
            if (nums[i] == 2) count_2++;
        }

        System.out.println("0 -> " + count_0);
        System.out.println("1 -> " + count_1);
        System.out.println("2 -> " + count_2);
    }
}
