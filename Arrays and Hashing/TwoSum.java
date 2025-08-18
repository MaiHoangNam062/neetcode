import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array's length: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Target: ");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

        sc.close();
    }

}
