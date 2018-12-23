public class TwoSum {
    public static void main(String[] args) {
        TwoSum s1 = new TwoSum();
        int a = 6;
        int[] res = s1.pick(new int [] {3, 2, 4}, a);
        for (int i: res)
            System.out.print(i);
    }

    private int[] pick(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int [] {i, j};
                }
            }
        }
        return null;
    }
}

// 有几种list？ list vs array vs array_list vs int[]