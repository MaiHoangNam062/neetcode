import java.util.Scanner;
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Array length: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Arrays: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.hasDuplicate(nums);
        System.out.println("Duplicate: " + result);

        sc.close();
    }
}