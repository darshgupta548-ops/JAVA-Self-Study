public class Insert {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int pos = 0;
        int value = 0;

        int[] result = new int[nums.length + 1];

        for (int i = 0; i < pos; i++) {
            result[i] = nums[i];
        }

        result[pos] = value;

        for (int i = pos; i < nums.length; i++) {
            result[i + 1] = nums[i];
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
