package algorithms;

import java.util.ArrayList;

/**
 * @author lyh
 * @date 2019/10/30 0030
 **/
public class Binary {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = search(nums, target);
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length - 1);
    }

    public static int bs(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        if (start > end) {
            return -1;
        }
        return bs(nums, target, start, end);
    }
}
