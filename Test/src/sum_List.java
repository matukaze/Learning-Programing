public class sum_List {

    public static void main(String[] args) {
        int[] nums = {3, 5, 8};
        System.out.println(sum_List(nums));
    }

    public static int sum_List(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
