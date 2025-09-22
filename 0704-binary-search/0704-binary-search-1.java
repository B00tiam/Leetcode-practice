class Solution {
    public int recur(int target, int left, int right, int[] nums) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (nums[mid] < target) {
            return recur(target, mid + 1, right, nums);
        }
        else if (nums[mid] > target) {
            return recur(target, left, mid - 1, nums);
        }
        else {
            return mid;
        }
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        return recur(target, left, right, nums);
    }
}