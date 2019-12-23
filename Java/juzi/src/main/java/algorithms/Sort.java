package algorithms;

/**
 * @author lyh
 * @date 2019/11/08 0008
 **/
public class Sort {

    public int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int min = i;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[min] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[min];
                    nums[min] = temp;
                    min = j;
                } else {
                    break;
                }
            }
        }
        return nums;
    }

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int pivot = nums[i];
        while (i < j) {
            while (i < j && nums[j] >= pivot) {
                j--;
            }
            nums[i] = nums[j];
            while (i < j && nums[i] < pivot) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot;
        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);
    }

    public void out(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 3, 8, 9, 0, 2, 1, 4, 7};
        Sort sort = new Sort();
//        nums = new int[]{ 1,1, 2, 0};
        sort.quickSort(nums);
        sort.out(nums);
    }
}
